package com.jsp.otmmto.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.otmmto.model.Account;

public class AccountController {
	static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pgsql");
	static EntityManager entityManager=entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public static boolean insertAccount(List<Account>accounts)
	{
		entityTransaction.begin();
		for (Account account : accounts) {
			entityManager.persist(account);
		}
		entityTransaction.commit();
		return true;
	}
	public Account readAccount(int accountId)
	{
		return entityManager.find(Account.class, accountId);
	}
	public boolean removeAccount(int accountId)
	{
		Account accountRemove = entityManager.find(Account.class, accountId);
		if (accountRemove!=null) {
			entityTransaction.begin();
			entityManager.remove(accountRemove);
			entityTransaction.commit();
			return true;
			
		}
		return false;
	}
	public boolean updateAccount(int account_id,byte updatedChoice,Object updated_parameter)
	{
//		Account updateAccount = entityManager.find(Account.class,account_id);
			if (updatedChoice==1) {
				Account updateAccount = entityManager.find(Account.class,account_id);
				updateAccount.setAccount_holder_name((String)updated_parameter);
				entityTransaction.begin();
				entityManager.merge(updateAccount);
				entityTransaction.commit();
				return true;
			} else if (updatedChoice==2) {
				Account updateAccount = entityManager.find(Account.class,account_id);
				updateAccount.setBalance((Double)updated_parameter);
				entityTransaction.begin();
				entityManager.merge(updateAccount);
				entityTransaction.commit();
				return true;
			}else{
				System.out.println("Invalid!!@!!");
			}
			
		return false;
	}

}
