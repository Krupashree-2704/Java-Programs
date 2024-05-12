package com.qsp.smso.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qsp.smso.controller.Controller;

@WebServlet(value="/delete")
public class DeleteStudent extends HttpServlet{
	static Controller controller=new Controller();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			String studentid = req.getParameter("studid");
			int student_id = Integer.parseInt(studentid);
			
			PrintWriter writer = resp.getWriter();
			
			if (controller.deleteStudent(student_id)) {
				writer.print("<html><body>");
				writer.print("<h1>Student Deleted Successfully</h1>");
				writer.print("</body></html>");
			} else {
				writer.print("<html><body>");
				writer.print("<h1>Student Not Deleted Successfully Pls Enter Student ID Correctly!!!</h1>");
				writer.print("</body></html>");
			}
			resp.sendRedirect("landing.html");
	}
}
