package com.qspiders.ems.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/loginpro")
public class LoginProcess extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("user");
		String password = req.getParameter("pass");
		System.out.println(username);
		System.out.println(password);
		
		//
		PrintWriter writer = resp.getWriter();
		
		//
		if(username.equals("admin")&&password.equals("admin123"))
		{
			writer.print("<html><body>");
			writer.print("<h1>Welcome "+ username +" to Abhiram Water Supply</h1>");
			writer.print("<form action=\"InsertEmployee.html\" method=\"post\">"
					+ "<h3> Insert New Working Employee In Company </h3>"
					+ "<input type=\"submit\" value=\"Create New Employee\">"
					+ "</form>");
			writer.print("</body></html>");
		}
//		else
//		{
//			writer.print("<html><body>");
//			writer.print("<h1>Invalid Login Details!!!Please Try with Correct Credentials....</h1>");
//			writer.print("</body></html>");
//			RequestDispatcher requestDispatcher = req.getRequestDispatcher("LoginProcess");
//			requestDispatcher.include(req, resp);
//		}
		
	}
}
