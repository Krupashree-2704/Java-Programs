package com.jsp.ba.otmmto.bid.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.ba.otmmto.bid.controller.AccountController;
import com.jsp.ba.otmmto.bid.controller.BankController;
import com.jsp.ba.otmmto.bid.model.Account;
import com.jsp.ba.otmmto.bid.model.Bank;

public class View {
	static Scanner mI=new Scanner(System.in);
	static BankController bc=new BankController();
	static AccountController ac=new AccountController();
	public static void main(String[] args) {
		do {
			System.out.println("1.Insert Bank\n2.Insert account\n3.Read Bank and its details\n4.Read account and its bank details \nEnter your choice:");
			byte uC=mI.nextByte();
			switch (uC) {
			case 0:
				
				System.exit(0);
				break;
			case 1:
				Bank bank = new Bank();
				System.out.println("Bank ID");
				int bank_id=mI.nextInt();
				mI.nextLine();
				System.out.println("Bank Name:");
				String bank_name=mI.nextLine();
				System.out.println("Bank Location:");
				String bank_location=mI.nextLine();
				bank.setId(bank_id);
				bank.setName(bank_name);
				bank.setLocation(bank_location);
				if (bc.insertBank(bank)) {
					System.out.println("Inserted");
			}
				break;
			case 2:
				ArrayList<Account> accounts=new ArrayList<Account>();
				System.out.println("How Many Accounts you want to insert:");
				int insert_account=mI.nextInt();
				mI.nextLine();
				while (insert_account>0) {
					Account account1=new Account();
					System.out.println("Account ID:");
					int account_number=mI.nextInt();
					mI.nextLine();
					System.out.println("account Name:");
					String account_holder_name=mI.nextLine();
					System.out.println("Account Balance:");
					double account_balance=mI.nextDouble();
					mI.nextLine();
					account1.setId(account_number);
					account1.setAccount_holder_name(account_holder_name);
					account1.setBalance(account_balance);
					
					accounts.add(account1);
					List<Bank> enlist_bank = bc.enlist_bank();
					for (Bank bank2 : enlist_bank) {
						System.out.println(bank2);
					}
					System.out.println("enter bank Id to create an account");
					int bank_id_aacount=mI.nextInt();
					mI.nextLine();
					Bank readBank = bc.readBank(bank_id_aacount);
					account1.setBank(readBank);
					accounts.add(account1);
					boolean accountInsert = ac.accountInsert(accounts);
					if (accountInsert) {
						System.out.println("Inserted a");
					} else {
						System.out.println("Not Inserted a");
					}
					
					insert_account--;					
				}
				break;
			case 3:
				System.out.println("Enter Bank ID:");
				int bank_id_read=mI.nextInt();
				mI.nextLine();
				Bank findBank = bc.search_bank_and_its_details(bank_id_read);
				if (findBank!=null) {
					System.out.println(findBank.getId());
					System.out.println(findBank.getName());
					System.out.println(findBank.getLocation());
					List<com.jsp.ba.otmmto.bid.model.Account> accountsToFind = findBank.getAccounts();
					for (com.jsp.ba.otmmto.bid.model.Account account : accountsToFind) {
						System.out.println("Account ID:"+account.getId());
						System.out.println("Account ID:"+account.getAccount_holder_name());
						System.out.println("Account ID:"+account.getBalance());
					}
				}
				break;
			case 4:
				break;
			default:
				break;
			}
		} while (true);
		
		

	}

}
