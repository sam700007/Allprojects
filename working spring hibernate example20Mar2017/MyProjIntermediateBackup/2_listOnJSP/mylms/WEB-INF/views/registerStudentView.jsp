<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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

	<h2>Register Student</h2>
	<br />


	<h2>
		<spring:message code="lbl.page" text="Add New Student" />
	</h2>
	<br />

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
				<td><spring:message code="lbl.dob" text="Date of Birth" /></td>
				<td><form:input path="dob" /></td>
				<td><form:errors path="dob" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td><spring:message code="lbl.mobileNumber" text="Mobil eNumber" /></td>
				<td><form:input path="mobileNumber" /></td>
				<td><form:errors path="mobileNumber" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td><spring:message code="lbl.studentSkills" text="Student Skills" /></td>
				<td><form:select name="studentSkills"  path="studentSkills">
				<option value="reading">reading</option>
				<option value="writting">writting</option>
				<option value="singing">singing</option>
				</form:select>
				</td>
				<td><form:errors path="studentSkills" cssClass="error" /></td>
			</tr>

			<%-- <form:checkbox path="functions[${status.index }].action" id="${function.id}" value="${function.action}"/>
         --%>

			<%-- <tr>
				<td><spring:message code="lbl.department" text="Department" /></td>
				<td><form:select path="${department.id}"
						items="${allDepartments}" itemValue="id" itemLabel="name" /></td>
				<td><form:errors path="department" cssClass="error" /></td>
			</tr> --%>
			<tr>
				<td><spring:message code="lbl.gender" text="Gender" /></td>
				<td><form:radiobutton path="gender" value="true"/>Male</td>
				<td><form:radiobutton path="gender" value="false"/>Female</td>
				<td><form:errors path="gender" cssClass="error" /></td>
			</tr>
			
			<%-- <tr>
			<td><form:checkbox path="subjects[0].sname" value="Java"/>Java</td>
			<td><form:checkbox path="subjects" value="C++"/>C++</td>
			<td><form:checkbox path="subjects" value=".Net"/>.Net</td>
			</tr> --%>
			<!-- <tr>
				<td><INPUT TYPE="radio" NAME="department" VALUE="CSE" CHECKED>
					Computer Science</td>
				<td><INPUT TYPE="radio" NAME="department" VALUE="ECE">
					Electronic Communication</td>
				<td><INPUT TYPE="radio" NAME="department" VALUE="ME">
					Mechanical Engineering</td>
			</tr> -->

			<tr>
				<td colspan="5"><input type="submit" value="Add Student" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>