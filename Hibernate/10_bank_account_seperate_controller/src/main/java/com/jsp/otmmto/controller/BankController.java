package com.jsp.otmmto.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
	

}
