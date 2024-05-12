package com.jsp.rp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.rp.model.Product;
import com.qsp.rp.model.Review;

public class Controller {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public boolean insertProductAndReview(Product product1 ,Review review1)
	{
		if (product1!=null && review1!=null) {
			entityTransaction.begin();
			entityManager.persist(product1);
			entityManager.persist(review1);
			entityTransaction.commit();
			return true;
		} 
		return false;
	}
//	public boolean insertProduct(Product product)
//	{
//		if (product!=null) {
//			entityTransaction.begin();
//			entityManager.persist(product);
//			entityTransaction.commit();
//			return true;
//		}
//		return false;
//	}
//	public boolean insertReview(Review review)
//	{
//		if (review!=null) {
//			entityTransaction.begin();
//			entityManager.persist(review);
//			entityTransaction.commit();
//			return true;
//		}
//		return false;
//	}
	public Review findReviewAndProductDetail(int primaryKey)
	{
		return entityManager.find(Review.class, primaryKey);
	}
	public boolean updateReviewCommentByReviewID(int primaryKey,Object content_to_update,byte userChoice)
	{
		if (userChoice==1) {
			entityTransaction.begin();
			Review review = entityManager.find(Review.class, primaryKey);
			if (review!=null) {
				
				review.setHeading((String)content_to_update);
				entityManager.merge(review);
			} else {
				System.out.println("Review ID Does not Exists");
				return false;
			}
			entityTransaction.commit();
			return true;
		}
		else if (userChoice==2) {
			entityTransaction.begin();
			Review review = entityManager.find(Review.class,primaryKey);
			if (review!=null) {
				
				review.setComment((String)content_to_update);
				entityManager.merge(review);
			} else {
				System.out.println("Review ID Does not Exists");
				return false;
			}
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
		
	}
//	public boolean updateReviewHeadingByReviewID(int primaryKey,String heading_to_update)
//	{
//		
//	}
	public boolean deleteReviewByReviewId(int primaryKey)
	{
		Review review = entityManager.find(Review.class, primaryKey);
		if (review!=null) {
			entityTransaction.begin();
//			Ideal condn:Product la remove nahi karaychay...
			entityManager.remove(review);
			entityTransaction.commit();
			return true;
		} else {
			System.out.println("Review with ID Does not Exists");
		}
		return false;
	}
	

}
