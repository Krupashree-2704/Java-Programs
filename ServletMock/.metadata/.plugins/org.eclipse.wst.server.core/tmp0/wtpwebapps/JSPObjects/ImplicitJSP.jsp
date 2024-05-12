<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Implicit Object</title>
</head>
<body>
	<h1>JSP Implicit Object</h1>
	<ul>
		<li>Request URI : <%=request.getRequestURI() %></li>
		<!-- Request URI=ContextPath+ServletPath -->
		<li>Server Name : <%=request.getServerName() %></li>
		<li>Session ID : <%=session.getId() %></li>
		<li>Context Path : <%=request.getContextPath() %></li>
		<!-- ContextPath=>Root application path -->		
		<li>Servlet Path : <%=request.getServletPath() %></li>
		<!-- Servlet Path=>file name of application which is being runned on server  -->
		
	</ul>
</body>
</html>