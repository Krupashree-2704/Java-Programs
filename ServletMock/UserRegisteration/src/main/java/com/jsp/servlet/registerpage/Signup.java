package com.jsp.servlet.registerpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;





@WebServlet(value = "/fetch1")
public class Signup extends HttpServlet {
	static List<User> users = new ArrayList<>();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("user");
	    String password = req.getParameter("pass");
	    String fullName = req.getParameter("fullname");
	    String email = req.getParameter("emailid");
	    
	    User newUser = new User(username, password, fullName, email);
	    newUser.setFullName(fullName);
	    newUser.setEmail(email);
	    newUser.setUsername(username);
	    newUser.setPassword(password);
	    users.add(newUser);
	    newUser.setUser(users);
	    
	    PrintWriter writer = resp.getWriter();
	    writer.println("<html><body>");
	    writer.println("<h1>Registeration Successful!!!</h1>");
	    resp.sendRedirect("default.html");
	    writer.println("</body></html>");
	    
	}

}
