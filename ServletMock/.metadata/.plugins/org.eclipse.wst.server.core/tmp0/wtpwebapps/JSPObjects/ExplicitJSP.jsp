<%@page import="javax.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Explicit JSP Objects</title>
</head>
<body>
	<%
		//getting explicit object from JSP pageContext
		ServletContext servletContext = pageContext.getServletContext();
		HttpSession httpSession = pageContext.getSession();
		//If not used type conversion: we get in ServletRequest type
		HttpServletRequest hTTPServletRequest = (HttpServletRequest)pageContext.getRequest();
	//Ouputing Information
	out.println("<h2>Servlet Context</h2>"+
	"<ul>"+"<li>Server Information : "+servletContext.getServerInfo()+"</li>"+
			"<li>Server Name : "+servletContext.getServletContextName()+"</li>"+
			"<li>Context Path: "+servletContext.getContextPath()+"</li>"
			+"<li>Servlet Name : "+servletContext.getServletNames()+"</li>"
			+"<li>Creation Time : "+httpSession.getCreationTime()+"</li>"
			+"<li>HTTP Context Path : "+hTTPServletRequest.getContextPath()+"</li>"
			+"<li>HTTP Local Name : "+hTTPServletRequest.getLocalName()+"</li>"
			+"</ul>");
	
	%>
</body>
</html>