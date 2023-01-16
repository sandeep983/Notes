<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Confirmation</title>
	</head>
	<body>
		<h2>The student is confirmed: </h2>
		<h2>FullName: ${student.firstName} ${student.lastName}</h2>
		<h2>Country: ${student.country}</h2>
	</body>
</html>