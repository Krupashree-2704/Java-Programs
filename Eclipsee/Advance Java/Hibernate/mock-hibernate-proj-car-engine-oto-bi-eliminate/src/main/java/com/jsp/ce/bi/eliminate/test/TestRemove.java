package com.jsp.ce.bi.eliminate.test;

import com.jsp.ce.bi.eliminate.controller.Controller;

public class TestRemove {
	static Controller controller=new Controller();
	public static void main(String[] args) {
		int car_id=1;
		if (controller.removeCarandEngine(car_id)) {
			System.out.println("Car and it's associated Engine removed");
		} else {
			System.out.println("Car and it's associated Engine not removed");
		}

	}

}
