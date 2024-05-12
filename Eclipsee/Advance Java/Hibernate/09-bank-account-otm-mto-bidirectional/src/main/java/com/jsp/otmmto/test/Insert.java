package com.jsp.otmmto.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.otmmto.model.Account;
import com.jsp.otmmto.model.Bank;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		Bank bank = new Bank();
//		bank.setId(2);
//		bank.setName("HDFC");
//		bank.setLocation("Colaba");
		Bank bank = entityManager.find(Bank.class, 1);
		List<Account> accounts2 = bank.getAccounts();
		ArrayList<Account> accounts = new ArrayList<Account>();
		Account account1 = new Account();
		account1.setId(33);
		account1.setAccount_holder_name("Sunil");
		account1.setBalance(13000);
		account1.setBank(bank);
		accounts.add(account1);
		
		Account account2 = new Account();
		account2.setId(44);
		account2.setAccount_holder_name("Rani");
		account2.setBalance(90000);
		account2.setBank(bank);
		accounts.add(account2);
		
		bank.setAccounts(accounts);
		
		
		entityTransaction.begin();
		entityManager.persist(bank);
		for (Account account : accounts) {
			entityManager.persist(account);
		}
		entityTransaction.commit();
		
		

	}

}
