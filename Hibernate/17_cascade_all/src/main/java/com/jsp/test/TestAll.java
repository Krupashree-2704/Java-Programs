package com.jsp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.carengine.oto.uni.model.Car;
import com.jsp.carengine.oto.uni.model.Engine;

public class TestAll {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		Car car = new Car();
//		car.setId(2);
//		car.setCar_name("Mercedes");
//		car.setChasis("Y2B");
//		car.setCost(2300);
//		Engine engine = new Engine();
//		engine.setId(2);
//		engine.setCc(300);
//		engine.setNo_of_cylinder((byte)3);
//		car.setEngine(engine);
//		
//		entityTransaction.begin();
//		entityManager.persist(car);
//		entityTransaction.commit();
		
//		entityManager.find(, entityTransaction)
	}

}
