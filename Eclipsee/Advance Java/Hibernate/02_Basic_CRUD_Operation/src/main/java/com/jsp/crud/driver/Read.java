package com.jsp.crud.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.crud.model.LazyDeveloper;

public class Read {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		LazyDeveloper lazyDeveloper = entityManager.find(LazyDeveloper.class, 1);
		if (lazyDeveloper!=null) {
			System.out.println("ID:"+lazyDeveloper.getId());
			System.out.println("Name:"+lazyDeveloper.getName());
			System.out.println("Preffered IDE:"+lazyDeveloper.getPreferredIDE());
			System.out.println("Favorite Error:"+lazyDeveloper.getFavouriteError());
			System.out.println("Sleeping Status:"+lazyDeveloper.isNapping());
		} else {
			System.out.println("Sorry...Record with given od does not exists");
		}
		

	}

}
