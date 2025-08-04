package controller;

import dao.StudentDAO_aditya;
import model.Student_aditya;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class StudentEditServlet_aditya extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Student_aditya student = new Student_aditya();
        student.setId(Integer.parseInt(request.getParameter("id")));
        student.setStudent_rollno(request.getParameter("rollno"));
        student.setName(request.getParameter("name"));
        student.setAge(Integer.parseInt(request.getParameter("age")));
        student.setGrade(request.getParameter("grade"));
        student.setMobile(request.getParameter("mobile"));
        
        StudentDAO_aditya dao = new StudentDAO_aditya();
        dao.updateStudent(student);
        response.sendRedirect("StudentServlet_aditya");
    }
}
