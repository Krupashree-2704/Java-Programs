package com.jsp.sms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.sms.controller.Controller;
import com.jsp.sms.model.Student;

@WebServlet(value="/readstudentdet")
public class ReadAdminStudent extends HttpServlet {
	static Controller controller=new Controller();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String studentid = req.getParameter("studid");
		int student_id = Integer.parseInt(studentid);
		
		PrintWriter writer = resp.getWriter();
		
		List<Student> serachStudent = controller.serachStudent();
		for (Student student : serachStudent) {
			if (student.getId()==student_id) {
				writer.print("<html><body>");
				writer.print("<p>Student ID:"+student.getId()+"</p>");
				writer.print("<p>Student Name:"+student.getStudent_name()+"</p>");
				writer.print("<p>Student Email:"+student.getStudent_email()+"</p>");
				boolean student_gender = student.isStudent_gender();
				if (student_gender==true) {
					writer.print("<p>Student Gender:Female</p>");
				} else {
					writer.print("<p>Student Gender:Male</p>");
				}
				writer.print("<p>Student Address:"+student.getStudent_address()+"</p>");
				writer.print("<p>Student Branch:"+student.getStudent_branch()+"</p>");
				writer.print("<p>Student Username:"+student.getStudent_username()+"</p>");
//				writer.print("<form action=\"updateStudent.html\" id=\"login_Form\" method=\"post\">");
//				writer.print("<select name=\"updatestudent\">");
//				writer.print("<option selected disabled hidden>Default</option>");
//				writer.print(" <option>Update</option> ");
//				writer.print("<input type=\"submit\" value=\"Update\">");
				writer.print("</form>");
				writer.print("</body></html>");
			
			}
		}
	}
}
