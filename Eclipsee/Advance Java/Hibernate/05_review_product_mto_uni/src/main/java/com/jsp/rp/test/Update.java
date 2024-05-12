package com.jsp.rp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.rp.model.Review;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		Review review = entityManager.find(Review.class, 11);
		if (review!=null) {
			review.setComment("Badhiya");
			entityManager.merge(review);
		} else {
			System.out.println("Review ID Does not Exists");
		}
		entityTransaction.commit();
		
		
//		entityTransaction.begin();
//		Review review = entityManager.find(Review.class, 22);
//		if (review!=null) {
//			review.setId(12);
//			entityManager.merge(review);
//		}
//		entityTransaction.commit();
		
		
	}

}
