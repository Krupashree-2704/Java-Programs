package com.qsp.hs.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/pagec")
public class PageC extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Page C Triggered </h1>");
		HttpSession session = req.getSession(false);
//		Enumeration<String> attributeNames = session.getAttributeNames();
//		Enumeration is an Interface of user defined type
//		while (attributeNames.hasMoreElements()) {
//            String name = attributeNames.nextElement();
//            writer.print("<h1>Name:"+name+"</h1>");
//		}
		session.removeAttribute("sample");
//		Execution sequence A-B-C-B
	}
}
