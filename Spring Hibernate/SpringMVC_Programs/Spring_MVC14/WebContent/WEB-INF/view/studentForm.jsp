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
			
			<h3>Favorite Language: 
				<form:radiobutton path="favoriteLanguage" value="Java" /> Java
				<form:radiobutton path="favoriteLanguage" value="C#" /> C#
				<form:radiobutton path="favoriteLanguage" value="Python" /> Python
				<form:radiobutton path="favoriteLanguage" value="Ruby" /> Ruby 
			</h3>
			
			<h3>Operating System: 
				<form:checkbox path="operatingSystem" value="Linux" /> Linux
				<form:checkbox path="operatingSystem" value="Windows" /> Windows
				<form:checkbox path="operatingSystem" value="Ubuntu" /> Ubuntu
				<form:checkbox path="operatingSystem" value="MacOS" /> MacOS
			</h3>
			
			<h3>Country:
			<form:select path="country">
				<form:options items="${theCountryList}" />
			</form:select></h3>
			
			<h3><input type="submit" value="Submit"></h3>
					
		</form:form>
	</body>
</html>