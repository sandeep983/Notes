<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Customer Confirmation Page</title>
	</head>
	
	<body>
		<h2> The customer is confirmed: ${customer.firstName} ${customer.lastName} </h2>
		<h2> Free passes: ${customer.freePasses} </h2>
		<h2> Postal code: ${customer.postalCode} </h2>
	</body>
</html>