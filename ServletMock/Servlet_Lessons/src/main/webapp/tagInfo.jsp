<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.util.Random"%>
    <%@page import="java.util.*, java.sql.Statement" %>
    <!-- for @page :we can use import attribute :more than one time -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int a=10;
		int b=20;
		int c=a+b;
		out.print(c);
	%>
	<%!int w=10; %>
	<h1>Value of w is : <%=w %></h1>
	<%ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		out.print("ArrayList is :");
		for(Object obj:al)
		{
			out.print(obj+" ");
		}%>
		<%@page import="java.util.*" %>
		<%@include file="header.jsp" %>
</body>
</html>
<!-- ignore '!'
	 1. Declarative Tag(<!%!%>):Remember tag:code not goes inside service method:opposite(not )of scriptlet
	 2. Expression Tag(<!%=%>):Used for generate output into servlet)
	 3. Scriplet Tag (<!%%>): code goes inside  service method
	 4. Include Tag:(<!%@include>):used to include the libraries in java like jdbc,prepared statement etc.-->