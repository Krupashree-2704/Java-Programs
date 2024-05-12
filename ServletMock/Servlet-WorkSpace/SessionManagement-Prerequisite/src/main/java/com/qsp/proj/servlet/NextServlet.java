package com.qsp.proj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/nextservlet")
public class NextServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Object attribute1 = req.getAttribute("name");
		Object attribute2 = req.getAttribute("pass");
		
		String username=(String)attribute1;
		String password=(String)attribute2;
		
		System.out.println(username);
		System.out.println(password);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html><body>\r\n");
		writer.print("<form action=\"displayservlet\">\r\n");
		writer.print(" <input type=\"hidden\" name=\"username\" value="+username+"\">\r\n");
		writer.print(" <input type=\"hidden\" name=\"password\" value="+password+"\">\r\n");
		writer.print("<input type=\"submit\" value=\"Submit\">");
		writer.print("</form>\r\n");
		writer.print("</body></html>\r\n");
		
//		req.setAttribute("uesr", username);
//		req.setAttribute("paess", username);
//		
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("displayservlet");
//		requestDispatcher.forward(req, resp);
		
		
	}

}
