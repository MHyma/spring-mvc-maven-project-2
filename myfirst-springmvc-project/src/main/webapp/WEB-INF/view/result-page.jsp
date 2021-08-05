<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result page</title>
<style type="text/css">
span{
color:blue;
}
</style>
</head>
<body>
<h1 align="center">Your Course </h1>
		<hr/>
				<div align="center">
		<p>
		Hi <span>${userInfoDto.userName}</span> ! <br>
		You want to enroll for course <span>${userInfoDto.courseName}</span>. <br>
		Great ! <br>
		Please provide your email for contact. We will let you know the details of the course.<br>
		Thank You
		</p>

		
	</div>
</body>
</html>