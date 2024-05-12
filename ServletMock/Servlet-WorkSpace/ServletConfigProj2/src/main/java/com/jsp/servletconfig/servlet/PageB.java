package com.jsp.servletconfig.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageB extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig servletConfig = getServletConfig();
		String Doggo = servletConfig.getInitParameter("Doggo");
		System.out.println("Doggo : "+Doggo);
		
	}
}
