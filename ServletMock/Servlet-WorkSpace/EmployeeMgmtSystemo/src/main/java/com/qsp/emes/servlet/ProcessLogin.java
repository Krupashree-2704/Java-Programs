package com.qsp.emes.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProcessLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("usern");
		String password = req.getParameter("pass");
		PrintWriter writer = resp.getWriter();
		writer.print("<html><body>");
		writer.print("<h1> Username = "+username+" <h1>");
		writer.print("<h1> Password = "+password+" <h1>");
		writer.print("</body></html>");
	}
}
