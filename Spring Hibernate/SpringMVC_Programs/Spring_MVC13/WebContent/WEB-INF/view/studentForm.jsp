<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student"> 
		
			<h3>First Name: <form:input path="firstName" /></h3>
			
			<h3>Last Name: <form:input path="lastName" /></h3>
	
			<h3>Country:
			<form:select path="country">
				<form:options items="${student.countryList}" />
			</form:select></h3>
			
			<h3><input type="submit" value="Submit"></h3>
					
		</form:form>
	</body>
</html>