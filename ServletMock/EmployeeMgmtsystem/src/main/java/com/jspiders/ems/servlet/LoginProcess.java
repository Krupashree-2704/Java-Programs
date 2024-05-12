package com.jspiders.ems.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginProcess extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		PrintWriter writer = resp.getWriter();
		if(username.equals("admin")&&password.equals("admin123"))
		{
			writer.print("<html><body>");
			writer.print("<h1>Welcome"+username+" to Ahilyadevi Water Service<h1>");
			writer.print("</body></html>");
		}
		else
		{
			writer.print("<html><body>");
			writer.print("<h1>Invalid Login Details!!! Pls try again later <h1>");
			writer.print("</body></html>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("LoginForm.html");
			requestDispatcher.include(req, resp);
			
		}
	}
}
