package com.jsp.ba.view;

import java.util.ArrayList;
import java.util.List;

import com.jsp.ba.controller.Controller;
import com.jsp.ba.model.Accounts;
import com.jsp.ba.model.Bank;

public class NewView {

	public static void main(String[] args) {
		Controller controller=new Controller();
//		Bank sbi = new Bank();
//		sbi.setId(1);
//		sbi.setName("SBI");
//		sbi.setBacontact(1233444);
//		sbi.setHeadquaters("Mumbai");
//		
//		Accounts account1=new Accounts();
//		account1.setId(11);
//		account1.setName("Shubham");
//		account1.setAccount_number(123344);
//		account1.setContact(1233244);
//		account1.setBalance(300.44);
//		
//		Accounts account2=new Accounts();
//		account2.setId(22);
//		account2.setName("Vaibhav");
//		account2.setAccount_number(1238944);
//		account2.setContact(13244);
//		account2.setBalance(400.44);
//		
//		Accounts account3=new Accounts();
//		account3.setId(33);
//		account3.setName("Aakash");
//		account3.setAccount_number(45678);
//		account3.setContact(678678);
//		account3.setBalance(500.44);
//		
//		
//		ArrayList<Accounts> accounts=new ArrayList<Accounts>();
//		accounts.add(account1);
//		accounts.add(account2);
//		accounts.add(account3);
//		
//		sbi.setAccounts(accounts);
//		
//		if (controller.addBankandAccounts(sbi, accounts)) {
//			System.out.println("Data Inserted");
//		} else {
//			System.out.println("Unable to insert data");
//		}
//		
//		Bank findBank = controller.findBank(1);
//		if (findBank!=null) {
//			System.out.println(findBank.getId());
//			System.out.println(findBank.getName());
//			System.out.println(findBank.getHeadquaters());
//			System.out.println(findBank.getBacontact());
//			List<Accounts> accounts2 = findBank.getAccounts();
//			
//			for (Accounts accounts3 : accounts2) {
//				System.out.println(accounts3.getId());
//				System.out.println(accounts3.getName());
//				System.out.println(accounts3.getBalance());
//				System.out.println(accounts3.getContact());
//				System.out.println(accounts3.getAccount_number());
//			}
//		}
//		boolean removeAccount = controller.removeAccount(2);
//		if (removeAccount) {
//			System.out.println("data reomved");
//		}
//		else
//		{
//			System.out.println("data not removed");
//		}
//		boolean updateBankName = controller.updateBankName(3, "icici");
//		if (updateBankName) {
//			System.out.println("Data Updated");
//		}
//		else
//		{
//			System.out.println("Data Not Updated");
//		}
		if (controller.deleteParticularAccount(10, 110)) {
			System.out.println("Account deleted ");
		} else {
			System.out.println("Account not deleted ");
		}
		

	}

}
