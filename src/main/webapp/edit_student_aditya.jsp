<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.Student_aditya" %>
<html>
<head>
<title>Edit Student</title>
</head>
<body>
<%
Student_aditya s = (Student_aditya) request.getAttribute("student");
if (s == null) {
    out.println("<p>Student not found.</p>");
    return;
}
%>
<center>
<h2>Edit Student</h2>
<form action="StudentServlet_aditya" method="post">
<input type="hidden" name="action" value="update">
<input type="hidden" name="id" value="<%= s.getId() %>">
<input type="hidden" name="password" value="<%= s.getPassword() %>">
<table border="1">
<tr><td>Roll Number:</td><td><input type="text" name="rollno" value="<%= s.getStudent_rollno() %>" readonly></td></tr>
<tr><td>Name:</td><td><input type="text" name="name" value="<%= s.getName() %>" required></td></tr>
<tr><td>Age:</td><td><input type="number" name="age" value="<%= s.getAge() %>" required></td></tr>
<tr><td>Grade:</td><td><input type="text" name="grade" value="<%= s.getGrade() %>" required></td></tr>
<tr><td>Mobile:</td><td><input type="text" name="mobile" value="<%= s.getMobile() != null ? s.getMobile() : "" %>" required></td></tr>
<tr><td>Current Status:</td><td><b style="color: <%= s.isActive() ? "" : "" %>"><%= s.isActive() ? "ACTIVE" : "INACTIVE" %></b></td></tr>
</table>
<br>
<input type="submit" value="Update Student">
<input type="button" value="Cancel" onclick="window.location='StudentServlet_aditya'">
</form>
</center>
</body>
</html>
