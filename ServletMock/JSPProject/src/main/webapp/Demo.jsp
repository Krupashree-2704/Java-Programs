<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Works like html -->
	<!-- Declaration Tag -->
	<%!
	//In this area : works like java
	//Mainly used for declaraion purpose
		int i=9;
		//
		public int addTwoNumber(int a,int b)
		{
			return a+b;
		}
	%>
	
	<!-- Scriplet Tag :for Server side printing-->
	
	<%
	//Can be declaraed and initialize variables
		System.out.println("sum of two numbers is : "+addTwoNumber(1, 2));
	int num=77;
	%>
	
	<!-- Expression Tag:for Client Side Printing -->
	<!-- Used For Expressing(Printing)output to client side -->
	<!-- JSP->similar to html page->web browser console to client->using html for printing:
	For Making content dynamic :using java -->
	<h1>1+2 = <%= addTwoNumber(1, 2) %></h1>
	<h2>Value of i=<%=i %></h2>
	<h2>Value of num=<%= num %></h2>
</body>
</html>