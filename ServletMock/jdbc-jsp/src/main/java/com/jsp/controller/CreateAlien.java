package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.jsp.dao.AlienDAO;
import com.jsp.model.Alien;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value="/createAlien")
public class CreateAlien extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int aid = Integer.parseInt(req.getParameter("id"));
		String aname = req.getParameter("fullname");
		String atechused = req.getParameter("tech");
		
		Alien alien = new Alien();
		alien.setAid(aid);
		alien.setAname(aname);
		alien.setAtech(atechused);
		
		PrintWriter writer = resp.getWriter();
		
		AlienDAO dao = new AlienDAO();
		if (dao.createAlien(alien)>0) {
			writer.print("<h1>Alien Inserted...</h1>");
		} else {
			writer.print("<h1>Alien Not Inserted...</h1>");
		}
	}

}
