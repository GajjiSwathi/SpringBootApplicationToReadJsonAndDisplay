<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>

	<h1>Welcome Users</h1>


	<table>
		<tr border="5">

			<th>Langitude</th>
			<th>Lattitude</th>
			<th>Company Name</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td><c:out value="${user.address.geo.lat}" /></td>


				<td><c:out value="${user.address.geo.lng}" /></td>


				<td><c:out value="${user.company.name}" /></td>
			</tr>
		</c:forEach>
	</table>






</body>
</html>