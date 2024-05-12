package com.jsp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.carengine.oto.uni.model.Car;
import com.jsp.carengine.oto.uni.model.Engine;

public class TestUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Car car = entityManager.find(Car.class, 1);		
		Engine engine2 = car.getEngine();
		engine2.setCc(330);
		entityTransaction.begin();
		entityManager.merge(car);
		entityTransaction.commit();
		

	}

}
