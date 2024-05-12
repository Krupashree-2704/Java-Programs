package com.jsp.sms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.dialect.RDMSOS2200Dialect;

import com.jsp.sms.controller.Controller;
import com.jsp.sms.model.Student;

@WebServlet(value="/createstudent")
public class AdminCreateStudent extends HttpServlet {
	static Controller controller=new Controller();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Student student=new Student();
		
		String studentname = req.getParameter("name");
		student.setStudent_name(studentname);
		
		String studentemail = req.getParameter("email");
		student.setStudent_email(studentemail);
		
		String studentgender = req.getParameter("gender");
		if(studentgender.equalsIgnoreCase("male"))
		{
			student.setStudent_gender(false);
		}
		else
		{
			student.setStudent_gender(true);
		}
		
		String studentaddress = req.getParameter("address");
		student.setStudent_address(studentaddress);
		
		String phno = req.getParameter("phno");
		long studentcontact=Long.parseLong(phno);
		student.setStudent_contact(studentcontact);
		
		String studentbranch = req.getParameter("branch");
		student.setStudent_branch(studentbranch);
		
		String studentusername = req.getParameter("uname");
		student.setStudent_username(studentusername);
		
		String studentpassword = req.getParameter("pass");
		student.setStudent_password(studentpassword);
		
		PrintWriter writer = resp.getWriter();
		
		if (controller.insertStudent(student)) {
			writer.print("<h1>Student Created Successfully</h1>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("logindecider");
//			requestDispatcher.forward(req, resp);
			requestDispatcher.include(req, resp);
			
		}
		else
		{
			writer.print("<h1>Student Not Created !!!!</h1>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("logindecider");
//			requestDispatcher.forward(req, resp);
			requestDispatcher.include(req, resp);
		}
		
	}
}
