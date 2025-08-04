package controller;

import dao.AdminDAO_aditya;
import dao.StudentLoginDAO_aditya;
import model.Student_aditya;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet_aditya extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String role = request.getParameter("role");
        String username = request.getParameter("username").trim();
        String password = request.getParameter("password").trim();
        
        HttpSession session = request.getSession();
        
        if ("admin".equalsIgnoreCase(role)) {
            AdminDAO_aditya adminDAO = new AdminDAO_aditya();
            if (adminDAO.validateAdmin(username, password)) {
                session.setAttribute("username", username);
                session.setAttribute("role", "admin");
                response.sendRedirect("StudentServlet_aditya");
            } else {
                response.sendRedirect("login_aditya.jsp?message=Invalid+admin+credentials");
            }
        } else if ("student".equalsIgnoreCase(role)) {
            StudentLoginDAO_aditya dao = new StudentLoginDAO_aditya();
            Student_aditya student = dao.findStudentByRollno(username);
            
            if (student == null) {
                response.sendRedirect("login_aditya.jsp?message=Invalid+username");
            } else if (!student.getPassword().equals(password)) {
                response.sendRedirect("login_aditya.jsp?message=Invalid+password");
            } else if (!student.isActive()) {
                response.sendRedirect("login_aditya.jsp?message=Account+inactive+contact+admin");
            } else {
                session.setAttribute("username", student.getName());
                session.setAttribute("role", "student");
                session.setAttribute("studentId", student.getId());
                response.sendRedirect("student_dashboard.jsp");
            }
        }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("login_aditya.jsp").forward(request, response);
    }
}
