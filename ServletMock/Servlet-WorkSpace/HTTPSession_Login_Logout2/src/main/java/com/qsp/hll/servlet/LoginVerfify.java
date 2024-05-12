package com.qsp.hll.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/logindetails")
public class LoginVerfify extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		task: difference between getParameter and getAttribute
		String user = req.getParameter("email");
		String password = req.getParameter("pass");
		
//		
		PrintWriter writer = resp.getWriter();
		
//		verify
		if (user.equals("admin")&&password.equals("admin123")) {
			HttpSession session = req.getSession();
			session.setAttribute("username", user);
//			session.setAttribute(password, writer);
			writer.print("<h1>Home Page </h1>"
					+ "<h2>Login Successful</h2>"
					+ "<a href=\"Dm\">Direct message");
			
		} else {
			writer.print("<h1>Invalid Login Credentials</h1>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("loginpage.html");
			requestDispatcher.include(req, resp);
		}
		
	}
}
