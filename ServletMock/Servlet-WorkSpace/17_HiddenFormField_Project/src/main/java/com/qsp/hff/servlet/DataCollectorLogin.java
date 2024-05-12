package com.qsp.hff.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/login")
public class DataCollectorLogin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		PrintWriter writer = resp.getWriter();
		if (email.equals("admin@g.co")&&password.equals("admin")) {
			writer.print("<html><body>\r\n");
			writer.print("<form action=\"process\" method=\"post\">\r\n");
			writer.print(" <input type=\"hidden\" name=\"emailfetch\" value="+email+"\">\r\n");
			writer.print("<input type=\"submit\" value=\"Submit\">\r\n");
			writer.print("</form>\r\n");
			writer.print("</body></html>");
		}
		
	}
}
