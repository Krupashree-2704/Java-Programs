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

@WebServlet(value = "/updateEmpDetails")
public class UpdateEmpDetails extends HttpServlet {
	static Employees employees=new Employees();
	static EmployeeController employeeController=new EmployeeController();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empChoice = req.getParameter("updateUserDetails");
		int empid =Integer.valueOf(req.getParameter("hiddenempid"));
		String updatedEmpDetial = req.getParameter("updatedEmpDetail");
		PrintWriter writer = resp.getWriter();
		if(empChoice.equals("name"))
		{
			if (employeeController.updateEmpName(empid,updatedEmpDetial)) {
				writer.print("<html><body>");
				writer.print("<h1>Employee Name Updated Successfully....</h1>"
						+ " <a href=\"EmpLogin.html\" style=\"text-decoration: none; color: rgb(101, 1, 101); font-weight: 900; text-align: end; margin-left: 70%;\">Want a New Login?</a>");
				writer.print("</body></html>");
			} 
			else {
				writer.print("<html><body>");
				writer.print("<h1>Employee Name Not Updated......</h1>");
				writer.print("</body></html>");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("readAdminEmp");
				requestDispatcher.include(req, resp);
			}
			
		}
		else if (empChoice.equals("email")) {
			if (employeeController.updateEmpEmail(empid, updatedEmpDetial)) {
				writer.print("<html><body>");
				writer.print("<h1>Employee Email Updated Successfully....</h1>"
						+ " <a href=\"EmpLogin.html\" style=\"text-decoration: none; color: rgb(101, 1, 101); font-weight: 900; text-align: end; margin-left: 70%;\">Want a New Login?</a>");
				writer.print("</body></html>");
			} else {
				writer.print("<html><body>");
				writer.print("<h1>Employee Email Not Updated......</h1>");
				writer.print("</body></html>");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("readAdminEmp");
				requestDispatcher.include(req, resp);
			}
		}
		else if(empChoice.equals("department"))
		{
			if (employeeController.updateEmpDept(empid, updatedEmpDetial)) {
				writer.print("<html><body>");
				writer.print("<h1>Employee Department Updated Successfully....</h1>"
						+ " <a href=\"EmpLogin.html\" style=\"text-decoration: none; color: rgb(101, 1, 101); font-weight: 900; text-align: end; margin-left: 70%;\">Want a New Login?</a>");
				writer.print("</body></html>");
			} else {
				writer.print("<html><body>");
				writer.print("<h1>Employee Department Not Updated......</h1>");
				writer.print("</body></html>");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("readAdminEmp");
				requestDispatcher.include(req, resp);
			}
		}
		else if (empChoice.equals("salary")) {
			if (employeeController.updateEmpSalary(empid, Double.valueOf(updatedEmpDetial))) {
				writer.print("<html><body>");
				writer.print("<h1>Employee Salary Updated Successfully....</h1>"
						+ " <a href=\"EmpLogin.html\" style=\"text-decoration: none; color: rgb(101, 1, 101); font-weight: 900; text-align: end; margin-left: 70%;\">Want a New Login?</a>");
				writer.print("</body></html>");
			} else {
				writer.print("<html><body>");
				writer.print("<h1>Employee Salary Not Updated......</h1>");
				writer.print("</body></html>");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("readAdminEmp");
				requestDispatcher.include(req, resp);
			}
		}
		else
		{
			writer.print("<html><body>");
			writer.print("<h1>Employee Does Not Exists......</h1>");
			writer.print("</body></html>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("EmpLogin.html");
			requestDispatcher.include(req, resp);
		}
		
	}
}
