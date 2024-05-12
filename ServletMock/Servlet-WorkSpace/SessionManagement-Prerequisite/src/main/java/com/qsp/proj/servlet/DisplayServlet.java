package com.qsp.proj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/displayservlet")
public class DisplayServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
//		Object attribute1 = req.getAttribute("uesr");
//		Object attribute2 = req.getAttribute("paess");
//		
//		String username = (String)attribute1;
//		String password = (String)attribute2;
//		
		PrintWriter writer = resp.getWriter();
		writer.print("<html><body>");
		writer.print("<h1>Username:"+username+"</h1>");
		writer.print("<h1>Password:"+password+"</h1>");
		writer.print("</body></html>");
	}
}
