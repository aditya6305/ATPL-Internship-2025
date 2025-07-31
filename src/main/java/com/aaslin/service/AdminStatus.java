package com.aaslin.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.aaslin.util.DBUtil;

public class AdminStatus extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*After running the code it will go and execute service method in service we are just giving the parameters of the code. 
	 * so if we want to update then we need the active status of a user for that in the url we need to give the parameters 
	 * http://localhost:8080/Web_project/adminstatus(The url you get after running)   (parameters we need to pass) ?is_active=true&id=2 
	
	*/
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String adminid = request.getParameter("id");
        String adminactive = request.getParameter("is_active");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int id = Integer.parseInt(adminid);
            boolean is_active = Boolean.parseBoolean(adminactive);

            Connection conn = DBUtil.getConnection();
            String query = "UPDATE admins_aditya SET is_active = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);         
            
            stmt.setBoolean(1, is_active);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            
            stmt.close();
            conn.close();
        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
}
