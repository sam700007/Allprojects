<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title>Learning Management</title>
	<style>
	.error 
	{
		color: #ff0000;
		font-weight: bold;
	}
	#listOfEmployees tr:first-child{
		font-weight: bold;
	}
	</style>
</head>

<body>
	
	<h2>Register Student</h2>
	<br/>
	

	<h2><spring:message code="lbl.page" text="Add New Student" /></h2>
	<br/>
	
	<form:form method="post" modelAttribute="student">
		<table>
			<tr>
				<td><spring:message code="lbl.StudentNo" text="First Name" /></td>
				<td><form:input path="fName" /></td>
				<td><form:errors path="fName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.StudentNo" text="Last Name" /></td>
				<td><form:input path="lName" /></td>
				<td><form:errors path="lName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.StudClass" text="Class" /></td>
				<td><form:input path="studClass" /></td>
				<td><form:errors path="studClass" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.email" text="Email Id" /></td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
			<td>
                 <form:checkbox path="courseModel" value="Java" />Java
                 <form:checkbox path="courseModel" value="Php" />Php
             </td>
			</tr>
			
			<tr>
				<td colspan="5"><input type="submit" value="Add Student"/></td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>