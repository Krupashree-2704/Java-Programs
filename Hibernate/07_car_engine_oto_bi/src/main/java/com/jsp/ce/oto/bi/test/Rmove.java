package com.jsp.ce.oto.bi.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ce.oto.bi.Car;
import com.jsp.ce.oto.bi.Engine;

public class Rmove {

	//car and its engine which is mapped gets removed
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Car findCarToRemove = entityManager.find(Car.class, 3);
		Engine engine = findCarToRemove.getEngine();
		if (findCarToRemove!=null) {
			entityManager.remove(findCarToRemove.getEngine());
			entityManager.remove(engine.getCar());
			entityManager.remove(findCarToRemove);
			entityManager.remove(engine);
			entityTransaction.commit();
		}
		
		
		
		
	}

}
