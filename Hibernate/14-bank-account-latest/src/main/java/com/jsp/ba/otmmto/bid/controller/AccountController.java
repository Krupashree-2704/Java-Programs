package com.jsp.ba.otmmto.bid.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.ba.otmmto.bid.model.Account;


public class AccountController {

	
		static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		static EntityManager entityManager = entityManagerFactory.createEntityManager();
		static EntityTransaction entityTransaction = entityManager.getTransaction();

		public static boolean accountInsert(List<Account>account)
		{
			if (account!=null) {
				entityTransaction.begin();
				for (Account account2 : account) {
					entityManager.persist(account2);
				}
				entityTransaction.commit();
				return true;
			}
			else {
				return false;
			}
			
		}
		public void search_account_and_its_details(int account_no)
		{
			Account account = entityManager.find(Account.class, account_no);
			if (account!=null) {
				System.out.println(account.getId());
				System.out.println(account.getAccount_holder_name());
				System.out.println(account.getBalance());
				com.jsp.ba.otmmto.bid.model.Bank bank = account.getBank();
				if (bank!=null) {
					System.out.println(bank.getId());
					System.out.println(bank.getName());
					System.out.println(bank.getLocation());
				}
			}
		}
		public List<Account> enlist_account()
		{
			TypedQuery<Account> query = entityManager.createQuery("SELECT s FROM Account s", Account.class);
			return query.getResultList();
		}
	

}
