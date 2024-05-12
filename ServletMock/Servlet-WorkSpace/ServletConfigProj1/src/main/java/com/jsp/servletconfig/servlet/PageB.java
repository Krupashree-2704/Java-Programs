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
		System.out.println("Dogoo : "+Doggo);
		String Retriever = servletConfig.getInitParameter("Retriever");
		System.out.println("Retriever : "+Retriever);
		String Chiuava = servletConfig.getInitParameter("Chiuava");
		System.out.println("Chiuava : "+Chiuava);
		String Shephard = servletConfig.getInitParameter("Shephard");
		System.out.println("Shephard : "+Shephard);
	}
}
