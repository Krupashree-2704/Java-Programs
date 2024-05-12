package com.jsp.otmmto.model;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCase {

	public static void main(String[] args) {
		
			 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pgsql");
			 EntityManager entityManager=entityManagerFactory.createEntityManager();
			 EntityTransaction entityTransaction=entityManager.getTransaction();
			 Bank bank1 = new Bank();
			 bank1.setName("ICICI");
			 bank1.setLocation("Kolkata");
//			 Bank bank2=new Bank();
//			 bank2.setName("IDFC");
//			 bank2.setLocation("Lonavla");
			 ArrayList<Account> accountList = new ArrayList<Account>();
			 Account account = new Account();
			 account.setAccount_holder_name("ABC");
			 account.setBalance(1200);
			 account.setBank(bank1);
			 Account account1 = new Account();
			 account1.setAccount_holder_name("DEF");
			 account1.setBalance(1200);
			 account1.setBank(bank1);
			 bank1.setAccounts(accountList);
			 accountList.add(account1);
			 accountList.add(account);
			 
			 entityTransaction.begin();
			 entityManager.persist(bank1);
//			 entityManager.persist(bank2);
			 entityTransaction.commit();

	}

}
