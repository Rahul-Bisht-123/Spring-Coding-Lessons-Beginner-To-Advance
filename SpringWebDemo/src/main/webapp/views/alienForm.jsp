<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h1>Add new Alien</h1>
	
	<form action="addAlien">
	 <input type="text" name="aid" id="aid" placeholder="Enter id">
	 <br><br>
	 <input type="text" name="aname" id="aname" placeholder="Enter name">
	 
	 <input type="submit" value="submit">
	</form>
</body>
</html>