<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>



<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>
	
	<form:form  method="POST" action="user/register">
	fullname <input  type="text"  name="name">
	</br>
	email <input  type="text"  name="email">
	</br>
	passwoed <input  type="password"  name="passw">
	</br>
	mobile <input  type="text"  name="mobile">
	</br>
	<input type ="submit" name ="register">
	
	</form:form>
</body>
</html>