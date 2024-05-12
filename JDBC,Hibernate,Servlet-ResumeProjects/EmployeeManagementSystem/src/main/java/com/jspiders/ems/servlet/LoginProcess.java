package com.jspiders.ems.servlet;

import java.io.IOException;
//import java.net.http.HttpClient;
import java.io.PrintWriter;
import java.util.List;

import com.jspiders.ems.controller.EmployeeController;
import com.jspiders.ems.model.Employees;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginProcess extends HttpServlet{
	static EmployeeController employeeController=new EmployeeController();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		
		PrintWriter writer = resp.getWriter();
		
		if (user.equals("admin")&&pass.equals("admin123")) {
			writer.print("<html><body style=\"align-items: center; background-color: rgb(213, 255, 241);\">");
			writer.print(" <h1 style=\"text-align: center; color: blueviolet;\">Welcome to AhilyaDevi Water Service</h1>\r\n"
					+ "    <form action=\"insertEmp.html\" style=\"border: 2px solid rgb(55, 0, 107);border-radius: 3px;text-align: center; width: 80%; margin: auto;\">\r\n"
					+ "        <h3 style=\"color: brown ;\">Insert New Employee</h3>\r\n"
					+ "        <p style=\"color: tomato;\">To Enter New Employee Details into Company Record Pls Click here...</p>\r\n"
					+ "        <input type=\"submit\" value=\"InsertDetails\" style=\"padding: 10px; margin-bottom: 20px;margin-top: 30px;\">\r\n"
					+ "    </form>"
					+ "<form action=\"readAdminEmp\" method=\"post\" style=\"border: 2px solid rgb(55, 0, 107);border-radius: 3px;text-align: center; width: 80%; margin: 10px auto;\">\r\n"
					+ "        <h3 style=\"color: brown ;\">Read Employee</h3>\r\n"
					+ "        <p style=\"color: tomato;\">Fetch Employee Details by putting appropriate Employee ID</p>\r\n"
					+ "        <input type=\"number\" name=\"readempid\"><br>\r\n"
					+ "        <input type=\"submit\" value=\"ReadDetails\" style=\"padding: 10px; margin-bottom: 20px;margin-top: 30px;\">\r\n"
					+ "    </form>\r\n"
					+ "<form action=\"deleteEmployee\" method=\"post\" style=\"border: 2px solid rgb(55, 0, 107);border-radius: 3px;text-align: center; width: 80%; margin: 10px auto;\">\r\n"
					+ "        <h3 style=\"color: brown ;\">Delete Employee</h3>\r\n"
					+ "        <p style=\"color: tomato;\">Remove Employee from Company by putting appropriate Employee ID</p>\r\n"
					+ "        <input type=\"number\" name=\"deleteempid\"><br>\r\n"
					+ "        <input type=\"submit\" value=\"Delete Employee\" style=\"padding: 10px; margin-bottom: 20px;margin-top: 30px;\">\r\n"
					+ "    </form>"
					+ "    <br>\r\n"
					+ "    <a href=\"EmpLogin.html\" style=\"text-decoration: none; color: rgb(101, 1, 101); font-weight: 900; text-align: end; margin-left: 70%;\">Want a New Login?</a>");
			writer.print("</body></html>");
		} 
		else if (user!="admin"&&pass!="admin123") {
			List<Employees> readAllEmployees = employeeController.readAllEmployees();
			for (Employees employees : readAllEmployees) {
				if (employees.getUsername().equals(user)&&employees.getPassword().equals(pass)) {
					writer.print("<html>");
					writer.print("<body style=\"align-items: center; background-color: rgb(213, 255, 241);  border: 6px solid blueviolet; width: 50%; margin: 40px auto;\">\r\n"
							+ "    <h1 style=\"color: brown ; text-align: center;\">Hello "+employees.getUsername()+" to AhilyaDevi Water Service</h1>\r\n"
							+ "    <u style=\"color: blue; text-align: center;\"><h2 style=\"color: red;\">User Information</h2></u>\r\n"
							+ "    <div style=\"background-color: aliceblue; border: 4px solid black; width: 50%; margin: 0 auto; margin-bottom: 20px; color: rgb(130, 130, 58);\">\r\n"
							+ "        <h4 style=\"margin-left: 10px; \">Employee ID : "+employees.getId()+"</h4>\r\n"
							+ "        <h4 style=\"margin-left: 10px; \">Full Name : "+employees.getName()+"</h4>\r\n"
							+ "        <h4 style=\"margin-left: 10px; \">Email ID : "+employees.getEmail()+"</h4>\r\n"
							+ "        <h4 style=\"margin-left: 10px;\">Department : "+employees.getDept()+"</h4>\r\n"
							+ "        <h4 style=\"margin-left: 10px; \">Salary : "+employees.getSal()+"</h4>\r\n"
							+ "        <h4 style=\"margin-left: 10px; \">Contact Number : "+employees.getContact()+"</h4>\r\n"
							+ "        <h4 style=\"margin-left: 10px; \">Username : "+employees.getUsername()+"</h4>\r\n"
							+ "        <div> <h4 style=\"margin-left: 10px; \">Password : <input type=\"password\" value="+employees.getPassword()+" id=\"myInput\" style=\"border: none; background-color: aliceblue; font-weight: 600; font-family: Arial, Helvetica, sans-serif; color: rgb(130, 130, 58);\"><br><br></h4>\r\n"
							+ "            <input type=\"checkbox\" onclick=\"myFunction()\" style=\"margin-left: 10px; margin-bottom: 10px; color: rgb(130, 130, 58);\">Show Password</div>\r\n"
							+ "    </div>\r\n"
							+ " <a href=\"EmpLogin.html\" style=\"text-decoration: none; color: rgb(101, 1, 101); font-weight: 900; text-align: end; margin-left: 70%;\">Want a New Login?</a>"
							+ "   \r\n"
							+ "   \r\n"
							+ "    <script>\r\n"
							+ "        function myFunction() {\r\n"
							+ "            var x = document.getElementById(\"myInput\");\r\n"
							+ "            if (x.type === \"password\") {\r\n"
							+ "                x.type = \"text\";\r\n"
							+ "            } else {\r\n"
							+ "                x.type = \"password\";\r\n"
							+ "            }\r\n"
							+ "        }\r\n"
							+ "    </script>\r\n"
							+ "</body>");
					writer.print("</html>");
				}
				else
				{
					writer.print("<html><body>");
					writer.print("<p>Invalid Login</p>");
					writer.print("</body></html>");
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("EmpLogin.html");
					requestDispatcher.include(req, resp);
				}
			}			
		}
		else {
			writer.print("<html><body>");
			writer.print("<p>Invalid Login</p>");
			writer.print("</body></html>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("EmpLogin.html");
			requestDispatcher.include(req, resp);
		}
	}
}
