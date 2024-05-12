package com.jsp.otmmto.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.otmmto.controller.Controller;
import com.jsp.otmmto.model.Account;
import com.jsp.otmmto.model.Bank;



public class View {
	static Controller controller=new Controller();
	static Scanner myInput=new Scanner(System.in);
	public static void main(String[] args) {
			boolean flag=true;
			do {
				System.out.println("1.Insert Bank\n2.Find Bank\n3.Update Bank\n4.Delete Bank\n0.Exit\nEnter your choice:");
				byte userInput=myInput.nextByte();
				myInput.nextLine();
				switch (userInput) {
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
						account.setId(account_id);
						account.setAccount_holder_name(account_holder_name);
						account.setBalance(account_balance);
						account.setBank(bank);
						
						accounts.add(account);
						bank.setAccounts(accounts);
						if (controller.insert_bank_and_account(bank, accounts)) {
							System.out.println("Account and Bank Inserted");
						}
						else
						{
							System.out.println("Account and Bank not Inserted");
						}
						no_of_accounts--;
					}
					
					break;
				case 2:
					System.out.println("1.Search Bank and its Accounts\n2.Search Account and its Bank\n3.Search for All Banks\n4.Search for All Accounts\nSelect your choice:");
					byte userChoiceToRead=myInput.nextByte();
					myInput.nextLine();
					switch (userChoiceToRead) {
					case 1:
						System.out.println("Enter your Bank ID:");
						int bank_to_find_deatils=myInput.nextInt();
						myInput.nextLine();
						controller.search_bank_and_its_details(bank_to_find_deatils);
						break;
					case 2:
						System.out.println("enter your account number:");
						int account_to_find_details=myInput.nextInt();
						myInput.nextLine();
						controller.search_account_and_its_details(account_to_find_details);
						break;
					case 3:
						List<Bank> enlist_bank = controller.enlist_bank();
						for (Bank bank2 : enlist_bank) {
							System.out.println("Bank ID:"+bank2.getId());
							System.out.println("Bank Name:"+bank2.getName());
							System.out.println("Bank Location:"+bank2.getLocation());
						}
						
						break;
					case 4:
						List<Account> enlist_account = controller.enlist_account();
						for (Account account2 : enlist_account) {
							System.out.println("Account ID:"+account2.getId());
							System.out.println("Account Holder Name:"+account2.getAccount_holder_name());
							System.out.println("Account Balance:"+account2.getBalance());
						}
						break;
					default:
						System.out.println("Invalid Choice!!!");
						break;
					}
					break;
				case 3:
					System.out.println("What Do you Want to Update:\n1.Bank\n2.Account");
					byte userChoiceToUpdate=myInput.nextByte();
					myInput.nextLine();
					switch (userChoiceToUpdate) {
					case 1:
						System.out.println("Enter Bank Id to Update:");
						int bank_id_to_update=myInput.nextInt();
						myInput.nextLine();
						System.out.println("Enter Updated Location");
						String updatedLocation=myInput.nextLine();
						if (controller.updateBanklocation(bank_id_to_update, updatedLocation)) {
							System.out.println("Bank Location Updated.");
						} else {
							System.out.println("Bank Location Not Updated.");
						}
						
						break;
					case 2:
						System.out.println("Enter Account Id to Update:");
						int account_id_to_updte=myInput.nextInt();
						myInput.nextLine();
						System.out.println("Enter Updated Balance:");
						double updatedBalance=myInput.nextDouble();
						myInput.nextLine();
						if (controller.updateAccountBalance(account_id_to_updte, updatedBalance)) {
							System.out.println("Balance Updated");
						} else {
							System.out.println("Balance Not Updated");
						}
						break;

					default:
						System.out.println("Invalid Selection");
						break;
					}
					break;
				case 4:
					System.out.println("Enter Bank ID to Remove from system:");
					int bank_id_to_remove=myInput.nextInt();
					myInput.nextLine();
					boolean removeAccount = controller.removeAccount(bank_id_to_remove);
					if (removeAccount) {
						System.out.println("Remove Operation is performed.Bank and Accounts removed successfully.");
					} else {
						System.out.println("Remove Operation is not performed");
					}
					break;
				case 0:
					flag=false;
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
			} while (flag);	

		}


	}


