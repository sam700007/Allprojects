<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>Spring 4 MVC Hello World Example with Maven Eclipse</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' /> 
</head>
<body>
	<h2>Hello to this new World, Spring MVC</h2>

	<p>Welcome, ${fname}</p>
	<p>Welcome, ${mname}</p>
	<p>Welcome, ${lname}</p>
	Tried with EL:

    ${fname}

    Try with JSTL:

    <c:out value="${fname}"></c:out>
</body>
</html>