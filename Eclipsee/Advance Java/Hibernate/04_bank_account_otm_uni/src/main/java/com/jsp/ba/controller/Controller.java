package com.jsp.ba.controller;

//import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ba.model.Accounts;
import com.jsp.ba.model.Bank;

public class Controller {
//	error
	static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pgsql");
	static EntityManager entityManager=entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction=entityManager.getTransaction();
	public boolean addBankandAccounts(Bank bank,List<Accounts>accounts)
	{
		if (bank!=null && accounts!=null) {
			entityTransaction.begin();
			entityManager.persist(bank);
			for(Accounts account:accounts)
			{
				entityManager.persist(account);
				
			}
			entityTransaction.commit();
			return true;
		} 
		return false;
	}
	public Bank findBank(Object primaryKey)
	{
		return entityManager.find(Bank.class, primaryKey);
	}
	public boolean removeAccount(int primaryKey)
	{
		Bank findBank = entityManager.find(Bank.class, primaryKey);
		if (findBank!=null) {
			List<Accounts> accounts = findBank.getAccounts();
			entityTransaction.begin();
			entityManager.remove(findBank);
			for (Accounts accounts2 : accounts) {
				entityManager.remove(accounts2);
			}			
			entityTransaction.commit();
			return true;
		} else {
			System.out.println("Bank ID does not exists");
		}
		return false;
	}
	public boolean updateBankName(int bankId, String updatedName)
	{
		Bank bank = entityManager.find(Bank.class, bankId);
		if (bank!=null) {
			bank.setName(updatedName);
			entityTransaction.begin();
			entityManager.merge(bank);
			entityTransaction.commit();
			return true;
		} else {
			System.out.println("Bank with id does not exists!!");
		}
		return false;
		
	}
	public boolean deleteParticularAccount(int bankIdToFind,int accountIdToDelete)
	{
		Bank bank = entityManager.find(Bank.class,bankIdToFind);
		if (bank!=null) {
			List<Accounts> accounts = bank.getAccounts();
			if (accounts==null) {
				return false;
			}
			else
			{
//				Object captured which we want to remove:arraylist remove by object
				Accounts accountToRemove=null;
				for (Accounts accounts2 : accounts) {
					if (accounts2.getId()==accountIdToDelete) {
						accountToRemove=accounts2;
//						account does not exist in bank
						break;
					}
				}
				if (accountToRemove!=null) {
					entityTransaction.begin();
					accounts.remove(accountToRemove);
					entityTransaction.commit();
					
					entityTransaction.begin();
					entityManager.remove(accountToRemove);
					entityTransaction.commit();
//					account deleted
					return true;
				}
				else {
//					account with given id does not exists
					return false;
				}
			}
	
		}
//		Bank with given id does not exist
		return false;
	}
//	public Accounts updatAccountByID(int primaryKey)
//	{
//		
//		return null;
//	}
}
