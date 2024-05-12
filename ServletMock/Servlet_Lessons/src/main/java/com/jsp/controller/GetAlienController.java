package com.jsp.controller;

import java.io.IOException;

import com.jsp.dao.AlienDAO;
import com.jsp.model.Alien;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet(value="/getAlien")
public class GetAlienController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int getID =Integer.parseInt(req.getParameter("id"));
		AlienDAO dao = new AlienDAO();
		Alien alien = dao.getAlien(getID);
		
		System.out.println(getID);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("showAlien.jsp");
		requestDispatcher.forward(req, resp);
		
	}
}
