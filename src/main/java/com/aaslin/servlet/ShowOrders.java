package com.aaslin.servlet;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.aaslin.util.DBUtil;

public class ShowOrders extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html><head><title>All Orders</title></head><body>");
        out.println("<h2>Order List</h2>");

        try {
            Connection conn = DBUtil.getConnection();
            String sql = "SELECT order_date, item_id, quantity FROM orders_aditya ORDER BY order_date DESC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String date = rs.getString("order_date");
                int itemId = rs.getInt("item_id");
                int qty = rs.getInt("quantity");

                out.println("Order Date:" +date+"<br>");
                out.println("Item ID" + itemId+"<br>" );
                out.println("Quantity" + qty);
                out.println("<hr>");
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            out.println  (e.getMessage());
        }
        out.println("</body></html>");
    }
}