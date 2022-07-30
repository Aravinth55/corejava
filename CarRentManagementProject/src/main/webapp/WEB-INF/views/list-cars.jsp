<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car List</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Car RegistrationNo</th>
					<th>Owner Id</th>
					<th>Car Model</th>
					<th>Car Color</th>
					<th>Fuel Type</th>
					<th>Car Capacity</th>
					<th>Car Available</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="car" items="${allcars}">
					<tr>
						<td>${car.carRegno}</td>
						<td>${car.ownerId}</td>
						<td>${car.carModel}</td>
						<td>${car.carColour}</td>
						<td>${car.fuelType}</td>
						<td>${car.carCapacity}</td>
						<td>${car.carAvailable}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
