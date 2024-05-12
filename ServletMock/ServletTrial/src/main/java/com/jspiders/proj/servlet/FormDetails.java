package com.jspiders.proj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/msg")
public class FormDetails extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fullname = req.getParameter("fullname");
		String email = req.getParameter("email");
		PrintWriter writer = resp.getWriter();
		writer.print("<html><body>");
		writer.print("<h2>My name is :"+fullname+" and my email is "+email+"</h2>");
		writer.print("</body></html>");
	}
}
