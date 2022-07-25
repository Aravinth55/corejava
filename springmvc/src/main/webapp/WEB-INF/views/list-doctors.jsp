<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor List</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Doctor Id</th>
					<th> Name</th>
					<th>DOB</th>
					<th>Speciality</th>
					<th>City</th>
					<th>Phone no</th>
					<th>standard fees</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="doc" items="${alldoctors}">
					<tr>
						<td>${doc.ID}</td>
						<td>${doc.NAME}</td>
						<td>${doc.DOB}</td>
						<td>${doc.SPACIALITY}</td>
						<td>${doc.CITY}</td>
						<td>${doc.PHONE_NO}</td>
						<td>${doc.STANDARD_FEES}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>