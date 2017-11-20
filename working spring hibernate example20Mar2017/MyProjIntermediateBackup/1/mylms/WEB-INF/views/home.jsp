<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title>My LMS </title>
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
	
	<h2>My LMS Home</h2>
	<br/>
	

	<h2><spring:message code="lbl.page" text="My Home" /></h2>
	<br/>
	
	<a href="/mylms/student-register"> Register Student </a>
	
</body>
</html>