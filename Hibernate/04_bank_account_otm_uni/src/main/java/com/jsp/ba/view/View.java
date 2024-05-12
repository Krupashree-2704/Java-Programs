package com.jsp.ba.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.ba.controller.Controller;
import com.jsp.ba.model.Accounts;
import com.jsp.ba.model.Bank;

public class View {
	static Controller controller = new Controller(); 
	public static void main(String[] args) {
		Scanner myInput=new Scanner(System.in);
//		System.out.println("===========Welcome To ABC Bank Management System============");
		boolean flag=true;
		do {
			System.out.println("1.Insert\n2.Read\n3.Update\n4.Delete\n5.Delete Account\n0.Exit");
			System.out.print("Enter your choice:");
			byte userChoice=myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				myInput.close();
				flag=false;
				break;
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
				sbi.setBacontact(bank_contact);
				sbi.setHeadquaters(bank_location);
//				Accounts account1=new Accounts();
				ArrayList<Accounts> accounts=new ArrayList<Accounts>();
				System.out.println("How Many Accounts you want to insert:");
				int insert_account=myInput.nextInt();
				myInput.nextLine();
				while (insert_account>0) {
					Accounts account1=new Accounts();
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
					account1.setName(account_holder_name);
					account1.setAccount_number(account_number);
					account1.setContact(account_contact_no);
					account1.setBalance(account_balance);
					
					accounts.add(account1);
					sbi.setAccounts(accounts);
					if (controller.addBankandAccounts(sbi, accounts)) {
						System.out.println("Data Inserted");
					} else {
						System.out.println("Unable to insert data");
					}
					insert_account--;					
				}
				
				break;
			case 2:
				System.out.print("Enter Bank ID to find:");
				int bank_id1=myInput.nextInt();
				myInput.nextLine();
				Bank findBank = controller.findBank(bank_id1);
				if (findBank!=null) {
					System.out.println("Bank ID:"+findBank.getId());
					System.out.println("Bank Name:"+findBank.getName());
					System.out.println("Bank Headquater's Location:"+findBank.getHeadquaters());
					System.out.println("Bank Contact Number:"+findBank.getBacontact());
					List<Accounts> accounts2 = findBank.getAccounts();
				
					
					for (Accounts accounts3 : accounts2) {
						System.out.println("Account ID:"+accounts3.getId());
						System.out.println("Account Number"+accounts3.getAccount_number());
						System.out.println("Account Name:"+accounts3.getName());
						System.out.println("Account Balance:"+accounts3.getBalance());
						System.out.println("Account Contact:"+accounts3.getContact()+"\n");
					}
				}
				break;

			case 3:
				System.out.println("Enter Bank ID to update Bank Name:");
				int bank_id_to_update=myInput.nextInt();
				myInput.nextLine();
				System.out.println("Enter Bank Name to be updated:");
				String bank_name_to_update=myInput.nextLine();
				boolean updateBankName = controller.updateBankName(bank_id_to_update, bank_name_to_update);
				if (updateBankName) {
					System.out.println("Update operation of bank performed successfully.Bank Name Updated Successfully");
				} else {
					System.out.println("Update operation of bank not performed");
				}
				break;

			case 4:
				System.out.println("What do ");
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
			case 5:
				System.out.println("Enter Bank ID to Remove Account from system:");
				int bank_id_to_remove_account=myInput.nextInt();
				myInput.nextLine();
				System.out.println("Enter Account ID to Remove:");
				int account_id_to_remove=myInput.nextInt();
				myInput.nextLine();
				boolean removeAccountFromBank = controller.deleteParticularAccount(bank_id_to_remove_account, account_id_to_remove);
				if(removeAccountFromBank){
					System.out.println("Remove Operation is performed.Bank and Accounts removed successfully.");
				} else {
					System.out.println("Remove Operation is not performed");
				}
				
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			
		} while (flag);	
			
		}
		
	}


