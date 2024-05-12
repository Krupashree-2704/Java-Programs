package com.jsp.ce.bi.eliminate.test;

import com.jsp.ce.bi.eliminate.controller.Controller;
import com.jsp.ce.bi.eliminate.model.Car;
import com.jsp.ce.bi.eliminate.model.Engine;

public class TestInsert {
	static Controller controller=new Controller();
	public static void main(String[] args) {
		Car car = new Car();
		car.setCar_name("Ferrari");
		car.setChasis("F24s");
		
		Engine engine = new Engine();
		engine.setCc(100);
		engine.setNo_of_engine((byte)3);
		
		car.setEngine(engine);
		engine.setCar(car);
		
		if (controller.insert(car,engine)) {
			System.out.println("Car and Engine Inserted");
		} else {
			System.out.println("Car and Engine Not Inserted");
		}

	}

}
