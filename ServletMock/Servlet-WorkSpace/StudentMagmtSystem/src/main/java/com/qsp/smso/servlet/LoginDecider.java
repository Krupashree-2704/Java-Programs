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



@WebServlet(value="/logindecider")
public class LoginDecider extends HttpServlet{
	static Controller controller=new Controller();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter writer = resp.getWriter();
		
		List<Student> serachStudent = controller.serachStudent();
		
		 if(username.equals("admin")&& password.equals("admin123"))
		 {
			 
			 	writer.print("<html><body>\r\n");
				writer.print("<h1>Welcome "+username+" to ABC College Management System</h1>\r\n");
				writer.print("<form action=\"CreateStudent.html\" id=\"login_Form\" method=\"post\">");
				writer.print("<select name=\"adminopdec\">");
				writer.print(" <option selected disabled hidden>Default</option> ");
				writer.print(" <option>Create</option> ");
				writer.print("<input type=\"submit\" value=\"Create Student\">");
				writer.print("</form>");
				writer.print("<form action=\"readstudentdet\" id=\"login_Form\" method=\"post\">");
				writer.print("<label for=\"studid\">Student ID:</label><br>\r\n"
						+ "  <input type=\"number\" id=\"studid\" name=\"studid\"><br>");
				writer.print("<input type=\"submit\" value=\"Read\">");
				writer.print("</form>");
				writer.print("<form action=\"updatestudent\" id=\"login_Form\" method=\"post\">");
				writer.print("<h3>Update Student Details</h3>");
				writer.print("<label for=\"updatetext\">Enter Student ID:</label>");
				writer.print("<input type=\"number\" id=\"updatetext\" name=\"updatetext\"><br>");
				writer.print("<select name=\"updateStudent\">");
				writer.print("<option selected disabled hidden>Default</option>");
				writer.print(" <option>Update Name</option> ");
				writer.print(" <option>Update Email</option> ");
				writer.print(" <option>Update Address</option> ");
				writer.print(" <option>Update Username</option> ");
				writer.print(" <option>Update Password</option> ");
				writer.print("<label for=\"studUpdate\"></label>");
				writer.print(" <input type=\"text\" id=\"studUpdate\" name=\"studUpdate\">");
				writer.print("<input type=\"submit\" value=\"Update\">");
				writer.print("</form>");
				writer.print("<form action=\"delete\" id=\"login_Form\" method=\"post\">");
				writer.print("<label for=\"studid\">Student ID:</label><br>\r\n"
						+ "  <input type=\"number\" id=\"studid\" name=\"studid\"><br>");
				writer.print("<input type=\"submit\" value=\"Delete\">");
				writer.print("</form>");
				writer.print("</body></html>");
		 }
		 else if(serachStudent!=null)
		 {
			 for (Student student : serachStudent) {
				if ((username.equals(student.getStudent_username())&&password.equals(student.getStudent_password()))&&(username!="admin" && password!="admin123")) {
					writer.print("<html><body>\r\n");
					writer.print("<h1>Welcome "+username+" to ABC College Management System</h1>\r\n");
					writer.print("<form action=\"readadmin\" id=\"login_Form\" method=\"post\">");
//					writer.print("<label for=\"stuid\">Student ID:</label> <br>");
//					writer.print(" <input type=\"number\" name=\"stuid\" id=\"stuid\"> <br>");
					writer.print("<select name=\"readStudent\">");
					writer.print("<option selected disabled hidden>Default</option>");
					writer.print(" <option>Read</option> ");
					System.out.println(username);
					System.out.println(password);
					writer.print("<input type=\"submit\" value=\"Submit\">");
					writer.print("</form>");
					writer.print("</body></html>");
					req.setAttribute("username", username);
					req.setAttribute("password", password);
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("readadmin");
					requestDispatcher.forward(req, resp);
					
				
				}
			
				}
			}
		 else
		 {
			 	writer.print("<html><body>\r\n");
				writer.print("<h1>Login Failed!!!!!!Please Try Again !!!</h1>\r\n");
				writer.print("</body></html>");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("landing.html");
				requestDispatcher.include(req, resp);
		 }
		 }
		 
		 

}
