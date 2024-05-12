<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jsp.model.Alien" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="teal">
<h1 style="text-align:centre;">Printing Alien's Information...</h1>
	<%
		Alien a1=(Alien)request.getAttribute("alien");
		
	%>
	<h1>ID:<%=a1.getAid()%></h1>
	<h1>Name:<%=a1.getAname()%></h1>
	<h1>Technical Knowledge:<%=a1.getAtech()%></h1>
	
	<form action="createAlien" method="post">
		<label for="id">ID: </label><br>
		<input type="text" name="id"><br>
		<label for="fullname">Name: </label><br>
		<input type="text" name="fullname"><br>
		<label for="tech">Technology Known: </label><br>
		<input type="text" name="tech"><br>
		<input type="submit">
	</form>
</body>
</html>