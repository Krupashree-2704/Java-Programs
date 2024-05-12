package com.jsp.ba.otmmto.bid.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.ba.otmmto.bid.model.Bank;




public class BankController {

	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();

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
	public List<Bank> enlist_bank()
	{
		TypedQuery<Bank> query = entityManager.createQuery("SELECT s FROM Bank s", Bank.class);
		return query.getResultList();
	}
	public Bank search_bank_and_its_details(int bank_no)
	{
		return entityManager.find(Bank.class, bank_no);
		
	}
}
