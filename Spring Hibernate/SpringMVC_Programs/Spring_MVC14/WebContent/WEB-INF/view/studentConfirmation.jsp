<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Confirmation</title>
	</head>
	<body>
		<h2>The student is confirmed: </h2>
		<h2>FullName: ${student.firstName} ${student.lastName}</h2>
		<h2>Favorite Language: ${student.favoriteLanguage}</h2>
		<h2>Operating System:
			<ul>
				<c:forEach var="temp" items="${student.operatingSystem}">
					<li>${temp}</li>
				</c:forEach>
			</ul>
		</h2>
		<h2>Country: ${student.country}</h2>
	</body>
</html>