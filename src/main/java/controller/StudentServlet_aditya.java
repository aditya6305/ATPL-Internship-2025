package controller;

import dao.StudentSearchDAO_aditya;
import dao.StudentDAO_aditya;
import model.Student_aditya;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class StudentServlet_aditya extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        StudentSearchDAO_aditya searchDAO = new StudentSearchDAO_aditya();
        StudentDAO_aditya dao = new StudentDAO_aditya();
        
        if ("edit".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            Student_aditya student = searchDAO.getById(id);
            request.setAttribute("student", student);
            request.getRequestDispatcher("edit_student_aditya.jsp").forward(request, response);
            
        } else if ("toggleStatus".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            dao.status(id);
            response.sendRedirect("StudentServlet_aditya?msg=statusChanged");
            
        } else if ("search".equals(action)) {
            String rollno = request.getParameter("rollno");
            List<Student_aditya> students = searchDAO.searchByRollno(rollno);
            request.setAttribute("students", students);
            request.setAttribute("searchTerm", rollno);
            request.getRequestDispatcher("view_students_aditya.jsp").forward(request, response);
            
        } else {
            List<Student_aditya> students = searchDAO.getAllStudents();
            request.setAttribute("students", students);
            request.getRequestDispatcher("view_students_aditya.jsp").forward(request, response);
        }
    }
}
