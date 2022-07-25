<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Doctor By Id</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="get" modelAttribute="finddoctorbyid">
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
				</div>
				<div>
					
					</div>
				</div>
				</form:form>
			</div>
		</div>
</body>
</html>