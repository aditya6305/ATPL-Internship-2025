package com.aaslin.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import com.aaslin.util.DBUtil;
public class AdminDeleteServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*After running the servlet http://localhost:8080/Web_project/deleteadmin it provides this url and it doesn't delete the record from the DB because it is post method.
	 * If we want to delete it we need to provide the valid parameters of the admin ?name=aditya&age=25&role=Super Admin.
	*/
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        String ageParam = req.getParameter("age");
        String role = req.getParameter("role");

        if (name == null || ageParam == null || role == null) {
            out.println("<h3>Missing parameters: name, age, or role.</h3>");
            return;
        }

        int age = Integer.parseInt(ageParam);

        try (Connection con = DBUtil.getConnection()) {
            String sql = "DELETE FROM admins_aditya WHERE name = ? AND age = ? AND role = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, role);

            int deleted = ps.executeUpdate();

            if (deleted > 0) {
                out.println("<h3>Admin record deleted successfully.</h3>");
            } else {
                out.println("<h3>No matching record found.</h3>");
            }

            ps.close();
        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
            e.printStackTrace(out);
        }
    }
}
