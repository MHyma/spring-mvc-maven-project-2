<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>homepage</title>
</head>
<body>
	
		<h1 align="center">Welcome to Course</h1>
		<hr/>
		<form:form action="process-homepage" method="get" modelAttribute="userInfo">
		<div align="center">
		<p>
			<label for="yn">Your Name :</label> 
			<form:input type="text" id="yn" path="userName"/>
		</p>
		<p>
			<label for="cn">Your Course :</label>
			 <form:input type="text" id="cn" path="courseName" />
		</p>

		<input type="submit" value="Enroll">
	</div>

</form:form>

</body>
</html>