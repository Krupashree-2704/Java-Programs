package com.jsp.ac.view;

import java.util.Scanner;



import com.jsp.ac.controller.AreaCircle;
import com.jsp.ac.controller.AreaRectangle;



public class AreaCalculator {
	static Scanner myScanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("1.Area of Circle\n2.Area of Rectangle\n3.Area of Traingle");
		int userChoice=myScanner.nextInt();
		myScanner.nextLine();
		switch (userChoice) {
		case 1:
			System.out.println("Enter Radius of Circle:");
			int radius=myScanner.nextInt();
			myScanner.nextLine();
			AreaCircle areaCircle = new AreaCircle();
			double areaofCircle = areaCircle.areaCircle(radius);
			System.out.println("Area of Circle :"+areaofCircle);
			break;
		case 2:
			System.out.println("Enter Length of Rectangle:");
			int length_rectangle=myScanner.nextInt();
			myScanner.nextLine();
			System.out.println("Enter Breadth of Rectangle:");
			int breadth_rectangle=myScanner.nextInt();
			myScanner.nextLine();
			AreaRectangle areaRectangle = new AreaRectangle();
			int areaofRectangle = areaRectangle.areaRectangle(length_rectangle, breadth_rectangle);
			System.out.println("Area of Rectangle :"+areaofRectangle);
			break;
		case 3:

			break;

		default:
			break;
		}

	}

}
