package com.jsp.carengine.oto.uni.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.carengine.oto.uni.model.Car;
import com.jsp.carengine.oto.uni.model.Engine;

public class InsertTest {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Car car = new Car();
		car.setCar_name("Mustang");
		car.setCar_chasis("O666e");
		car.setCar_cost(23400);
		
		Engine engine = new Engine();
		engine.setCc(22.2);
		engine.setNo_of_cylinders((byte) 3);
		
		car.setEngine(engine);
		
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();

	}

}
