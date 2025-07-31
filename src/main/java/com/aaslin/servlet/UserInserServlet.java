package com.aaslin.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.aaslin.util.DBUtil;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserInserServlet extends HttpServlet {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html><body>");
        pw.println("<h3> Registration Form</h3>");
        pw.println("<form method='post' action = 'usersinfo'>");
        pw.println("Name: <input type='text' name='name'><br>");
        pw.println("Email: <input type='email' name='email'><br>");
        pw.println("Age: <input type='number' name='age'><br>");
        pw.println("<input type='submit' value='Register'>");
        pw.println("</form>");
        pw.println("</body></html>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        int age = Integer.parseInt(req.getParameter("age"));
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DBUtil.getConnection();

	            String sql = "INSERT INTO Users_Aditya (name, email, age) VALUES (?, ?, ?)";
	            PreparedStatement stmt = con.prepareStatement(sql);
	            stmt.setString(1, name);
	            stmt.setString(2, email);
	            stmt.setInt(3, age);

	            stmt.executeUpdate();

	            stmt.close();
	            con.close();
    }  
      catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

