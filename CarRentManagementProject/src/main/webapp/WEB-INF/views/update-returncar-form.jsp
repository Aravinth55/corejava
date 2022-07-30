<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Return Car</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<div>
				<form:form action="updatecarren" method="post"
					modelAttribute="updatecarrental">
					<div>
						<label for="carRegno">Car RegNo</label>
						<div>
							<form:input path="carRegno" />
						</div>
					</div>
					<div>
						<label for=customerId>Customer Id</label>
						<div>
							<form:input path="customerId" />
						</div>
					</div>
					<div>
						<label for="fromDate">From Date</label>
						<div>
							<form:input path="fromDate" />
						</div>
						<div>
							<label for="dueDate">Due Date</label>
							<div>
								<form:input path="dueDate" />
							</div>
						</div>
						<div>
							<label for="payElapsed">Pay Elapsed</label>
							<div>
								<form:input path="payElapsed" />
							</div>
						</div>
						<div>
							<label for="carFine">Car Fine</label>
							<div>
								<form:input path="carFine" />
							</div>
						</div>
						<div>
							<label for="totalFee">Total Fee</label>
							<div>
								<form:input path="totalFee" />
							</div>
							<div>
								<form:button>Update Return Car</form:button>
							</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>