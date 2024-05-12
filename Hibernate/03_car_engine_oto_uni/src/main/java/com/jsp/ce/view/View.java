package com.jsp.ce.view;

import java.util.Scanner;

import com.jsp.ce.controller.Controller;
import com.jsp.ce.model.Car;
import com.jsp.ce.model.Engine;

public class View {

	public static void main(String[] args) {
		Controller controller=new Controller();
		Scanner myInput=new Scanner(System.in);
		
		boolean flag=true;
		do {
			System.out.println("1.Insert\n2.Read\n3.Update\n4.Delete\n0.Exit");
			System.out.print("Enter your Choice:");
			byte userChoice=myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				flag=false;
				break;
			case 1:
				System.out.print("Enter Car Id:");
				int cid=myInput.nextInt();
				myInput.nextLine();
				System.out.print("Enter Car Name:");
				String car_name=myInput.nextLine();
				System.out.print("Enter Car Chasis:");
				String chasis=myInput.nextLine();
				System.out.print("Enter Car Cost:");
				double cost=myInput.nextDouble();
				myInput.nextLine();
				Car car=new Car();
				car.setId(cid);
				car.setCar_name(car_name);
				car.setChasis(chasis);
				car.setCost(cost);
				Engine engine=new Engine();
				System.out.print("Enter Engine Id:");
				int eid=myInput.nextInt();
				myInput.nextLine();
				System.out.print("Enter Engine CC:");
				double cc=myInput.nextDouble();
				myInput.nextLine();
				System.out.print("Enter Number of cylinders:");
				byte no_of_cylinders=myInput.nextByte();
				myInput.nextLine();
				engine.setId(eid);
				engine.setCc(cc);
				engine.setNo_of_cylinder(no_of_cylinders);
				car.setEngine(engine);
				boolean insertCar = controller.insert(car, engine);
				if (insertCar) {
					System.out.println("Car and Engine Details Inserted Successfully.");
				} else {
					System.out.println("Car and Engine Details not Inserted Successfully.");
				}
				
				break;
			case 2:
				System.out.println("Enter the car id to search the car:");
				int id=myInput.nextInt();
				myInput.nextLine();
				Car carSearchById = controller.searchById(id);
				if (carSearchById!=null) {
					System.out.println("Car Id:"+carSearchById.getId());
					System.out.println("Car Name:"+carSearchById.getCar_name());
					System.out.println("Car Chasis:"+carSearchById.getChasis());
					System.out.println("Car Cost:"+carSearchById.getCost());
					Engine engine1 = carSearchById.getEngine();
					System.out.println("Engine Id:"+engine1.getId());
					System.out.println("Engine CC:"+engine1.getCc());
					System.out.println("Engine Number of cylinders:"+engine1.getNo_of_cylinder());
					
				} else {
					System.out.println("Car with given id does not Exists.We cannot search this car");
				}
				break;
			case 3:
				System.out.println("Enter the Entity you want to update\n1.Car\n2.Engine");
				System.out.print("Enter your choice:");
				byte entityChoice=myInput.nextByte();
				myInput.nextLine();
				if (entityChoice==1) {
					System.out.print("Enter Car Id for updating it's cost:");
					int carIdToUpdate=myInput.nextInt();
					myInput.nextLine();
					System.out.print("Enter Car cost to be updated:");
					double updatedCost=myInput.nextDouble();
					myInput.nextLine();
					boolean updateCarCost = controller.updateCarByCost(carIdToUpdate, updatedCost);
					if (updateCarCost) {
						System.out.println("Car cost is updated");
					}
					else
					{
						System.out.println("Car with given id Does not Exists.No Update operation is performed.");				
					}
						
				} else if (entityChoice==2) {
					System.out.print("Enter Engine Id for updating it's CC:");
					int engineIdToUpdate=myInput.nextInt();
					myInput.nextLine();
					System.out.print("Enter Engine CC to be updated:");
					double updatedCC=myInput.nextDouble();
					myInput.nextLine();
					boolean updateCC = controller.updateEngineByCC(engineIdToUpdate, updatedCC);
					if (updateCC) {
						System.out.println("Engine CC is updated");
					}
					else
					{
						System.out.println("Engine with given Id Does not Exists.No Update operation is performed.");				
					}
				}
				else {
					System.out.println("Invalid Choice!!!");

				}
				break;
			case 4:
					System.out.print("Enter Car Id to Remove: ");
					int idToRemove=myInput.nextInt();
					myInput.nextLine();
					boolean removeCar = controller.removeCarByID(idToRemove);
					if (removeCar) {
						System.out.println("Car with gievn id is Removed Successfully");
					} else {
						System.out.println("Car with gievn id is not Removed Successfully");
					}	
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
			
		} while (flag);
		
		
		
		

	}

}
