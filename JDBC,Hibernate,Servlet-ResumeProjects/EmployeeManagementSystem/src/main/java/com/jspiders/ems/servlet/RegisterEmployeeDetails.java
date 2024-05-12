package com.jspiders.ems.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.jspiders.ems.controller.EmployeeController;
import com.jspiders.ems.model.Employees;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value="/registeremp")
public class RegisterEmployeeDetails extends HttpServlet{
	
	static EmployeeController employeeController=new EmployeeController();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employees empolyees=new Employees();
		String fullname = req.getParameter("fname");
		empolyees.setName(fullname);
		String emailid = req.getParameter("email");
		empolyees.setEmail(emailid);
		String department = req.getParameter("dept");
		empolyees.setDept(department);
		String salary = req.getParameter("sal");
		double sal = Double.valueOf(salary);
		empolyees.setSal(sal);
		String contactno = req.getParameter("contact");
		long contact = Long.valueOf(contactno);
		empolyees.setContact(contact);
		String username = req.getParameter("username");
		empolyees.setUsername(username);
		String password = req.getParameter("password");
		empolyees.setPassword(password);
		
		PrintWriter writer = resp.getWriter();
		
		if (employeeController.insertEmployee(empolyees)) {
			writer.print("<html><body style=\"align-items: center; background-color: rgb(213, 255, 241);\">");
			writer.print("<h1 style=\"color: tomato;\">Employee Details Inserted Successfully!!!!</h1>");
			writer.print("<a href=\"EmpLogin.html\" style=\"text-decoration: none; color: rgb(101, 1, 101); font-weight: 900; text-align: end; margin-left: 70%;\">Want a New Login?</a>");
			writer.print("</body></html>");
		} else {
			writer.print("<html><body  style=\"align-items: center; background-color: rgb(213, 255, 241);\">");
			writer.print("<h1 style=\"color: tomato;\">Employee Details Not Inserted Successfully!!!!</h1>");
			writer.print("</body></html>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("login");
			requestDispatcher.include(req, resp);
		}
	}
}
