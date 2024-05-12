package com.jsp.otmmto.view;

import java.util.ArrayList;
import java.util.List;
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
		boolean flag=true;
		do {
			System.out.println("1.Insert Bank\n2.Insert Account\n3.Read Bank and its accounts\n4.Read accounts and their banks\n5.Delete Particular Account\n6.Delete Particular Bank\n7.Update Bank Details\n8.Update Account Details\n0.Exit\nEnter your account:");
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
//				Accounts account1=new Accounts();
				
				break;
			case 2:
				ArrayList<Account> accounts=new ArrayList<Account>();
				System.out.println("How Many Accounts you want to insert:");
				int insert_account=myInput.nextInt();
				myInput.nextLine();
				while (insert_account>0) {
					Account account1=new Account();
					System.out.println("Enter Account ID:");
					int account_id=myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter Account Holder Name:");
					String account_holder_name=myInput.nextLine();
					System.out.println("Enter Account Balance:");
					double account_balance=myInput.nextDouble();
					myInput.nextLine();
					account1.setId(account_id);
					account1.setAccount_holder_name(account_holder_name);
					account1.setBalance(account_balance);
					System.out.println("Enter Bank id to add bank account:");
					int bank_id_to_map=myInput.nextInt();
					myInput.nextLine();
					Bank readBank = bankController.readBank(bank_id_to_map);
					if (readBank!=null) {
						account1.setBank(readBank);
					}
					accounts.add(account1);
					readBank.setAccounts(accounts);
					if (AccountController.insertAccount(accounts)) {
						System.out.println("Data Inserted");
					} else {
						System.out.println("Unable to insert data");
					}
					insert_account--;					
				}
				break;
			case 3:
				System.out.println("Enter Bank Id to read details:");
				int bank_id_to_read=myInput.nextInt();
				myInput.nextLine();
				Bank readBank = bankController.readBank(bank_id_to_read);
				if (readBank!=null) {
					System.out.println("Bank ID:"+readBank.getId());
					System.out.println("Bank Name:"+readBank.getName());
					System.out.println("Bank Location:"+readBank.getLocation());
					List<Account> accounts2 = readBank.getAccounts();
					for (Account account : accounts2) {
						System.out.println("Account ID:"+account.getId());
						System.out.println("Account Holder name:"+account.getAccount_holder_name());
						System.out.println("Account Balance:"+account.getBalance());
					}
				} else {
					System.out.println("bank with bank id does not exists.");
				}
				break;
			case 4:
				System.out.println("Enter Account id to read details:");
				int account_id_to_read=myInput.nextInt();
				myInput.nextLine();
				Account readAccount = accountController.readAccount(account_id_to_read);
				if (readAccount!=null) {
					System.out.println("Account ID:"+readAccount.getId());
					System.out.println("Account Holder name:"+readAccount.getAccount_holder_name());
					System.out.println("Account Balance:"+readAccount.getBalance());
					Bank bank = readAccount.getBank();
					if (bank!=null) {
						System.out.println("Bank ID:"+bank.getId());
						System.out.println("Bank Name:"+bank.getName());
						System.out.println("Bank Location:"+bank.getLocation());
					}
				} else {
					System.out.println("Account with given id does not exists.");
				}
				break;
			case 5:
				System.out.println("Enter Account Id to remove account:");
				int account_id_to_remove=myInput.nextInt();
				myInput.nextLine();
				if (accountController.removeAccount(account_id_to_remove)) {
					System.out.println("Removed Account successful");
				} else {
					System.out.println("Account Not Removed");
				}
				break;
			case 6:
				System.out.println("enter bank id to remove:");
				int bank_id_to_remove=myInput.nextInt();
				myInput.nextLine();
				if (bankController.removeBank(bank_id_to_remove)) {
					System.out.println("Removed Bank successful");
				} else {
					System.out.println("Bank Not Removed");
				}
				break;
			case 7:
				System.out.println("Enter Bank Id to Update It's Location");
				int bank_id_update_loc=myInput.nextInt();
				myInput.nextLine();
				System.out.println("Enter Updated Location:");
				String updated_loc=myInput.nextLine();
				if(bankController.updateBankName(bank_id_update_loc, updated_loc))
				{
					System.out.println("Bank Location Updated");
				}
				else
				{
					System.out.println("Bank Location Not Updated");
				}
				break;
			case 8:
				System.out.println("1.Update Account Holder Name\n2.Update Account Balance\nEnter your choice:");
				byte accountUpdateChoice=myInput.nextByte();
				myInput.nextLine();
				switch (accountUpdateChoice) {
				case 1:
					System.out.println("Enter account id to update it's name:");
					int account_id_update_name=myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter account holder name to update:");
					Object account_holder_name_update=myInput.nextLine();
					if(accountController.updateAccount(account_id_update_name, accountUpdateChoice, account_holder_name_update))
					{
						System.out.println("Updated Name Successfully");
					}
					else
					{
						System.out.println("Not Updated Name Successfully");
					}
					break;
				case 2:
					System.out.println("Enter account id to update it's balance:");
					int account_id_update_balance=myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter Account Balance to update:");
					Object account_balace_update=myInput.nextDouble();
					myInput.nextLine();
					if(accountController.updateAccount(account_id_update_balance, accountUpdateChoice, account_balace_update))
					{
						System.out.println("Updated Balance Successfully");
					}
					else
					{
						System.out.println("Not Updated Balance Successfully");
					}
					break;
					
				default:
					System.out.println("Invalid Choice.Please choose correct option.");
					break;
				}
				break;
			case 0:
				myInput.close();
				System.out.println("Exited");
				flag=false;
				break;
			default:
				System.out.println("Invalid Choiceee");
				break;
			}

			
		} while (flag);
	}

}
