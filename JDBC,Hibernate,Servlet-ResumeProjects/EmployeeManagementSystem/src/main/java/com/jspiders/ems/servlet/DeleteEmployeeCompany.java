package com.jspiders.ems.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.jspiders.ems.controller.EmployeeController;
import com.jspiders.ems.model.Employees;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value="/deleteEmployee")
public class DeleteEmployeeCompany extends HttpServlet{
	static EmployeeController employeeController=new EmployeeController();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int deleteEmpID = Integer.valueOf(req.getParameter("deleteempid"));
		List<Employees> readAllEmployees = employeeController.readAllEmployees();
		PrintWriter writer = resp.getWriter();
		for (Employees employees : readAllEmployees) {
			if (employees.getId()==deleteEmpID) {
				writer.print("<html><body>");
				writer.print("<h1>Employee Deleted Successfully!!!</h1>"
						+ " <a href=\"EmpLogin.html\" style=\"text-decoration: none; color: rgb(101, 1, 101); font-weight: 900; text-align: end; margin-left: 70%;\">Click Here To Login?</a>");
				writer.print("</body></html>");
			} else {
				writer.print("<html><body>");
				writer.print("<h1>Employee With Given ID Does Not Exists Employee Not Deleted Successfully!!!</h1>"
						+ " <a href=\"EmpLogin.html\" style=\"text-decoration: none; color: rgb(101, 1, 101); font-weight: 900; text-align: end; margin-left: 70%;\">Click Here To Login?</a>");
				writer.print("</body></html>");
			}
		}
		
	}
}
