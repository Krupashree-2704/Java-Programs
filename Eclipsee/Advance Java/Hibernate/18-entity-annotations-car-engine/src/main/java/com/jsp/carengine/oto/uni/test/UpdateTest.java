package com.jsp.carengine.oto.uni.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.carengine.oto.uni.model.Car;
import com.jsp.carengine.oto.uni.model.Engine;

public class UpdateTest {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		Car find = entityManager.find(Car.class, 4);
		find.setCar_cost(230000);
		Engine engine = find.getEngine();
		engine.setCc(25);
		entityManager.merge(find);
		entityTransaction.commit();

	}

}
