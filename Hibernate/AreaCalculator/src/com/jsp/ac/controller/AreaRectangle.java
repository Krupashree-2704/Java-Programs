package com.jsp.ac.controller;

import com.jsp.ac.model.Shape;

 public class AreaRectangle extends Area implements Shape{

	
	public int areaRectangle(int length_rectangle,int breadth_rectangle)
	{
		return length_rectangle*breadth_rectangle;
		
	}
	


}
