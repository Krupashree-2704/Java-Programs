package com.projecthub.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projecthub.controller.Controller;
import com.projecthub.model.Student;




@WebServlet(value="/logindecider")
public class LoginDecider extends HttpServlet{
	static Controller controller=new Controller();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter writer = resp.getWriter();
		
		if(username.equalsIgnoreCase(username))
		{
			System.out.println(username);
			System.out.println(password);
		}
		
		 }
		 
		 

}
