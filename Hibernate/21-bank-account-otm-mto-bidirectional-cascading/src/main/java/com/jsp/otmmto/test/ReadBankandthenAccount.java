package com.jsp.otmmto.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.otmmto.model.Account;
import com.jsp.otmmto.model.Bank;

public class ReadBankandthenAccount {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bank findBank = entityManager.find(Bank.class, 1);
		if (findBank!=null) {
			System.out.println(findBank.getId());
			System.out.println(findBank.getName());
			System.out.println(findBank.getLocation());
			List<Account> accounts = findBank.getAccounts();
			for (Account account : accounts) {
				System.out.println("Account ID:"+account.getId());
				System.out.println("Account ID:"+account.getAccount_holder_name());
				System.out.println("Account ID:"+account.getBalance());
			}
		}

	}

}
