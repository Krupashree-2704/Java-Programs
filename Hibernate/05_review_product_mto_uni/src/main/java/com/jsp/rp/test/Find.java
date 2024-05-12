package com.jsp.rp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.rp.model.Product;
import com.qsp.rp.model.Review;

public class Find {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Review review = entityManager.find(Review.class, 11);
		if (review!=null) {
			System.out.println("Review ID:"+review.getId());
			System.out.println("Heading:"+review.getHeading());
			System.out.println("Comment:"+review.getComment());
			System.out.println("Product Details for product ID="+review.getProduct().getId());
			Product product = review.getProduct();
			System.out.println("Product ID:"+product.getId());
			System.out.println("Name:"+product.getName());
			System.out.println("Cost:"+product.getCost());
			
			
		} else {
			System.out.println("Review ID Does Not Exists");
		}
		
	}

}
