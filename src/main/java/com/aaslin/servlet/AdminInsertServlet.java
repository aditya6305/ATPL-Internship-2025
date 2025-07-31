package com.aaslin.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.aaslin.util.DBUtil;

public class AdminInsertServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//using postman
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        String role = request.getParameter("role");
        String is_active = request.getParameter("is_active");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int age = Integer.parseInt(ageStr);
            
            boolean active = Boolean.parseBoolean(is_active);
            Connection conn = DBUtil.getConnection();
            String query = "INSERT INTO admins_aditya (name, age, role, is_active) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, role);
            stmt.setBoolean(4, active);
            stmt.executeUpdate();

            out.println("<h3>User inserted successfully.</h3>");

            stmt.close();
            conn.close();

        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
