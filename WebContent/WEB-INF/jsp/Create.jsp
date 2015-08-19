<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Employee</title>
<script>
function fnSubmit()
{
	document.forms[0].submit();
}


</script>

</head>
<body>
<form name="employee" method="post">
<h2>Enter Employee Details</h2>

<table>
<tr>
<td>First Name</td><td>
<c:set var="fName" value="employee.firstName"/>
<spring:bind path="${fName}">
<input type="text" name="<c:out value="${status.expression}"/>" value="<c:out value="${status.value}"/>">
</spring:bind>
</td>
<td>Middle Name</td><td>
<c:set var="mName" value="employee.middleName"/>
<spring:bind path="${mName}">
<input type="text" name="<c:out value="${status.expression}"/>" value="<c:out value="${status.value}"/>">
</spring:bind>
</td>
<td>Last Name</td><td>
<c:set var="lName" value="employee.lastName"/>
<spring:bind path="${lName}">
<input type="text" name="<c:out value="${status.expression}"/>" value="<c:out value="${status.value}"/>">
</spring:bind>
</td>
</tr>
<tr>
<td>Employee ID</td><td>
<spring:bind path="employee.employeeId">
<input type="text" name="<c:out value="${status.expression}"/>" value="<c:out value="${status.value}"/>">
</spring:bind>
</td>
</tr>
<tr>
<td>Age</td><td>
<spring:bind path="employee.age">
<input type="text" name="<c:out value="${status.expression}"/>" value="<c:out value="${status.value}"/>">
</spring:bind>
</td>
</tr>
<tr>
<td>Company</td><td>
<spring:bind path="employee.company">
<input type="text" name="<c:out value="${status.expression}"/>" value="<c:out value="${status.value}"/>">
</spring:bind>
</td>
</tr>
<tr>
<td>Salary</td><td>
<spring:bind path="employee.salary">
<input type="text" name="<c:out value="${status.expression}"/>" value="<c:out value="${status.value}"/>">
</spring:bind>
</td>
</tr>

</table>

<input type="button" onclick="fnSubmit();" value="Submit" name="Submit">


</form>

</body>
</html>