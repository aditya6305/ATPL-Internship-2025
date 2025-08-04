<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Login Page</title>
</head>
<body>
<center>
<h2>Login</h2>
<form action="LoginServlet_aditya" method="post">
<table border="1">
<tr>
<td colspan="2">Select Role:</td>
</tr>
<tr>
<td><input type="radio" name="role" value="admin" required> Admin</td>
<td><input type="radio" name="role" value="student"> Student</td>
</tr>
<tr>
<td>Username:</td>
<td><input type="text" name="username" required></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password" required></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Login"></td>
</tr>
</table>
</form>
<%
String msg = request.getParameter("message");
if (msg != null) {
%>
<p style="color:red;"><%= msg %></p>
<% } %>
</center>
</body>
</html>
