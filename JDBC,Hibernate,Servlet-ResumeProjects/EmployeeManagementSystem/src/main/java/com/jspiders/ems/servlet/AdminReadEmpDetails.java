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

@WebServlet(value="/readAdminEmp")
public class AdminReadEmpDetails extends HttpServlet{
	static EmployeeController employeeController=new EmployeeController();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empidread = req.getParameter("readempid");
		int empid_read = Integer.valueOf(empidread);
		PrintWriter writer = resp.getWriter();
		Employees readParticularEmployee = employeeController.readParticularEmployee(empid_read);
		if(employeeController.readParticularEmployee(empid_read)!=null)
		{
			writer.print("<html><body>");
			writer.print("<h1>Employee Details:</h1>"
					+ "<h5>Employee ID : "+readParticularEmployee.getId()+"</h5>"+
					"<h5>Employee FullName : "+readParticularEmployee.getName()+"</h5>"+
					"<h5>Employee Department : "+readParticularEmployee.getDept()+"</h5>"
					+ "<h5>Employee Salary : "+readParticularEmployee.getSal()+"</h5>"
					+ "<h5>Employee Contact : "+readParticularEmployee.getContact()+"</h5>"
					+ "<h5>Employee Email : "+readParticularEmployee.getEmail()+"</h5>"
					+ "<h5>Employee Username : "+readParticularEmployee.getUsername()+"</h5>"
					+ "<h2>Update Employee </h2>"
					+"<form action=\"updateEmpDetails\" method=\"post\">\r\n"
					+ "            <h3>Select Appropriate Option from Drop Down for Updating Detail</h3>\r\n"
					+ "			   <p>Update One Detail at a time</p>\r\n"
					+ "            <input type=\"hidden\" id=\"hiddenid\" name=\"hiddenempid\" value="+readParticularEmployee.getId()+"><br>\r\n"
					+ "            <select name=\"updateUserDetails\" id=\"updateDetails\"> \r\n"
					+ "                <option value=\"default\" selected disabled hidden>Select an Option</option>\r\n"
					+ "                <option value=\"name\">Employee Name</option> \r\n"
					+ "                <option value=\"email\">Employee Email</option> \r\n"
					+ "                <option value=\"department\">Employee Department </option> \r\n"
					+ "                <option value=\"salary\">Employee Salary</option> \r\n"
					+ "            </select> \r\n"
					+ "            <input type=\"text\" id=\"updatedText\" name=\"updatedEmpDetail\"><br> <br>\r\n"
					+ "            <input type=\"submit\" value=\"Update\">\r\n"
					+ "        </form>"
					
					+" <a href=\"EmpLogin.html\" style=\"text-decoration: none; color: rgb(101, 1, 101); font-weight: 900; text-align: end; margin-left: 70%;\">Want a New Login?</a>");
			writer.print("</body></html>");
		}
		else
		{
			writer.print("<html><body>");
			writer.print("<h4>Employee with given Employee ID Does not exists!!!Please Enter Correct Employee ID!!!</h4>"
					+ "<a href=\"EmpLogin.html\" style=\"text-decoration: none; color: rgb(101, 1, 101); font-weight: 900; text-align: end; margin-left: 70%;\"> Login Again</a>");
			writer.print("</body></html>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("login");
			requestDispatcher.include(req, resp);
		}
	}
}
