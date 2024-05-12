package com.jsp.servletconfig.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/PageA"}, initParams = {@WebInitParam(name="Dogggo",value="40000"),@WebInitParam(name="Shephard",value="20000")})
public class PageA extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig servletConfig = getServletConfig();
		String Doggo = servletConfig.getInitParameter("Doggo");
		System.out.println("Doggo : "+Doggo);
		String Sheperd = servletConfig.getInitParameter("Sheperd");
		System.out.println("Sheperd : "+Sheperd);
	}
}
