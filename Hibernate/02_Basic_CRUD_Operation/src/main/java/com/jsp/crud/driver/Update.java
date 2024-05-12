package com.jsp.crud.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.crud.model.LazyDeveloper;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		LazyDeveloper lazyDeveloper = entityManager.find(LazyDeveloper.class, 1);
		if (lazyDeveloper!=null) {
			lazyDeveloper.setNapping(false);
		    entityManager.merge(lazyDeveloper);
		} else {
			System.out.println("Record with given id does not exists");
		}
		
		entityTransaction.commit();

	}

}
