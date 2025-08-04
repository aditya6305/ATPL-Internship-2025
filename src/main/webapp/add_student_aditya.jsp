<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Add Student</title>
</head>
<body>
<center>
<h2>Add New Student</h2>
<form action="StudentServlet_aditya" method="post">
<input type="hidden" name="action" value="add">
<table border="1">
<tr><td>Roll Number:</td><td><input type="text" name="rollno" required></td></tr>
<tr><td>Name:</td><td><input type="text" name="name" required></td></tr>
<tr><td>Age:</td><td><input type="number" name="age" required></td></tr>
<tr><td>Grade:</td><td><input type="text" name="grade" required></td></tr>
<tr><td>Mobile:</td><td><input type="text" name="mobile" required></td></tr>
<tr><td>Password:</td><td><input type="password" name="password" required></td></tr>
<tr><td>Active Status:</td><td><input type="checkbox" name="isActive" checked> </td></tr>
</table>
<br>
<input type="submit" value="Add Student">
<input type="button" value="Cancel" onclick="window.location='StudentServlet_aditya'">
</form>
</center>
</body>
</html>
