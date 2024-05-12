package com.qsp.hff.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/process")
public class Processing extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String emailfetch = req.getParameter("emailfetch");
		PrintWriter writer = resp.getWriter();
		writer.print("<html><body>");
		writer.print("<h1>I \""+emailfetch+" to accept these offer</h1>");
		writer.print("</body></html>");
	}
}
