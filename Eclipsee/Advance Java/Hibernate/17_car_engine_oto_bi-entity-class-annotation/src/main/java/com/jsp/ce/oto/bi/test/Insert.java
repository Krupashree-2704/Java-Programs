package com.jsp.ce.oto.bi.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ce.oto.bi.Car;
import com.jsp.ce.oto.bi.Engine;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Car car = new Car();
//		car.setCar_id(1);
		car.setCar_name("Verna");
		car.setCar_chasis("ver123");
		car.setCar_cost(70000);
		
		Engine engine = new Engine();
//		engine.setId(11);
		engine.setCc(1600);
		engine.setNo_of_cylinders((byte)4);
		
		car.setEngine(engine);
//		engine.setCar(car);
		
		entityTransaction.begin();
		entityManager.persist(car);
//		entityManager.persist(engine);
		entityTransaction.commit();
//		Car car=new Car();
//		car.setCar_id(2);
//		car.setCar_name("Bugati");
//		car.setCar_chasis("B23");
//		car.setCar_cost(100000);
//		
//		Engine engine=new Engine();
//		engine.setId(22);
//		engine.setCc(1300);
//		engine.setNo_of_cylinders((byte)2);
//		
//		car.setEngine(engine);
//		engine.setCar(car);
//		
//		entityTransaction.begin();
//		entityManager.persist(car);
//		entityManager.persist(engine);
//		entityTransaction.commit();
	}

}
