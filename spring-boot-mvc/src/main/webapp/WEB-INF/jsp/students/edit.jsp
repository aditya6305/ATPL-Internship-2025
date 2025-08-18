<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Student</title>
</head>
<body>
<h2>Edit Student</h2>

<form:form method="post" modelAttribute="student">
    <table>
        <tr>
            <td><form:label path="id">ID:</form:label></td>
            <td><form:input path="id" disabled="true"/></td>
        </tr>
        <tr>
            <td><form:label path="name">Name:</form:label></td>
            <td><form:input path="name" /></td>
            <td><form:errors path="name" cssClass="error" /></td>
        </tr>
        <tr>
            <td><form:label path="email">Email:</form:label></td>
            <td><form:input path="email" /></td>
            <td><form:errors path="email" cssClass="error" /></td>
        </tr>
        <tr>
            <td><form:label path="age">Age:</form:label></td>
            <td><form:input path="age" type="number" /></td>
            <td><form:errors path="age" cssClass="error" /></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Update Student"/>
                <a href="${pageContext.request.contextPath}/students">Cancel</a>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
