<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dao.StudentDAO_aditya" %>
<%@ page import="model.Student_aditya" %>
<html>
<head>
<title>Student Dashboard</title>
</head>
<body>
<%
String role = (String) session.getAttribute("role");
Integer studentId = (Integer) session.getAttribute("studentId");
if (role == null || !"student".equals(role) || studentId == null) {
    response.sendRedirect("login_aditya.jsp?message=Please+login+as+student");
    return;
}
StudentDAO_aditya dao = new StudentDAO_aditya();
Student_aditya student = dao.getStudentById(studentId);
if (student == null) {
    response.sendRedirect("login_aditya.jsp?message=Student+not+found");
    return;
}
%>
<center>
<h2>Student Dashboard</h2>
<p style="color:green;">Welcome, <%= student.getName() %>!</p>
<table border="1">
<tr><td>Roll Number:</td><td><%= student.getStudent_rollno() %></td></tr>
<tr><td>Name:</td><td><%= student.getName() %></td></tr>
<tr><td>Age:</td><td><%= student.getAge() %></td></tr>
<tr><td>Grade:</td><td><%= student.getGrade() %></td></tr>
<tr><td>Mobile:</td><td><%= student.getMobile() != null ? student.getMobile() : "Not provided" %></td></tr>
</table>
<br>
<a href="LogoutServlet_aditya">Logout</a>
</center>
</body>
</html>
