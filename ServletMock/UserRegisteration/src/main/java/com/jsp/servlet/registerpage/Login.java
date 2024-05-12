package com.jsp.servlet.registerpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;





@WebServlet(value = "/fetch2")
public class Login extends HttpServlet {
	static User info = new User();
	static List<User> users = info.getUser(); 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("users");
		String pass = req.getParameter("passs");
		PrintWriter printWriter = resp.getWriter();
		boolean loginresult = false;
		for (User user2 : users) {
			 if (user2.getUsername().equals(user) && user2.getPassword().equals(pass)) {
	            	loginresult = true;
	            	printWriter.print("<!DOCTYPE html>\r\n"
	            			+ "<html>\r\n"
	            			+ "<head>\r\n"
	            			+ "  <title>Dashboard</title>\r\n"
	            			+ "  <style>\r\n"
	            			+ "    body {\r\n"
	            			+ "      margin: 0;\r\n"
	            			+ "      padding: 0;\r\n"
	            			+ "      background: white;\r\n"
	            			+ "      display: flex;\r\n"
	            			+ "      justify-content: center;\r\n"
	            			+ "      align-items: center;\r\n"
	            			+ "      height: 100vh;\r\n"
	            			+ "    }\r\n"
	            			+ "\r\n"
	            			+ "    .dashboard-box {\r\n"
	            			+ "      width: 400px;\r\n"
	            			+ "      padding: 40px;\r\n"
	            			+ "      background-color: aquamarine;\r\n"
	            			+ "      box-sizing: border-box;\r\n"
	            			+ "      border-radius: 10px;\r\n"
	            			+ "      color: rgb(2, 2, 120);\r\n"
	            			+ "      text-align: center;\r\n"
	            			+ "       border: 2px solid black;"
	            			+ "    }\r\n"
	            			+ "\r\n"
	            			+ "    .dashboard-box h2 {\r\n"
	            			+ "      margin: 0 0 30px;\r\n"
	            			+ "      padding: 0;\r\n"
	            			+ "    }\r\n"
	            			+ "    .info{\r\n"
	            			+ "      \r\n"
	            			+ "      display: flex;\r\n"
	            			+ "     \r\n"
	            			+ "      text-align:center;\r\n"
	            			+ "      justify-content: space-between;\r\n"
	            			+ "    }\r\n"
	            			+ "    .data{\r\n"
	            			+ "      margin-right: 10px;\r\n"
	            			+ "     \r\n"
	            			+ "    }\r\n"
	            			+ "    \r\n"
	            			+ "    .showpass{\r\n"
	            			+ "      display: flex;\r\n"
	            			+ "      \r\n"
	            			+ "    }\r\n"
	            			
	            			+ "    .password {\r\n"
	            			+ "      display: none;\r\n"
	            			+ "    }\r\n"
	            			+ "\r\n"
	            			+ "    .show-password:checked + .data {\r\n"
	            			+ "      display: inline;\r\n"
	            			+ "    }"
	            			+ "    .dashboard-box a {\r\n"
	            			+ "      display: inline-block;\r\n"
	            			+ "      padding: 10px 20px;\r\n"
	            			+ "      color:rgb(2, 2, 120);\r\n"
	            			+ "      font-size: 16px;\r\n"
	            			+ "      text-decoration: none;\r\n"
	            			+ "      background-color: white;"
	            			+ "      transition: .5s;\r\n"
	            			+ "      margin-top: 40px;\r\n"
	            			+ "      border:2px solid black;\r\n"
	            			+ "      border-radius: 5px;\r\n"
	            			+ "    }\r\n"
	            			+ "\r\n"
	            			+ "    .dashboard-box a:hover {\r\n"
	            			+ "      background: green;\r\n"
	            			+ "      color: white;\r\n"
	            			
	            			+ "    }\r\n"
	            			+ "  </style>\r\n"
	            			+ "</head>\r\n"
	            			+ "<body>\r\n"
	            			+ "\r\n"
	            			+ "<div class=\"dashboard-box\">\r\n"
	            			+ "  <h2>User Dashboard</h2>\r\n"
	            			+ " \r\n"
	            			+ " <div class=\"info\">\r\n"
	            			+ "   <p>Name :</p>\r\n"
	            			+ "  <p class=\"data\" >"+user2.getFullName()+"</p>\r\n"
	            			+ " </div>\r\n"
	            			+ " \r\n"
	            			+ "  <div class=\"info\">\r\n"
	            			+ "   <p>Email :</p>\r\n"
	            			+ "  <p class=\"data\">"+user2.getEmail()+"</p>\r\n"
	            			+ " </div>\r\n"
	            			+ "  <div class=\"info\">\r\n"
	            			+ "  <p>Username :</p>\r\n"
	            			+ "  <p class=\"data\">"+user2.getUsername()+"</p>\r\n"
	            			+ " </div>\r\n"
	            			+ "  <a href=\"updatef.html\">Update</a>\r\n"
	            			+ "  <a href=\"default.html\">Go to Home Page</a>\r\n"
	            			+ "</div>\r\n"
	            			+ "\r\n"
	            			+ "</body>\r\n"
	            			+ "</html>\r\n");
	            	
	                break;
	            } 
	        }
			
