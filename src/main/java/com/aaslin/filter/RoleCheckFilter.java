package com.aaslin.filter;

import java.io.IOException;
import javax.servlet.*;

public class RoleCheckFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        String role = request.getParameter("role");

        if ("admin".equalsIgnoreCase(role)) {
            chain.doFilter(request, response);
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<h3>Access Denied: Admin role required</h3>");
        }
    }
}
