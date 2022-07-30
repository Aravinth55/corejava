<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Rental List</title>
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
					<th>Retail Fee</th>
					<th>Fuel Level</th>
					<th>Working Condition</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ren" items="${allcarrentals}">
					<tr>
						<td>${ren.carRegNo}</td>
						<td>${ren.customerId}</td>
						<td>${ren.fromDate}</td>
						<td>${ren.dueDate}</td>
						<td>${ren.retailFee}</td>
						<td>${ren.fuelLevel}</td>
						<td>${ren.workingCondition}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
