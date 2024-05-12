package com.jsp.otmmto.view;

import java.util.Scanner;

import com.jsp.otmmto.controller.BankController;
import com.jsp.otmmto.model.Bank;


public class BankView {
	static BankController bankcontroller=new BankController();
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
				break;
			case 1:
				Bank bank = new Bank();
				System.out.println("Enter Bank Id:");
				int bank_id=myInput.nextInt();
				myInput.nextLine();
				System.out.println("Enter Bank Name:");
				String bank_name=myInput.nextLine();
				System.out.println("Enter Bank Location:");
				String bank_location=myInput.nextLine();
				bank.setId(bank_id);
				bank.setName(bank_name);
				bank.setLocation(bank_location);
				if (bankcontroller.insertBank(bank)) {
					System.out.println("Bank Got Inserted");
				} else {
					System.out.println("Bank not got Inserted");
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
		} while (flag);

	}

}
