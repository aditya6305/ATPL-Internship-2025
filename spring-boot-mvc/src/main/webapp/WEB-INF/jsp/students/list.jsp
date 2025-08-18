<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<h2>Students</h2>

<a href="${pageContext.request.contextPath}/students/new">Add New Student</a>

<table border="1" cellpadding="8" cellspacing="0">
    <thead>
    <tr>
        <th>ID</th><th>Name</th><th>Email</th><th>Age</th><th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td><a href="${pageContext.request.contextPath}/students/${student.id}">${student.name}</a></td>
            <td>${student.email}</td>
            <td>${student.age}</td>
            <td>
                <a href="${pageContext.request.contextPath}/students/${student.id}/edit">Edit</a> |
                <form action="${pageContext.request.contextPath}/students/${student.id}/delete" method="post" style="display:inline;">
                    <button type="submit" onclick="return confirm('Delete this student?');">Delete</button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
