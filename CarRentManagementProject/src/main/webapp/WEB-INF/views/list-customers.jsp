<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Customer Id</th>
					<th>Customer Name</th>
					<th>Address</th>
					<th>Mobile No</th>
					<th>gender</th>
					<th>Blood Group</th>
					<th>Person Type</th>
					<th>Joining Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="cus" items="${allcustomers}">
					<tr>
						<td>${cus.customerId}</td>
						<td>${cus.customer_Name}</td>
						<td>${cus.address}</td>
						<td>${cus.mobile_No}</td>
						<td>${cus.gender}</td>
						<td>${cus.blood_Group}</td>
						<td>${cus.person_Type}</td>
						<td>${cus.joining_Date}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>