			if (loginresult == false) {
				printWriter.print("<!DOCTYPE html>\r\n"
						+ "<html>\r\n"
						+ "<head>\r\n"
						+ "  <title>Invalid Login</title>\r\n"
						+ "  <style>\r\n"
						+ "    /* Styles for the login box */\r\n"
						+ "    html {\r\n"
						+ "      height: 100%;\r\n"
						+ "    }\r\n"
						+ "    body {\r\n"
						+ "      margin: 0;\r\n"
						+ "      padding: 0;\r\n"

						+ "      background: white;\r\n"
						+ "      display: flex;\r\n"
						+ "      justify-content: center;\r\n"
						+ "      align-items: center;\r\n"
						+ "      height: 100vh;\r\n"
						+ "    }\r\n"
						+ "\r\n"
						+ "    .login-box {\r\n"
						+ "      position: absolute;\r\n"
						+ "      top: 50%;\r\n"
						+ "      left: 50%;\r\n"
						+ "      width: 400px;\r\n"
						+ "      padding: 40px;\r\n"
						+ "      transform: translate(-50%, -50%);\r\n"
						+ "      background: aquamarine;\r\n"
						+ "      box-sizing: border-box;\r\n"
						+ "      border:2px solid black;\r\n"
						+ "      border-radius: 10px;\r\n"
						+ "      text-align: center;\r\n"
						+ "      color: rgb(2, 2, 120);\r\n"
						+ "    }\r\n"
						+ "\r\n"
						+ "    .login-box h2 {\r\n"
						+ "      margin: 0 0 30px;\r\n"
						+ "      padding: 0;\r\n"
						+ "    }\r\n"
						+ "\r\n"
						+ "    .login-box a {\r\n"
						+ "      display: inline-block;\r\n"
						+ "      padding: 10px 20px;\r\n"
						+ "      background:white;"
						+ "      color: rgb(2, 2, 120);\r\n"
						+ "      font-size: 16px;\r\n"
						+ "      text-decoration: none;\r\n"
						+ "      overflow: hidden;\r\n"
						+ "      transition: .5s;\r\n"
						+ "      margin-top: 20px;\r\n"
						+ "      border:2px solid black;"
						+ "      border-radius: 5px;\r\n"
						+ "    }\r\n"
						+ "\r\n"
						+ "    .login-box a:hover {\r\n"
						+ "      background: green;\r\n"
						+ "      color: #fff;\r\n"
						+ "    }\r\n"
						+ "  </style>\r\n"
						+ "</head>\r\n"
						+ "<body>\r\n"
						+ "\r\n"
						+ "<div class=\"login-box\">\r\n"
						+ "  <h2>Invalid Login</h2>\r\n"
						+ "  <p>Your username or password is incorrect. Please try again.</p>\r\n"
						+ "  <a href=\"login.html\">Go back to Login</a> \r\n"
						+ "  <a href=\"signup.html\">Go to Register</a>\r\n"
						+ "</div>\r\n"
						+ "\r\n"
						+ "</body>\r\n"
						+ "</html>\r\n");
			
			}
	}
}
