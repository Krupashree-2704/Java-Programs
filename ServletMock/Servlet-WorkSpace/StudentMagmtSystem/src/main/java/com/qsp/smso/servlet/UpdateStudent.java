package com.qsp.smso.servlet;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qsp.smso.controller.Controller;



@WebServlet(value="/updatestudent")
public class UpdateStudent extends HttpServlet{

	static Controller controller=new Controller();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
		int studentID = Integer.parseInt(req.getParameter("updatetext"));
		System.out.println(studentID);
//		req.setAttribute("studentID", studentID);
		PrintWriter writer = resp.getWriter();
//		writer.print("<html><body>");
//		writer.print("<form action=\"updatefinalresult\" id=\"login_Form\" method=\"post\">");
//		writer.print("<select name=\"updateselector\">");
//		writer.print("<option selected disabled hidden>Default</option>");
//		writer.print(" <option>Name</option> ");
//		writer.print(" <option>Email</option> ");
//		writer.print(" <option>Address</option> ");
//		writer.print(" <option>Branch</option> ");
//		writer.print(" <option>Contact</option> ");
//		writer.print(" <option>Username</option> ");
//		writer.print(" <option>Password</option> ");
//		writer.print("<input type=\"text\" name=\"updatetext\">");
//		writer.print("  <input type=\"submit\" value=\"Update\">");
//		writer.print("</form>");
//		writer.print("</body></html>");
//		String studentid = req.getParameter("updateidtext");
//		int student_id=Integer.parseInt(studentid);
		String updatedValue = req.getParameter("updateStudent");
		System.out.println(updatedValue);
		if (updatedValue.equalsIgnoreCase("Update Name")) {
			String updatedName = req.getParameter("studUpdate");
			if (controller.updateStudentName(studentID, updatedName)) {
				writer.print("<html><body>");
				writer.print("<h1>Student Name Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Name Updated");
			} else {
				writer.print("<html><body>");
				writer.print("<h1>Student Name Not Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Name not updated");
			}
//			student.setStudent_name(updatedName);
		}
		else if(updatedValue.equalsIgnoreCase("Update Email"))
		{
			String updatedEmail = req.getParameter("studUpdate");
			if (controller.updateStudentEmail(studentID, updatedEmail)) {
				writer.print("<html><body>");
				writer.print("<h1>Student Email Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Email Updated");
			} else {
				writer.print("<html><body>");
				writer.print("<h1>Student Email Not Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Email Not Updated");
			}
//			student.setStudent_email(updatedEmail);
		}
		else if(updatedValue.equalsIgnoreCase("Update Address"))
		{
			String updatedAddress = req.getParameter("studUpdate");
			if(controller.updateStudentAddress(studentID, updatedAddress)) {
				writer.print("<html><body>");
				writer.print("<h1>Student Address Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Address Updated");
			}
			else
			{
				writer.print("<html><body>");
				writer.print("<h1>Student Address Not Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Address Not Updated");
			}
//			student.setStudent_address(updatedAddress);
		}
		else if(updatedValue.equalsIgnoreCase("Update Branch"))
		{
			String updatedBranch = req.getParameter("studUpdate");
//			student.setStudent_branch(updatedBranch);
			if (controller.updateStudentBranch(studentID, updatedBranch)) {
				writer.print("<html><body>");
				writer.print("<h1>Student Branch Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Branch Updated");
			} else {
				writer.print("<html><body>");
				writer.print("<h1>Student Branch Not Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Branch Not Updated");
			}
		}
		else if(updatedValue.equalsIgnoreCase("Update contact"))
		{
			long updatedContact =(long) Long.parseLong(req.getParameter("studUpdate"));
//			student.setStudent_contact(updatedContact);
			if (controller.updateStudentContact(studentID, updatedContact)) {
				writer.print("<html><body>");
				writer.print("<h1>Student Contact Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Contact Updated");
			} else {
				writer.print("<html><body>");
				writer.print("<h1>Student Contact Not Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Contact not updated");
			}
		}
		else if(updatedValue.equalsIgnoreCase("Update username"))
		{
			String updatedUsername = req.getParameter("studUpdate");
			if (controller.updateStudentUsername(studentID, updatedUsername)) {
				writer.print("<html><body>");
				writer.print("<h1>Student Username Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Username Updated");
			} else {
				writer.print("<html><body>");
				writer.print("<h1>Student Username Not Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Username Not Updated");
			}
//			student.setStudent_username(updatedUsername);
		}
		else if (updatedValue.equalsIgnoreCase("Update password")) {
			String updatedPassword = req.getParameter("studUpdate");
			if (controller.updateStudentPassword(studentID, updatedPassword)) {
				writer.print("<html><body>");
				writer.print("<h1>Student Password Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Password Updated");
			} else {
				writer.print("<html><body>");
				writer.print("<h1>Student Password Not Updated Successfully!!!</h1>");
				writer.print("</body></html>");
//				System.out.println("Student Password Not Updated");
			} 
//			student.setStudent_username(updatedPassword);
		}
		else {
			writer.print("<html><body>");
			writer.print("<h1>Student ID is not matching Update Operation Not Performed!!!</h1>");
			writer.print("</body></html>");
		}
		writer.print("<html><body>");
		writer.print("<a href=\"landing.html\">Landing Page</a>");
		writer.print("</body></html>");
		
////		req.getRequestDispatcher(""
		
	}
}
