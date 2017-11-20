<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*" %>

<html>
<head>
<title>Learning Management</title>
<style>
.error {
	color: #ff0000;
	font-weight: bold;
}

#listOfEmployees tr:first-child {
	font-weight: bold;
}
</style>
</head>

<body>

	<h2>
		<spring:message code="lbl.page" text="Student Admission is confirmed" />
	</h2>
	<br />
		<table>
			<tr>
				<td><spring:message code="lbl.fName" text="First Name" /></td>
				<td>${student.fName}</td>
				<td><form:errors path="fName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.lName" text="Last Name" /></td>
				<td>${student.lName}</td>
				<td><form:errors path="lName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.studClass" text="Student Class" /></td>
				<td>${student.studClass}</td>
				<td><form:errors path="studClass" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.email" text="Email" /></td>
				<td>${student.email}</td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.dob" text="Dob" /></td>
				<td>${student.dob}</td>
				<td><form:errors path="dob" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.mobileNumber" text="Mobile Number" /></td>
				<td>${student.mobileNumber}</td>
				<td><form:errors path="mobileNumber" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.studentSkills" text="Student Skills" /></td>
				<td>${student.studentSkills}</td>
				<td><form:errors path="studentSkills" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.gender" text="Gender" /></td>
				<td>${student.gender}</td>
				<td><form:errors path="gender" cssClass="error" /></td>
			</tr>
		</table>

	 <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>FName</th>
                <th>LName</th>
                <th>Email</th>
                <th>MobileNo</th>
                <th>Skills</th>
            </tr>
            <%-- <c:forEach var="studentModel" items="${allStudents}">
				<li>${studentModel.studClass}</li>
			</c:forEach> --%>
            <c:forEach var="StudentModel" items="${allStudents}" >
                <tr>
               	    <td>${StudentModel.fName}</td>
               	     <td>${StudentModel.lName}</td>  
                	 <td>${StudentModel.email}</td>
                	 <td>${StudentModel.mobileNumber}</td>
                	  <td>${StudentModel.studentSkills}</td>
                	 <%-- <td><c:out value="${allStud.fname}" /></td> --%>
                    <%-- <td><c:out value="${allStud.fname}" /></td>
                    <td><c:out value="${allStud.lname}" /></td>
                    <td><c:out value="${allStud.email}" /></td>
                    <td><c:out value="${allStud.mobileNumber}" /></td> --%>
                </tr>
            </c:forEach>
        </table>
    </div>


</body>
</html>