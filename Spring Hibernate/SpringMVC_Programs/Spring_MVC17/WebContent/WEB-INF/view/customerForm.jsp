<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>Customer Registration Form</title>
		
		<style>
			.error{color:red}
		</style>
	</head>
	
	<body>
		<i> Asterisk (*) marked fields are required.</i>
		<form:form action="processForm" modelAttribute="customer">
			<h2> First name: <form:input path="firstName" /> </h2>
			
			<h2> Last name (*): <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" /></h2>
			
			<h2> Free passes: <form:input path="freePasses" />
			<form:errors path="freePasses" cssClass="error" /></h2>
			
			<h2> Postal code: <form:input path="postalCode" />
			<form:errors path="postalCode" cssClass="error" /></h2>
			
			<h2> Course code: <form:input path="courseCode" />
			<form:errors path="courseCode" cssClass="error" /></h2>
			
			<h2><input type="submit" value="Submit" /></h2>
		</form:form>
	</body>

</html>