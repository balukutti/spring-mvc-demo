<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>

<title>
	Student Confirmation Page!!
</title>
</head>

	<body>
	
	The Student is Confirmed: ${student.firstName} ${student.lastName} 
	<br>
	Student's Country is : ${student.country}
	<br>
	Your Favorite Language is : ${student.yourFavoriteLanguage}
	
	<br><br>
	
	Your Favorite Operating system is :
	<ul>
	<c:forEach var="temp" items="${student.yourFavoriteOs}">
		<li>${temp}</li>
	</c:forEach>
	</ul> 
	
	<br><br>
	
	</body>

</html>
