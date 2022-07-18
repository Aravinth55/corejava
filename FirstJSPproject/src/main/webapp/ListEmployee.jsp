<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" 
	import ="java.util.List,com.chainsys.jspproject.pojo.Employee,java.util.ArrayList"
	%>
	<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Employees List</title>
</head>
<body>
<table border="4" style="width:100%">
<tr>
<th>Employee Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Salary</th>
<th>Email</th>
<th>Hire Date</th>
<th>Job Id</th>
</tr>
<thead></thead>
	<%
	  List<Employee> emplist =(ArrayList<Employee>)request.getAttribute("employeelist");
	for(Employee emp:emplist){
	%>
	<tr>
	<td><%=emp.getEmp_id()%> </td>
	<td><%=emp.getFirst_name()%></td>
	<td><%=emp.getLast_name()%> </td>
	<td><%=emp.getSalary()%> </td>
	<td><%=emp.getEmail()%> </td>
	<td><%=emp.getHire_date()%> </td>
	<td><%=emp.getJob_id()%> </td>	
	</tr>
	<%}%>
	</table>
	
</form>
</body>
</html>