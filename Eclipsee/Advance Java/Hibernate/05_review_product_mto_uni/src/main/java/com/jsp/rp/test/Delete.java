package com.jsp.rp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.rp.model.Review;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Review review = entityManager.find(Review.class, 11);
		if (review!=null) {
			entityTransaction.begin();
			entityManager.remove(review);
			entityTransaction.commit();
		} else {
			System.out.println("Review with ID Does not Exists");
		}

	}

}
