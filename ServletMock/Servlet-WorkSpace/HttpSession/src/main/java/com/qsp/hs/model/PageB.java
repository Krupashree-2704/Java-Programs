package com.qsp.hs.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/pageb")
public class PageB extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Page B Triggered</h1>");
		
//		Fetch session from page a
		HttpSession session = req.getSession();
//		
		String sample =(String) session.getAttribute("sample");
//		
		User user1 = (User) session.getAttribute("user1");
		
		writer.print("<html><body>");
		writer.print("<h2>Sample Data: "+sample+"</h2>"
				+ "<h2>First Name: "+user1.firstName+"</h2>"
				+ "<h2>Last Name: "+user1.lastName+"</h2>"
						+ "<h2> Phone Number: "+user1.phone+"</h2>");
		writer.print("</body></html>");
	}

	
}
