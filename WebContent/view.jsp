<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<h2>Student Table Info</h2>
<hr>
<br/>
<body>

<table border=1>

<tr>
	<th>FirstName</th>
	<th>LastName</th>
	<th>E-mail</th>
</tr>
	<c:forEach var="tempStudent" items="${stud}">
	<tr>
	<td>${tempStudent.fname}</td>
    <td>${tempStudent.lname}</td>
	<td>${tempStudent.email}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>