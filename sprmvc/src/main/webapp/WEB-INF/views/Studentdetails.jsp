<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<title>Spring MVC Hello World</title>
</head>

<body>
	<h2>All Students in System</h2>

	<table border="1">
		<tr>
			<th>Student Id</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<c:forEach items="${students}" var="student">
			<tr>
				<td>${student.id}</td>
				<td>${student.firstName}</td>
				<td>${student.lastName}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>