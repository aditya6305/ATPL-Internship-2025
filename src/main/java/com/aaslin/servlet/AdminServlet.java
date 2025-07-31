package com.aaslin.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;
import com.aaslin.util.DBUtil;
public class AdminServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        String role = request.getParameter("role");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(id == null|| role==null) {
        	out.println("<h3> Access Denied</h3>");
        }
        int userId;
        try {
            userId = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            out.println("<h3>Invalid User ID format</h3>");
            out.println("</body></html>");
            return;
        }

        try {
            Connection conn = DBUtil.getConnection();
            String query = "SELECT id, name, age FROM users_Aditya WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, userId);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                out.println("<h3>User Info:</h3>");
                out.println("ID: " + rs.getInt("id") + "<br>");
                out.println("Name: " + rs.getString("name") + "<br>");
                out.println("Age: " + rs.getInt("age") + "<br>");
            } else {
                out.println("<h3>User not found with ID: " + id + "</h3>");
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
            e.printStackTrace(out);
        }

        out.println("</body></html>");
    }
}
