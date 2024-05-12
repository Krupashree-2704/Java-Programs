package com.qsp.hs.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/pagea")
public class PageA extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Page A Triggered</h1>");
		
//		Creation of Session
//		Object is supermost class in java
//		We can store primitive  and non primitive data
		
		HttpSession session = req.getSession();
		
//		set values in HTTPSession 
		session.setAttribute("sample", "hello");
		
//		Create object of user and then set it in HTTP Session
		User user = new User();
		user.firstName="spidermon";
		user.lastName="stark";
		user.phone=793245680;
		
//		set values in HTTPSession 
		session.setAttribute("user1", user);
		
		writer.print("<h1>HTTPSession Created</h1>");
		
	}
}
