package com.jsp.servlet.registerpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet(value = "/update")
public class UpdateServlet extends HttpServlet {

	
	static List<User> infos = User.getUser();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String newEmail = req.getParameter("newEmail");
		PrintWriter printWriter = resp.getWriter();
		boolean updateloop = false;
		for (User userInfo : infos) {
			if (userInfo.getUsername().equals(username) && userInfo.getPassword().equals(password)) {
				userInfo.setEmail(newEmail);
				printWriter.print("<!DOCTYPE html>\r\n"
						+ "<html>\r\n"
						+ "<head>\r\n"
						+ "  <title>Email Updated</title>\r\n"
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
						+ "    .login-box {\r\n"
						+ "      position: absolute;\r\n"
						+ "      top: 50%;\r\n"
						+ "      left: 50%;\r\n"
						+ "      width: 400px;\r\n"
						+ "      padding: 40px;\r\n"
						+ "      transform: translate(-50%, -50%);\r\n"
						+ "      background-color: aquamarine;\r\n"
						+ "      box-sizing: border-box;\r\n"
						+ "      border:2px solid black;\r\n"
						+ "      border-radius: 10px;\r\n"
						+ "      text-align: center;\r\n"
						+ "      color:rgb(2, 2, 120);\r\n"
						+ "    }\r\n"
						+ "\r\n"
						+ "    .login-box h2 {\r\n"
						+ "      margin: 0 0 30px;\r\n"
						+ "      padding: 0;\r\n"
						+ "    }\r\n"
						+ "\r\n"
						+ "    .login-box p {\r\n"
						+ "      margin-bottom: 20px;\r\n"
						+ "    }\r\n"
						+ "\r\n"
						+ "    .login-box a {\r\n"
						+ "      display: inline-block;\r\n"
						+ "      padding: 10px 20px;\r\n"
						+ "      color:rgb(2, 2, 120);\r\n"
						+ "      font-size: 16px;\r\n"
						+ "      text-decoration: none;\r\n"
						+ "      background:white;\r\n"
						+ "      border:2px solid black;\r\n"
						+ "      overflow: hidden;\r\n"
						+ "      transition: .5s;\r\n"
						+ "      margin-top: 20px;\r\n"
						+ "      border-radius: 5px;\r\n"
						+ "    }\r\n"
						+ "\r\n"
						+ "    .login-box a:hover {\r\n"
						+ "      background: green;\r\n"
						+ "      color:white;\r\n"
						+ "    }\r\n"
						+ "  </style>\r\n"
						+ "</head>\r\n"
						+ "<body>\r\n"
						+ "\r\n"
						+ "<div class=\"login-box\">\r\n"
						+ "  <h2>Email Updated</h2>\r\n"
						+ "  <p>Your email has been successfully updated.</p>\r\n"
						+ "  <a href=\"login.html\">Go to Login</a> \r\n"
						+ "</div>\r\n"
						+ "\r\n"
						+ "</body>\r\n"
						+ "</html>\r\n"
						+ "");
				updateloop = true;
				break;
			}
		}
		
		
		
		if (updateloop == false) {
			printWriter.print("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "  <title>Email Not Updated</title>\r\n"
					+ "  <style>\r\n"
					+ "    /* Styles for the message */\r\n"
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
					+ "      color: rgb(2, 2, 120);\r\n"
					+ "      font-size: 16px;\r\n"
					+ "      text-decoration: none;\r\n"
					+ "      overflow: hidden;\r\n"
					+ "      transition: .5s;\r\n"
					+ "      margin-top: 20px;\r\n"
					+ "      border-radius: 5px;\r\n"
					+ "      background:white;\r\n"
					+ "      border:2px solid black;\r\n"
					+ "    }\r\n"
					+ "\r\n"
					+ "    .login-box a:hover {\r\n"
					+ "      background: green;\r\n"
					+ "      color: white;\r\n"
				
					+ "    }\r\n"
					+ "  </style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "\r\n"
					+ "<div class=\"login-box\">\r\n"
					+ "  <h2>Email Not Updated</h2>\r\n"
					+ "  <p>The email update failed. Please try again.</p>\r\n"
					+ "  <a href=\"updatef.html\">Go back to DashBoard</a>\r\n"
					+ "  <a href=\"default.html\">Go to Home Page</a>\r\n"
					+ "</div>\r\n"
					+ "\r\n"
					+ "</body>\r\n"
					+ "</html>\r\n"
					+ "");
		}
		
	}
}
