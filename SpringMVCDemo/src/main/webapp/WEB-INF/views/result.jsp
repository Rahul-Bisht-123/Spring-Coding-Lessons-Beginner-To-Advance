<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
	
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<style>
body{
background:black;
color:white
}
</style>
<body>
	<%-- <h1>Result is : <%= session.getAttribute("result") %>  </h1> --%>
	<h1>Result is : ${result}  </h1>
	
	
</body>
</html>