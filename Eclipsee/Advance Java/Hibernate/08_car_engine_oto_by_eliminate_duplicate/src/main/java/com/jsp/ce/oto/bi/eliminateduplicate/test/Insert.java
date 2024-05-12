package com.jsp.ce.oto.bi.eliminateduplicate.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ce.oto.bi.eliminateduplicate.Car;
import com.jsp.ce.oto.bi.eliminateduplicate.Engine;

//import com.jsp.ce.oto.bi.eliminateduplicate.Car;
//import com.jsp.ce.oto.bi.eliminateduplicate.Engine;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Car car=new Car();
		Engine engine=new Engine();
//		car.setId(1);
//		car.setCar_name("Alto");
//		car.setChasis("Y2S");
//		car.setCost(1200);
//		
//		engine.setId(1);
//		engine.setCc(100);
//		engine.setNo_of_cylinders((byte)2);
//		
//		car.setEngine(engine);
//		engine.setCar(car);
		
		engine.setId(2);
		engine.setCc(200);
		engine.setNo_of_cylinders((byte)1);
		
		car.setId(2);
		car.setCar_name("Jaguar");
		car.setChasis("Ops2");
		car.setCost(2300);
		
		car.setEngine(engine);
		engine.setCar(car);
		
		entityTransaction.begin();
		entityManager.persist(car);
		entityManager.persist(engine);
		entityTransaction.commit();

	}

}
