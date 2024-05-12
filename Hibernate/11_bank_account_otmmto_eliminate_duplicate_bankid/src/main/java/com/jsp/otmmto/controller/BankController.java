package com.jsp.otmmto.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.otmmto.model.Account;
import com.jsp.otmmto.model.Bank;

public class BankController {
	static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pgsql");
	static EntityManager entityManager=entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public static boolean insertBank(Bank bank)
	{
		if (bank!=null) {
			entityTransaction.begin();
			entityManager.persist(bank);
			entityTransaction.commit();
			return true;
		}
		return false;	
			
	}
	public static Bank readBank(int primaryKey)
	{
		return entityManager.find(Bank.class, primaryKey);
	}
	public static boolean removeBank(int bankId)
	{
		Bank findBankRemove = entityManager.find(Bank.class, bankId);
		if (findBankRemove!=null) {
			List<Account> accounts = findBankRemove.getAccounts();
			if (accounts!=null) {
				entityTransaction.begin();
				entityManager.remove(findBankRemove);
				entityTransaction.commit();
				return true;
			}
		}
		return false;
	}
	public static boolean updateBankName(int bank_id_to_update_location,String updated_location)
	{
		Bank updateBankLoc = entityManager.find(Bank.class, bank_id_to_update_location);
		if (updateBankLoc!=null) {
			updateBankLoc.setLocation(updated_location);
			entityTransaction.begin();
			entityManager.merge(updateBankLoc);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
