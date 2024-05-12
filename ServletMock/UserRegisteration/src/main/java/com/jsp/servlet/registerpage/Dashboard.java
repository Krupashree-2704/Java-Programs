package com.jsp.servlet.registerpage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




@WebServlet(value = "/dashboard")
public class Dashboard extends HttpServlet{
	static List<User> infos = User.getUser();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userLogin = req.getParameter("users");
		String passLogin = req.getParameter("passs");
		System.out.println(userLogin);
		System.out.println(passLogin);
		
		PrintWriter writer = resp.getWriter();
		
		
//		for (User user : infos) {
//			writer.print("<html><body>");
//			writer.print("<h1>Hello"+user.getUsername()+"Welcome to Dashboard</h1>");
//			writer.println("<h2>Your Information</h2>");
//			writer.println("<h3>Name: "+user.getFullName()+"</h3>");
//			writer.println("<h3>Email: "+user.getEmail()+"</h3>");
//			writer.println("<h3>UserName:"+user.getUsername()+"</h3>");
//			writer.print("</body></html>");
//		}
//		writer.print("<html><body>");
//		writer.print("<h1>Hello"+user.getUsername()+"Welcome to Dashboard</h1>");
//		writer.println("<h2>Your Information</h2>");
//		writer.println("<h3>Name: "+user.getFullName()+"</h3>");
//		writer.println("<h3>Email: "+user.getEmail()+"</h3>");
//		writer.println("<h3>UserName:"+user.getEmail()+"</h3>");
//		writer.print("</body></html>");
		for (User user : infos) {
			if (user.getUsername().equalsIgnoreCase(userLogin)&&user.getPassword().equalsIgnoreCase(passLogin)) {
				
				writer.println("<html><body>");
				writer.println("<h1>Hello"+user.getUsername()+"Welcome to Dashboard</h1>");
				writer.println("<h2>Your Information</h2>");
				writer.println("<h3>Name: "+user.getFullName()+"</h3>");
				writer.println("<h3>Email: "+user.getEmail()+"</h3>");
				writer.println("<h3>UserName:"+user.getEmail()+"</h3>");
				resp.sendRedirect("updateraise");
				writer.println("</body></html>");
			}
		}
		
//		login.doGet(req, resp);
//		System.out.println(req.getParameter("users"));
		
		
	}
//		System.out.println("Hello"+login.signup.data.username);
	
}
