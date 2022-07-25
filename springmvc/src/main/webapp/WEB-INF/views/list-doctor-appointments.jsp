<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Appointments</title>
</head>
<body>
	<div id="root">
		<div id="docform">
			<form:form action="" method="post" modelAttribute="getdoc">
				<div>
				<label for="ID">Doctor Id</label>
				<div>
					<form:input path="ID" readonly="true"/>
				</div>
			</div>
			<div>
				<label for="NAME">Doctor Name</label>
				<div>
					<form:input path="NAME" readonly="true"/>
				</div>
			</div>
			<div>
				<label for="DOB">DOB</label>
				<div>
					<form:input path="DOB" readonly="true"/>
				</div>
			</div>
			<div>
				<label for="SPACIALITY">Speciality</label>
				<div>
					<form:input path="SPACIALITY" readonly="true"/>
				</div>
			</div>
			<div>
				<label for="CITY">City</label>
				<div>
					<form:input path="CITY" readonly="true"/>
				</div>
			</div>
			<div>
				<label for="PHONE_NO">Phone no</label>
				<div>
					<form:input path="PHONE_NO" readonly="true"/>
				</div>
			</div>
			<div>
				<label for="STANDARD_FEES">Standard fees</label>
				<div>
					<form:input path="STANDARD_FEES" readonly="true"/>
				</div></div>
			</form:form>
		</div>
		<div id="applist">
		<table>
			<thead>
				<tr>
					<th>Appointment Id</th>
					<th>Appointment Date</th>
					<th>Doctor Id</th>
					<th>Patient Name</th>
					<th>Fees</th>
					<th>Fees Nature</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="app" items="${applist}">
					<tr>
						<td>${app.app_id}</td>
						<td>${app.app_date}</td>
						<td>${app.id}</td>
						<td>${app.patient_name}</td>
						<td>${app.fees_collected}</td>
						<td>${app.fees_nature}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
</body>
</html>