<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<title>
Student Registration Form!!
</title>

</head>

<body>

<form:form action="processForm" modelAttribute="student">
First Name : <form:input path="firstName"/>
<br><br>
Last Name : <form:input path="lastName"/>
<br><br>
Country : <form:select path="country">
		  <form:options items="${student.countryOptions}"/>
			<!--<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="India" label="India"></form:option>
			<form:option value="China" label="China"></form:option>
			<form:option value="Russia" label="Russia"></form:option> -->
		</form:select>

<br><br>
Your Favorite Language : 
Java <form:radiobutton path="yourFavoriteLanguage" value="Java"/>
XML <form:radiobutton path="yourFavoriteLanguage" value="XML"/>
C++ <form:radiobutton path="yourFavoriteLanguage" value="C++"/>
Ruby <form:radiobutton path="yourFavoriteLanguage" value="Ruby"/>
<br><br>
Your Favorite Operating Systems:
Windows <form:checkbox path="yourFavoriteOs" value="Windows"/>
Mac OS <form:checkbox path="yourFavoriteOs" value="Mac OS"/>
Linux <form:checkbox path="yourFavoriteOs" value="Linux"/>
Solaris <form:checkbox path="yourFavoriteOs" value="Solaris"/>
<br><br>
<input type="submit" value="submit"/>

</form:form>



</body>


</html>