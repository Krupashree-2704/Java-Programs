package com.jsp.otomto.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = createEntityManager.getTransaction();
		
		

	}

}
