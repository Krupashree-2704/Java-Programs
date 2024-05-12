package com.qsp.proj.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/loginprocess")
public class LoginProcess extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		req.setAttribute("name", name);
		req.setAttribute("pass", pass);
		
		if (name.equals("admin") && pass.equals("admin123")) {
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("nextservlet");
			requestDispatcher.forward(req, resp);
		}
	}
}
