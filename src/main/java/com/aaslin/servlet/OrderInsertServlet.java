package com.aaslin.servlet;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.aaslin.util.*;

public class OrderInsertServlet extends HttpServlet {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String itemIdParam = req.getParameter("item_id");
        String qtyParam = req.getParameter("quantity");

        try {
            int item_id = Integer.parseInt(itemIdParam);
            int quantity = Integer.parseInt(qtyParam);

            Connection conn = DBUtil.getConnection();

            String sql = "INSERT INTO orders_aditya (item_id, quantity, order_date) VALUES (?, ?, NOW())";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, item_id);
            ps.setInt(2, quantity);

            int rows = ps.executeUpdate();

            if (rows > 0) {             
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT NOW() as order_date");
                String orderDate = "";
                if (rs.next()) {
                    orderDate = rs.getString("order_date");
                }

                out.println("<html><body>");
                out.println("<h2>Order placed successfully!</h2>");
                out.println("<p>Order Date: " + orderDate + "</p>");
                out.println("<p>Item ID:" + item_id + "</p>");
                out.println("<p>Quantity:  " + quantity + "</p>");
                out.println("</body></html>");

                rs.close();
                stmt.close();
            } else {
                out.println("<html><body><h3>Order insertion failed!</h3></body></html>");
            }

            ps.close();
            conn.close();

        } catch (Exception e) {
            out.println("<p><strong>Error:</strong> " + e.getMessage() + "</p>");
        }
    }
}