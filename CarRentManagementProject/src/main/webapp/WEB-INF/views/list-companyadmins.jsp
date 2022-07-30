<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CompanyAdmin List</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>User Id</th>
					<th>User Name</th>
					<th>User Password</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="cmad" items="${allcompanyadmins}">
					<tr>
						<td>${cmad.userId}</td>
						<td>${cmad.userName}</td>
						<td>${cmad.userPassword}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
