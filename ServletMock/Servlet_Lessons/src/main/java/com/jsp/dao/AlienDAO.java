package com.jsp.dao;

import com.jsp.model.Alien;

public class AlienDAO {
	public Alien getAlien(int aid)
	{
		Alien alien = new Alien();
		alien.setAid(12);
		alien.setAname("Krupa");
		alien.setAtech("Java");
		return alien;
	}
}
