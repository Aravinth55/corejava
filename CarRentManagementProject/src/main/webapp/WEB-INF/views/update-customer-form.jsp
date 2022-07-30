<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="updatecus" method="post" modelAttribute="updatecustomer">
				<div>
					<label for="customerId">Customer Id</label>
					<div>
						<form:input path="customerId" />
					</div>
				</div>
				<div>
					<label for="customer_Name">Customer Name</label>
					<div>
						<form:input path="customer_Name" />
					</div>
				</div>
				<div>
					<label for="address">Address</label>
					<div>
						<form:input path="address" />
					</div>
				</div>
				<div>
					<label for="mobile_No">Mobile No</label>
					<div>
						<form:input path="mobile_No" />
					</div>
				</div>
				<div>
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender" />
					</div>
				</div>
				<div>
					<label for="blood_Group">Blood Group</label>
					<div>
						<form:input path="blood_Group" />
					</div>
				</div>
				<div>
					<label for="person_Type">Person Type</label>
					<div>
						<form:input path="person_Type" />
					</div>
					<div>
						<label for="joining_Date">Joining Date</label>
						<div>
							<form:input path="joining_Date" />
						</div>
						<div>
							<form:button>Update Customer</form:button>
						</div>
			</form:form>
		</div>
	</div>
	</div>
</body>
</html>