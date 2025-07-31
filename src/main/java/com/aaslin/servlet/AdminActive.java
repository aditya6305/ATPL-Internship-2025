package com.aaslin.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

import com.aaslin.util.DBUtil;
public class AdminActive extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try (Connection con = DBUtil.getConnection()) {
            String sql = "SELECT * FROM admins_aditya WHERE is_active = true";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            out.println("<html><body><h2>Active Admin Users:</h2>");
            boolean hasResults = false;

            while (rs.next()) {
                hasResults = true;
                out.println("<p>");
                out.println("ID: " + rs.getInt("id") + "<br>");
                out.println("Name: " + rs.getString("name") + "<br>");
                out.println("Age: " + rs.getInt("age") + "<br>");
                out.println("Role: " + rs.getString("role") + "<br>");
                out.println("</p><hr>");
            }

            if (!hasResults) {
                out.println("<p>No active users found.</p>");
            }

            out.println("</body></html>");
            rs.close();
            ps.close();
        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
}
