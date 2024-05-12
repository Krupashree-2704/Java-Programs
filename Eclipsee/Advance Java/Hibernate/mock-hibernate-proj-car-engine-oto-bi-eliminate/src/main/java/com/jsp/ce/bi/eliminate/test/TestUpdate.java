package com.jsp.ce.bi.eliminate.test;

import com.jsp.ce.bi.eliminate.controller.Controller;


public class TestUpdate {
	static Controller controller=new Controller();
	public static void main(String[] args) {
		
		String carname="Mercedes";
		int car_id=1;
		if (controller.updateCarName(carname, car_id)) {
			System.out.println("Car Name updated");
		} else {
			System.out.println("Car Name not updated");
		}

	}

}
