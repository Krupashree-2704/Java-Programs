package com.jsp.cookie.servlet;

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
		//Creation of Cookie
		Cookie cookie = new Cookie("pi", "3.14");
		//Attach Cookie to response
		resp.addCookie(cookie);
		//Printing for adding cookie
		System.out.println("Cookie is Created and appended");
	}
}
