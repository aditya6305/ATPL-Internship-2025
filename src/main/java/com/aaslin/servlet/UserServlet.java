package com.aaslin.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserServlet extends HttpServlet {
       /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	   Map<String, String> users = new HashMap<>();
       {
       users.put("1","Aditya");
       users.put("2", "Jerusha");
       users.put("3", "Harika");
       }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		response.setContentType("text/html");
		// After running in the url it will display like this we need to add the parameter based on which we need to get the data  http://localhost:8080/Web_project/users
		//http://localhost:8080/Web_project/users?id=1
		PrintWriter pw = response.getWriter();
		if(id != null && users.containsKey(id)) {
			pw.println("<h2>ID: "+id+"</h2>");
			pw.println("<h2>Name: "+users.get(id)+"</h2>");
			
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("/error.html");
			rd.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
