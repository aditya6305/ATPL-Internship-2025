<!DOCTYPE html>
<html>
<head>
    <title>View Student</title>
</head>
<body>
<h2>Student Details</h2>

<p><strong>ID:</strong> ${student.id}</p>
<p><strong>Name:</strong> ${student.name}</p>
<p><strong>Email:</strong> ${student.email}</p>
<p><strong>Age:</strong> ${student.age}</p>

<a href="${pageContext.request.contextPath}/students/${student.id}/edit">Edit</a> | 
<a href="${pageContext.request.contextPath}/students">Back to List</a>

</body>
</html>
