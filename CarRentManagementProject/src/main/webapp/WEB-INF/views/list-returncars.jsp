<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Return Cars List</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Car RegistrationNo</th>
					<th>Customer Id</th>
					<th>From Date</th>
					<th>Due Date</th>
					<th>Pay Elapsed</th>
					<th>Car Fine</th>
					<th>Total Fee</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ret" items="${allreturncars}">
					<tr>
						<td>${ret.carRegno}</td>
						<td>${ret.customerId}</td>
						<td>${ret.fromDate}</td>
						<td>${ret.dueDate}</td>
						<td>${ret.payElapsed}</td>
						<td>${ret.carFine}</td>
						<td>${ret.totalFee}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
