<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="adddoctor">
			<div>
				<label for="ID">Doctor Id</label>
				<div>
					<form:input path="ID"/>
				</div>
			</div>
			<div>
				<label for="NAME">Doctor Name</label>
				<div>
					<form:input path="NAME"/>
				</div>
			</div>
			<div>
				<label for="DOB">DOB</label>
				<div>
					<form:input path="DOB"/>
				</div>
			</div>
			<div>
				<label for="SPACIALITY">Speciality</label>
				<div>
					<form:input path="SPACIALITY"/>
				</div>
			</div>
			<div>
				<label for="CITY">City</label>
				<div>
					<form:input path="CITY"/>
				</div>
			</div>
			<div>
				<label for="PHONE_NO">Phone no</label>
				<div>
					<form:input path="PHONE_NO"/>
				</div>
			</div>
			<div>
				<label for="STANDARD_FEES">Standard fees</label>
				<div>
					<form:input path="STANDARD_FEES"/>
				</div>
				<div>
							<form:button>Add New</form:button>
						</div>
			</form:form>
</div>
	</div>
	</div>
</body>
</html>