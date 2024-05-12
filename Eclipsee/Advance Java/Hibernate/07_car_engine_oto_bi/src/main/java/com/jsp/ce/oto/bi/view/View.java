package com.jsp.ce.oto.bi.view;

import java.util.List;
import java.util.Scanner;

import com.jsp.ce.oto.bi.Car;
import com.jsp.ce.oto.bi.Engine;
import com.jsp.ce.oto.bi.controller.Controller;

public class View {
	static Controller controller=new Controller();
	static Scanner myInput=new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag=true;
		do {
			System.out.println("1.Insert\n2.Find\n3.Update\n4.Delete\n0.Exit\nEnter your choice:");
			byte userInput=myInput.nextByte();
			myInput.nextLine();
			switch (userInput) {
			case 0:
				flag=false;
				System.out.println("Exited");
				break;
			case 1:
				Car car=new Car();
				System.out.print("Enter Car ID:");
				int car_id_to_insert=myInput.nextInt();
				myInput.nextLine();
				System.out.print("Enter Car Name:");
				String car_name_to_insert=myInput.nextLine();
				System.out.print("Enter Car Chasis:");
				String car_chasis_to_insert=myInput.nextLine();
				System.out.print("Enter Car Cost:");
				double car_cost_to_insert=myInput.nextDouble();
				myInput.nextLine();
				car.setCar_id(car_id_to_insert);
				car.setCar_name(car_name_to_insert);
				car.setCar_chasis(car_chasis_to_insert);
				car.setCar_cost(car_cost_to_insert);
				Engine engine=new Engine();
				System.out.print("Enter Engine ID:");
				int engine_id_to_insert=myInput.nextInt();
				myInput.nextLine();
				System.out.print("Enter Engine CC:");
				double engine_cc_to_insert=myInput.nextDouble();
				myInput.nextLine();
				System.out.print("Enter Number of Cylinders in Engine:");
				byte engine_cylinders_to_insert=myInput.nextByte();
				myInput.nextLine();
				engine.setId(engine_id_to_insert);
				engine.setCc(engine_cc_to_insert);
				engine.setNo_of_cylinders(engine_cylinders_to_insert);
				car.setEngine(engine);
				engine.setCar(car);
				boolean insert_car_engine = controller.insert_car_engine(car, engine);
				if (insert_car_engine) {
					System.out.println("Car and It's Engine Values Inserted");
				} else {
					System.out.println("Car and It's Engine Values Not Inserted");
				}
				break;
			case 2:
				System.out.println("1.Find Particular Car and Engine details\n2.Find all Cars Details\n3.Find All Engine Details\nEnter your choice:");
				byte userChoice=myInput.nextByte();
				myInput.nextLine();
				switch (userChoice) {
				case 1:
					System.out.println("Enter Car ID to find it's details and it's respective engine details:");
					int car_id_to_find=myInput.nextInt();
					myInput.nextLine();
					Car findCar = controller.findCar(car_id_to_find);
					if (findCar!=null) {
						System.out.println("Car ID: "+findCar.getCar_id());
						System.out.println("Car Name: "+findCar.getCar_name());
						System.out.println("Car Chasis: "+findCar.getCar_chasis());
						System.out.println("Car Cost: "+findCar.getCar_cost()+"\n");
						Engine findEngine = findCar.getEngine();
						System.out.println("Engine ID: "+findEngine.getId());
						System.out.println("Engine CC: "+findEngine.getCc());
						System.out.println("Engine Number of Cylinders: "+findEngine.getNo_of_cylinders());
					} else {
						System.out.println("Car ID Does not Exists");

					}
//					System.out.println("enter engine id:");
//					int engine_id_find=myInput.nextInt();
//					myInput.nextLine();
//					Engine findEngine = controller.findEngine(engine_id_find);
//					if (findEngine!=null) {
//						System.out.println("engine ID:"+findEngine.getId());
//						System.out.println("engine CC:"+findEngine.getCc());
//						System.out.println("engine ID:"+findEngine.getNo_of_cylinders());
//						System.out.println("Car ID:"+findEngine.getCar().getCar_id());
//						System.out.println("Car Name:"+findEngine.getCar().getCar_name());
//						System.out.println("Car ID:"+findEngine.getCar().getCar_chasis());
//						System.out.println("Car ID:"+findEngine.getCar().getCar_cost());
//					}
					break;
				case 2:
					List<Car> fetchAllCars = controller.fetchAllCars();
					for (Car car2 : fetchAllCars) {
						System.out.println("Car ID: "+car2.getCar_id());
						System.out.println("Car Name: "+car2.getCar_name());
						System.out.println("Car Chasis: "+car2.getCar_chasis());
						System.out.println("Car Cost: "+car2.getCar_cost()+"\n");
					}
					break;
				case 3:
					List<Engine> fetchAllEngines = controller.fetchAllEngines();
					for (Engine engine2 : fetchAllEngines) {
						System.out.println("Engine ID: "+engine2.getId());
						System.out.println("Engine CC: "+engine2.getCc());
						System.out.println("Engine Number of Cylinders: "+engine2.getNo_of_cylinders()+"\n");
					}
					break;
				default:
					System.out.println("Invalid Choice!!!");
					break;
				}
				break;
			case 3:
				System.out.println("enter Entity to update:\n1.Car\n2.Engine\nEnter your choice:");
				int updateChoice=myInput.nextInt();
				myInput.nextLine();
				switch (updateChoice) {
				case 1:
					System.out.println("1.Update Car Name\n2.Update Car cost\nEnter yout Choice:");
					byte userCarChoice=myInput.nextByte();
					myInput.nextLine();
					switch (userCarChoice) {
					case 1:
						System.out.println("Enter Car Id to Update:");
						int car_id_to_update_name=myInput.nextInt();
						myInput.nextLine();
						System.out.println("Enter Updated car name");
						Object updated_car_name=myInput.nextLine();
						if(controller.updateCar(car_id_to_update_name,userCarChoice,updated_car_name))
						{
							System.out.println("Car Name Updated");
						}
						else
						{
							System.out.println("Car Name Not Updated");
						}
						break;
					case 2:
						System.out.println("Enter Car Id to Update:");
						int car_id_to_update_cost=myInput.nextInt();
						myInput.nextLine();
						System.out.println("Enter Updated car name");
						Object updated_car_cost=myInput.nextDouble();
						if(controller.updateCar(car_id_to_update_cost,userCarChoice,updated_car_cost))
						{
							System.out.println("Car cost Updated");
						}
						else
						{
							System.out.println("Car cost not Updated");
						}
						break;

					default:
						System.out.println("Invalid!!!!");
						break;
					}
					break;
				case 2:
					System.out.println("1.Update Engine cc\nEnter yout Choice:");
					byte userEngineChoice=myInput.nextByte();
					myInput.nextLine();
					switch (userEngineChoice) {
					case 1:
						System.out.println("Enter Engine Id to Update:");
						int engine_id_to_update=myInput.nextInt();
						System.out.println("Enter Updated Engine cc");
						Object engine_cc_to_update=myInput.nextDouble();
						if (controller.updateEngine(engine_id_to_update, userEngineChoice, engine_cc_to_update)) {
							System.out.println("Updates Engine cc");
						} else {
							System.out.println("Not Updates Engine cc");
						}
						break;

					default:
						System.out.println("Invalid Choicee");
						break;
					}
					
					break;
				default:
					System.out.println("Invalid choice!!");
					break;
				}

				break;
			case 4:
				System.out.println("Enter Car ID to Remove it and its engine:");
				int car_id_to_remove=myInput.nextInt();
				myInput.nextLine();
				if (controller.removeCarAndEngine(car_id_to_remove)) {
					System.out.println("Car and its associated Engine gets removed");
				}
				else
				{
					System.out.println("Car and its associated Engine does not get removed");
				}
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
		} while (flag);	

	}

}
