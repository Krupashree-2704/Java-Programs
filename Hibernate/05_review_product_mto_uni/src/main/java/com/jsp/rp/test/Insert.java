package com.jsp.rp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.rp.model.Product;
import com.qsp.rp.model.Review;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		For Inserting the review first condition is that product should be exist
//		Below line is for Making the object of Product Class
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Mobile");
		product1.setCost(6000);
		
//		Now Product is made so we can add Review Regarding to it
//		Make Review objects and add values
//		Diff Diff Object=>Reviews are not added togetherly
		
		Review review1= new Review();
		review1.setId(11);
		review1.setHeading("Good");
		review1.setComment("Go For It");
		
//		Here we have to decide review for which product 
//		Set Product for review for recognition
		
		review1.setProduct(product1);
		Review review2 = new Review();
		review2.setId(22);
		review2.setHeading("Bad");
		review2.setComment("Don't Buy");
		review2.setProduct(product1);
		
//		Data is being modified in database:so club persist() in btn eT.begin() and eT.commit
		
		entityTransaction.begin();
		
//		Here insertion Order matters:as without existence of product we cannot add review regrading it
//		So insert product first then add reviews(by order of how it is adding)
		
		entityManager.persist(product1);
		entityManager.persist(review1);
		entityManager.persist(review2);
		entityTransaction.commit();
		
		
		
	}
}
