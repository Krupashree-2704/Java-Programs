package com.jsp.otmmto.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.jsp.otmmto.controller.AccountController;
import com.jsp.otmmto.controller.BankController;
import com.jsp.otmmto.model.Account;
import com.jsp.otmmto.model.Bank;



public class AccountView {
	static AccountController accountcontroller=new AccountController();
	static Scanner myInput=new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag=true;
		do {
			System.out.println("1.Insert Account\n2.Find Account\n3.Update Account\n4.Delete Account\n0.Exit\nEnter your choice:");
			byte userInput=myInput.nextByte();
			myInput.nextLine();
			switch (userInput) {
			case 0:
				flag=false;
				break;
			case 1:
				ArrayList<Account> accounts = new ArrayList<Account>();
				System.out.println("How Many Accounts you want to Insert:");
				int no_of_accounts=myInput.nextInt();
				while (no_of_accounts>0) {
					Account account = new Account();
					System.out.println("enter Account ID:");
					int account_id=myInput.nextInt();
					myInput.nextLine();
					System.out.println("enter Account Holder Name:");
					String account_holder_name=myInput.nextLine();
					System.out.println("enter Account Balance:");
					double account_balance=myInput.nextDouble();
					myInput.nextLine();
					System.out.println("Inwhich bank you want to create account:");
					int bankidtoassign=myInput.nextInt();
//					myInput
//					BankController.readBank();
					account.setId(account_id);
					account.setAccount_holder_name(account_holder_name);
					account.setBalance(account_balance);
//					account.setBank(bank);
					
					accounts.add(account);
//					bank.setAccounts(accounts);
//					if (controller.insert_bank_and_account(bank, accounts)) {
//						System.out.println("Account and Bank Inserted");
//					}
//					else
//					{
//						System.out.println("Account and Bank not Inserted");
//					}
					no_of_accounts--;
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
