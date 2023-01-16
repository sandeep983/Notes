<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>Customer Registration Form</title>
		
		<style>
			.error{color:red}
		</style>	
	</head>
	
	<body>
		<i> Asterisk (*) means required.</i>
		<form:form action="processForm" modelAttribute="customer">
			<h2> First name: <form:input path="firstName" /> </h2>
			
			<h2> Last name (*): <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" /></h2>
			
			<h2><input type="submit" value="Submit" /></h2>
		</form:form>
	</body>

</html>