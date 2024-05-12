package com.jsp.crud.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.crud.model.LazyDeveloper;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		LazyDeveloper lazyDeveloper = entityManager.find(LazyDeveloper.class, 1);
		if (lazyDeveloper!=null) {
			entityManager.remove(lazyDeveloper);
		} else {
			System.out.println("Id does not exist");
		}
		
		
		entityTransaction.commit();
		

	}

}
