package com.jsp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.carengine.oto.uni.model.Car;
import com.jsp.carengine.oto.uni.model.Engine;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Car car = new Car();
//		car.setId(1);
		car.setCar_name("Honda City");
		car.setCar_chasis("Y8s");
		car.setCar_cost(123.4);
		
		Engine engine=new Engine();
		engine.setId(1);
		engine.setCc(2);
		engine.setNo_of_cylinders((byte) 3);
		car.setEngine(engine);
		
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();

	}

}
