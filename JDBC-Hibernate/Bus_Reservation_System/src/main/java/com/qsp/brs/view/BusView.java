package com.qsp.brs.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.qsp.brs.controller.BusController;
import com.qsp.brs.model.Bus;

public class BusView {
	static Bus bus=new Bus();
	static BusController buscontroller=new BusController();
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		boolean flag=true;
		while (flag) {
			System.out.println("1.Add Bus\n2.Fetch all bus\n3.Update bus details\n4.Delete bus\n0.Exit \nEnter Your Choice:");
			byte userChoice=myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 1:
				System.out.print("Enter Bus Number : ");
				int bus_no=myInput.nextInt();
				myInput.nextLine();
				System.out.print("Enter Bus Name : ");
				String bus_name=myInput.nextLine();
				System.out.print("Enter Bus Start Destination : ");
				String bus_start_destination=myInput.nextLine();
				System.out.print("Enter Bus End Destination : ");
				String bus_end_destination=myInput.nextLine();
				System.out.print("Enter Bus Fare : ");
				double bus_fare=myInput.nextDouble();
				myInput.nextLine();
				if (buscontroller.addBus(bus_no, bus_name, bus_start_destination, bus_end_destination, bus_fare)>0) {
					System.out.println("Bus Information has been added successfully");
				} else {
					System.out.println("Bus Information have not been added successfully");
				}
				break;
			case 2:
				System.out.println("1.Read all Bus Data\n2.Read Specific Bus Data\nEnter your choice:");
				byte userChoiceRead=myInput.nextByte();
				myInput.nextLine();
				switch (userChoiceRead) {
				case 1:
					ResultSet readAllBus = buscontroller.readAllBus();
					if (readAllBus!=null) {
						System.out.println("Below are the details of all the buses......\n");
						try {
							while (readAllBus.next()) {
								System.out.println("Bus Number : "+readAllBus.getInt(1));
								System.out.println("Bus Name : "+readAllBus.getString(2));
								System.out.println("Bus Start Destination : "+readAllBus.getString(3));
								System.out.println("Bus End Destination : "+readAllBus.getString(4));
								System.out.println("Bus Fare : "+readAllBus.getDouble(5)+"\n");
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						System.out.println("Buses Information are not available in the system");
					}
					break;
				case 2:
					System.out.print("Enter the bus number of the bus which we want to search:");
					int bus_id_fetch=myInput.nextInt();
					myInput.nextLine();
					ResultSet readSpecificBus = buscontroller.readSpecificBus(bus_id_fetch);
					if (readSpecificBus!=null) {
						System.out.println("Below are the details of the bus with mentioned bus id......\n");
						try {
							while (readSpecificBus.next()) {
								System.out.println("Bus Number : "+readSpecificBus.getInt(1));
								System.out.println("Bus Name : "+readSpecificBus.getString(2));
								System.out.println("Bus Start Destination : "+readSpecificBus.getString(3));
								System.out.println("Bus End Destination : "+readSpecificBus.getString(4));
								System.out.println("Bus Fare : "+readSpecificBus.getDouble(5)+"\n");
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						System.out.println("Bus Information with mentioned ID is not available in the system");
					}
					break;

				default:
					System.out.println("Choose the Correct Operation.....");
					break;
				}
				break;
			case 3:
				System.out.println("1.Update Bus Name\n2.Update Bus Start Destination\n3.Update Bus End Destination\n4.Update Bus Fare\nEnter your choice:");
				byte userChoiceUpdate=myInput.nextByte();
				myInput.nextLine();
				switch (userChoiceUpdate) {
				
				case 1:
					System.out.println("Enter Bus ID to Update:");
					int bus_id_update_name=myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter Bus Name to Update:");
					String bus_name_update=myInput.nextLine();
					if (buscontroller.updateBusName(bus_id_update_name, bus_name_update)>0) {
						System.out.println("Bus Name Updated Successfully");
					} else {
						System.out.println("Bus Name Not Updated Successfully");
					}
					break;
				case 2:
					System.out.println("Enter Bus ID to Update:");
					int bus_id_update_start=myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter Bus Start Destination to Update:");
					String bus_start_destination_update=myInput.nextLine();
					if (buscontroller.updateBusStartDestination(bus_id_update_start, bus_start_destination_update)>0) {
						System.out.println("Bus Start Destination Updated Successfully");
					} else {
						System.out.println("Bus Start Destination Not Updated Successfully");
					}
					break;
				case 3:
					System.out.println("Enter Bus ID to Update:");
					int bus_id_update_end=myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter Bus End Destination to Update:");
					String bus_end_destination_update=myInput.nextLine();
					if (buscontroller.updateBusEndDestination(bus_id_update_end, bus_end_destination_update)>0) {
						System.out.println("Bus End Destination Updated Successfully");
					} else {
						System.out.println("Bus End Destination Not Updated Successfully");
					}
					break;
				case 4:
					System.out.println("Enter Bus ID to Update:");
					int bus_id_update_fare=myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter Bus Fare to Update:");
					double bus_fare_update=myInput.nextDouble();
					myInput.nextLine();
					if (buscontroller.updateBusFare(bus_id_update_fare, bus_fare_update)>0) {
						System.out.println("Bus Fare Updated Successfully");
					} else {
						System.out.println("Bus Fare Not Updated Successfully");
					}
					break;
				default:
					System.out.println("Please Choose the correct Option for Update...");
					break;
				}
				break;
			case 4:
				System.out.print("Enter Bus ID to delete bus details:");
				int bus_id_delete=myInput.nextInt();
				myInput.nextLine();
				if (buscontroller.delete(bus_id_delete)>0) {
					System.out.println("Bus with the Bus ID "+bus_id_delete+" Deleted Successfully");
				} else {
					System.out.println("Bus with the Bus ID "+bus_id_delete+" Not Deleted Successfully");
				}
				break;
			case 0:
				System.out.println("...................Exited From The System..............................");
				flag=false;
				break;
			default:
				System.out.println(".....Please Choose the correct option.....");
				break;
			}
		}
		
	}
}
