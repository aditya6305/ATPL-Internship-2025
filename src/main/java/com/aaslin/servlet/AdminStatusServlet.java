package com.aaslin.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import com.aaslin.util.DBUtil;
public class AdminStatusServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String idParam = req.getParameter("id");
        String activeParam = req.getParameter("active");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        if (idParam == null || activeParam == null) {
            out.println("<h3>Missing 'id' or 'active' parameter.</h3>");
            return;
        }

        try {
            int id = Integer.parseInt(idParam);
            int active = Integer.parseInt(activeParam);

            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE users SET is_active = ? WHERE id = ?");
            ps.setInt(1, active);
            ps.setInt(2, id);

            ps.executeUpdate();

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doPost(req, res);
    }

}
