package com.jsp.ec.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/PageA")
public class PageA extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("g","8.91");
		cookie.setMaxAge(4);
		resp.addCookie(cookie);
		
//		1 day formula=>1*24hrs*60min*60sec
	
		
		System.out.println("Cookie is created and appended");
		
	}
}
