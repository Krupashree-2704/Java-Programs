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

}
