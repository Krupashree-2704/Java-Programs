<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<label for="name">Name:</label>
		<input type="text" id="name" name="name">
		<input type="submit" value="press">
	</form>
	
	<!--<h1>The Value Of the Given Expression is :<%=3+4*7 %></h1>  -->
	<%
		String name=request.getParameter("name");
	%>
	<%=name %>
	
</body>
</html>