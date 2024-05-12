package controller;

import java.io.IOException;
import java.io.PrintWriter;

import entity.CollStudent;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class CollController extends HttpServlet{
	RegisterStudent registerStudent=new RegisterStudent();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CollStudent coll=new CollStudent();
		String student_name=(String)req.getParameter("name");
		String student_email=(String)req.getParameter("email");
		String student_gender=(String)req.getParameter("gen");
		String student_location=(String)req.getParameter("loc");
		String student_stream=(String)req.getParameter("stream");
		long student_contact=Long.valueOf(req.getParameter("contact"));
		
		coll.setName(student_name);
		coll.setEmail(student_email);
		coll.setGender(student_gender);
		coll.setLocation(student_location);
		coll.setStream(student_stream);
		coll.setContact(student_contact);
		
		PrintWriter writer = resp.getWriter();
		if (registerStudent.insertStudent(coll)>0) {
			writer.print("<h1>Registeration Successful.</h1>");
		} else {
			writer.print("<h1>Registeration Failed.Please Try Again....</h1>");
			writer.print("<a href=\"UserRegister.jsp\">User Registeration</a>");
		}
	}
	
	

}
