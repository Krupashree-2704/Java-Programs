package com.qsp.hssw.servlet;


import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/Dm")
public class Dm extends HttpServlet{ 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
//		writer.print("<h1>DM Page</h1>");
		HttpSession session = req.getSession();
		String username=(String)session.getAttribute("username");
//		username.equals("admin")=>if we have multiple users
		
//		1 appn-1 session-1 user
		if (username!=null) {
			writer.print("<h1>DM Page</h1>"
					+ "<a href=\"logout\">Logout");
		} else {
			writer.print("<h1>Login to access this page</h1>");
//			RequestDispatcher requestDispatcher = req.getRequestDispatcher("loginpage.html");
//			requestDispatcher.include(req, resp);
			writer.print("<a href=\"loginpage.html\">Login here");
		}
	}
}

