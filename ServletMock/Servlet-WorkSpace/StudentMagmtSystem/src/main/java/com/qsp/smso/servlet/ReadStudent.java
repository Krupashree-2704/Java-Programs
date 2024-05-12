package com.qsp.smso.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qsp.smso.controller.Controller;
import com.qsp.smso.model.Student;



@WebServlet(value="/readadmin")
public class ReadStudent extends HttpServlet{
	static Controller controller=new Controller();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		int student_id = Integer.parseInt(req.getParameter("stuid"));
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		List<Student> serachStudent = controller.serachStudent();
		PrintWriter writer = resp.getWriter();
		
		for (Student student : serachStudent) {
			if ((student.getStudent_username().equals(username))&&(student.getStudent_password().equals(password))) {
				writer.print("<html><body>");
				writer.print("<h1>....Student Details....</h1>");
				writer.print("<p>Student ID:"+student.getId()+"</p>");
				writer.print("<p>Student Name:"+student.getStudent_name()+"</p>");
				writer.print("<p>Student Email:"+student.getStudent_email()+"</p>");
				boolean student_gender = student.isStudent_gender();
				if (student_gender==true) {
					writer.print("<p>Student Gender:Female</p>");
				} else {
					writer.print("<p>Student Gender:Male</p>");
				}
				int student_id = student.getId();
				System.out.println(student_id);
				writer.print("<p>Student Address:"+student.getStudent_address()+"</p>");
				writer.print("<p>Student Branch:"+student.getStudent_branch()+"</p>");
				writer.print("<p>Student Username:"+student.getStudent_username()+"</p>");
				writer.print("<form action=\"updatestudent\" id=\"login_Form\" method=\"post\">");
				writer.print("<select name=\"updateStudent\">");
				writer.print("<option selected disabled hidden>Default</option>");
				writer.print(" <option>Update Name</option> ");
				writer.print(" <option>Update Email</option> ");
				writer.print(" <option>Update Address</option> ");
				writer.print(" <option>Update Username</option> ");
				writer.print(" <option>Update Password</option> ");
				writer.print("<label for=\"studUpdate\"></label>");
				writer.print(" <input type=\"text\" id=\"studUpdate\" name=\"studUpdate\">");
				writer.print(" <input type=\"hidden\" id=\"updatetext\" name=\"updatetext\" value="+student_id+">");
				writer.print("<input type=\"submit\" value=\"Update\">");
				writer.print("</form>");
				writer.print("</body></html>");
//				req.setAttribute("studentid", student_id);
//				RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateStudent.html");
//				requestDispatcher.forward(req, resp);
				
			}
			
		}
		
	}
}

