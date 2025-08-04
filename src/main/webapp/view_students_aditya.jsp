<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.Student_aditya" %>
<html>
<head>
<title>Admin Dashboard</title>
</head>
<body>
<%
String role = (String) session.getAttribute("role");
if (role == null || !"admin".equals(role)) {
    response.sendRedirect("login_aditya.jsp?message=Please+login+as+admin");
    return;
}
String msg = request.getParameter("msg");
String searchTerm = (String) request.getAttribute("searchTerm");
%>
<center>
<h2>Admin Dashboard - All Students</h2>
<a href="LogoutServlet_aditya">Logout</a>
<br><br>
<% if ("statusChanged".equals(msg)) { %>
<p style="color:green;">Student status changed successfully!</p>
<% } %>
<form action="StudentServlet_aditya" method="get">
<input type="hidden" name="action" value="search">
Search: <input type="text" name="rollno" placeholder="Enter roll number" value="<%= searchTerm != null ? searchTerm : "" %>">
<input type="submit" value="Search">
<a href="StudentServlet_aditya">Show All</a>
<a href="add_student_aditya.jsp">Add New Student</a>
</form>
<br>
<% if (searchTerm != null && !searchTerm.trim().isEmpty()) { %>
<p><b>Search Results for: "<%= searchTerm %>"</b></p>
<% } %>
<table border="1">
<tr>
<th>ID</th><th>Roll No</th><th>Name</th><th>Age</th><th>Grade</th><th>Mobile</th><th>Status</th><th>Actions</th>
</tr>
<%
List<Student_aditya> students = (List<Student_aditya>) request.getAttribute("students");
if (students == null || students.isEmpty()) {
%>
<tr><td colspan="8">
<% if (searchTerm != null && !searchTerm.trim().isEmpty()) { %>
No students found for roll number: "<%= searchTerm %>"
<% } else { %>
No students found.
<% } %>
</td></tr>
<%
} else {
for (Student_aditya s : students) {
%>
<tr style="<%= s.isActive() %>">
<td><%= s.getId() %></td>
<td><%= s.getStudent_rollno() %></td>
<td><%= s.getName() %></td>
<td><%= s.getAge() %></td>
<td><%= s.getGrade() %></td>
<td><%= s.getMobile() != null ? s.getMobile() : "Enter valid number" %></td>
<td><b style="color: <%= s.isActive() ? "" : "" %>"><%= s.isActive() ? "ACTIVE" : "INACTIVE" %></b></td>
<td>
<a href="StudentServlet_aditya?action=edit&id=<%= s.getId() %>">Edit</a>
<a href="StudentServlet_aditya?action=toggleStatus&id=<%= s.getId() %>" onclick="return confirm('Change student status from <%= s.isActive() ? "ACTIVE to INACTIVE" : "INACTIVE to ACTIVE" %>?')">
<%= s.isActive() ? "Deactivate" : "Activate" %>
</a>
</td>
</tr>
<%
}
}
%>
</table>
<br>
</center>
</body>
</html>
