package com.jsp.otmmto.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.otmmto.model.Account;
import com.jsp.otmmto.model.Bank;

public class ReadAccountanditsRespectiveBank {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Account account = entityManager.find(Account.class, 11);
		if (account!=null) {
			System.out.println(account.getId());
			System.out.println(account.getAccount_holder_name());
			System.out.println(account.getBalance());
			Bank bank = account.getBank();
			if (bank!=null) {
				System.out.println(bank.getId());
				System.out.println(bank.getName());
				System.out.println(bank.getLocation());
			}
		}
		
		
		
		

	}

}
