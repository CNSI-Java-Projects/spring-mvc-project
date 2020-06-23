<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data Collection Form</title>
</head>
<body>
	<form:form action="processData" modelAttribute="student">
		First Name: <form:input path="firstName"/>
		<br><br>
		Last Name: <form:input path="lastName"/>
		<br><br>
		
		<form:select path="country">
			<form:option value="India" label="India"/>
			<form:option value="US" label="America"/>
			<form:option value="Italy" label="Italy"/>
			<form:option value="France" label="France"/>
			<form:option value="Canada" label="Canada"/>
		</form:select>

		<input type="submit" value="submit"/>
	</form:form>

</body>
</html>