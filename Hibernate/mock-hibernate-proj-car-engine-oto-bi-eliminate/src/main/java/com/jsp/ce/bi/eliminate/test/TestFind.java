package com.jsp.ce.bi.eliminate.test;

import com.jsp.ce.bi.eliminate.controller.Controller;
import com.jsp.ce.bi.eliminate.model.Car;
import com.jsp.ce.bi.eliminate.model.Engine;import com.sun.xml.bind.v2.runtime.reflect.NullSafeAccessor;

public class TestFind {
	static Controller controller=new Controller();
	public static void main(String[] args) {
		Car findCarandEngine = controller.findCarandEngine(1);
		if (findCarandEngine!=null) {
			System.out.println("Car ID:"+findCarandEngine.getId());
			System.out.println("Car Name:"+findCarandEngine.getCar_name());
			System.out.println("Car Chasis:"+findCarandEngine.getChasis());
			System.out.println("Car InsertInfo:"+findCarandEngine.getCar_inserted());
			System.out.println("Car UpdateInfo:"+findCarandEngine.getCar_update());
			Engine engine = findCarandEngine.getEngine();
			if (engine!=null) {
				System.out.println("Engine ID:"+engine.getId());
				System.out.println("Engine CC:"+engine.getCc());
				System.out.println("Engine No of Engines:"+engine.getNo_of_engine());
				System.out.println("Engine InsertDate:"+engine.getEngine_insert());
			}
			
		} else {
			System.out.println("Car and its associated engine not found");
		}
		Engine findEngineandCar = controller.findEngineandCar(2);
		if (findEngineandCar!=null) {
			System.out.println("Engine ID:"+findEngineandCar.getId());
			System.out.println("Engine CC:"+findEngineandCar.getCc());
			System.out.println("Engine No of Engines:"+findEngineandCar.getNo_of_engine());
			System.out.println("Engine InsertDate:"+findEngineandCar.getEngine_insert());
			Car car = findEngineandCar.getCar();
			if (car!=null) {
				System.out.println("Car ID:"+car.getId());
				System.out.println("Car Name:"+car.getCar_name());
				System.out.println("Car Chasis:"+car.getChasis());
				System.out.println("Car InsertInfo:"+car.getCar_inserted());
				System.out.println("Car UpdateInfo:"+car.getCar_update());
			}
		} else {
			System.out.println("Engine and its associated car not found");
		}
		
	}
}
