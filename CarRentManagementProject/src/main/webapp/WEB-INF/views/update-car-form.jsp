<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Car</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="updatecarren" method="post" modelAttribute="updatecarrental">
				<div>
					<label for="carRegno">Car RegNo</label>
					<div>
						<form:input path="carRegno" />
					</div>
				</div>
				<div>
					<label for="ownerId">Owner Id</label>
					<div>
						<form:input path="ownerId" />
					</div>
				</div>
				<div>
					<label for="carMake">Car Make</label>
					<div>
						<form:input path="carMake" />
					</div>
				<div>
					<label for="carModel">Car Model</label>
					<div>
						<form:input path="carModel" />
					</div>
				</div>
				<div>
					<label for="carColour">Car Colour</label>
					<div>
						<form:input path="carColour" />
					</div>
				</div>
				<div>
					<label for="fuelType">Fuel Type</label>
					<div>
						<form:input path="fuelType" />
					</div>
				</div>
				<div>
					<label for="carCapacity">Car Capacity</label>
					<div>
						<form:input path="carCapacity" />
					</div>
				</div>
				<div>
					<label for="carAvailable">Car Available</label>
					<div>
						<form:input path="carAvailable" />
					</div>
					
						<div>
							<form:button>Update Car</form:button>
						</div>
			</form:form>
		</div>
	</div>
	</div>
</body>
</html>