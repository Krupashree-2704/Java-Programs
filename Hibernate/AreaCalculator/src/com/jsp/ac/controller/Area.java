package com.jsp.ac.controller;

import com.jsp.ac.model.Shape;

public class Area implements Shape {

	
	public double areaCircle(double radius_circle) {
		
		return 3.14*radius_circle*radius_circle;
	}

	
	public int areaRectangle(int length_rectangle, int breadth_rectangle) {
		
		return length_rectangle*breadth_rectangle;
	}

	
	public double areaTriangle(int base_triangle, double height_rectangle) {
		
		return 0.5*base_triangle*height_rectangle;
	}

	

}
