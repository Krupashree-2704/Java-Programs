package com.jsp.otmmto.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.jsp.otmmto.controller.AccountController;
import com.jsp.otmmto.controller.BankController;
import com.jsp.otmmto.model.Account;
import com.jsp.otmmto.model.Bank;

public class View {
	static Scanner myInput=new Scanner(System.in);
	static AccountController accountController=new AccountController();
	static BankController bankController=new BankController();
	
	public static void main(String[] args) {
		System.out.println("1.Insert\n2.Read\n3.Update\n4.Delete\nEnter your account:");
		byte userChoice=myInput.nextByte();
		myInput.nextLine();
		switch (userChoice) {
		case 1:
			System.out.print("Enter Bank ID:");
			int bank_id=myInput.nextInt();
			myInput.nextLine();
			System.out.print("Enter Bank Name:");
			String bank_name=myInput.nextLine();
			System.out.print("Enter Bank Headquater's Location:");
			String bank_location=myInput.nextLine();
			System.out.print("Enter Bank's Contact Number:");
			long bank_contact=myInput.nextLong();
			myInput.nextLine();
			Bank sbi = new Bank();
			sbi.setId(bank_id);
			sbi.setName(bank_name);
			sbi.setLocation(bank_location);
			boolean insertBank = bankController.insertBank(sbi);
			if (insertBank) {
				System.out.println("Inserted");
			} else {
				System.out.println("Not Inserted");
			}
//			Accounts account1=new Accounts();
			ArrayList<Account> accounts=new ArrayList<Account>();
			System.out.println("How Many Accounts you want to insert:");
			int insert_account=myInput.nextInt();
			myInput.nextLine();
			while (insert_account>0) {
				Account account1=new Account();
				System.out.println("Enter Account ID:");
				int account_id=myInput.nextInt();
				myInput.nextLine();
				System.out.println("Enter Account Number:");
				long account_number=myInput.nextLong();
				myInput.nextLine();
				System.out.println("Enter Account Holder Name:");
				String account_holder_name=myInput.nextLine();
				System.out.println("Enter Account Balance:");
				double account_balance=myInput.nextDouble();
				myInput.nextLine();
				System.out.println("Enter Account Holder's Contact Number:");
				long account_contact_no=myInput.nextLong();
				myInput.nextLine();
				account1.setId(account_id);
				account1.setAccount_holder_name(account_holder_name);
				account1.setBalance(account_balance);
				
				accounts.add(account1);
				sbi.setAccounts(accounts);
				if (AccountController.insertAccount(accounts)) {
					System.out.println("Data Inserted");
				} else {
					System.out.println("Unable to insert data");
				}
				insert_account--;					
			}
			break;

		default:
			break;
		}
		

	}

}
