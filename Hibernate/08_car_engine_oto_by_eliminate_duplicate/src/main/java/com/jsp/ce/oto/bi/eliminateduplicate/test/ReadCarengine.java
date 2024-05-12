package com.jsp.ce.oto.bi.eliminateduplicate.test;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ce.oto.bi.eliminateduplicate.Car;
import com.jsp.ce.oto.bi.eliminateduplicate.Engine;

public class ReadCarengine {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		Car find = entityManager.find(Car.class, 1);
//		System.out.println(find.getId());
//		System.out.println(find.getCar_name());
//		System.out.println(find.getChasis());
//		System.out.println(find.getCost());
//		Engine engine = find.getEngine();
//		System.out.println(engine.getId());
//		System.out.println(engine.getCc());
//		System.out.println(engine.getNo_of_cylinders());
//		
//		Engine find2 = entityManager.find(Engine.class, 1);
//		System.out.println(find2.getId());
//		System.out.println(find2.getCc());
//		System.out.println(find2.getNo_of_cylinders());
//		Car car = find2.getCar();
//		System.out.println(car.getId());
//		System.out.println(car.getCar_name());
//		System.out.println(car.getChasis());
//		System.out.println(car.getCost());
		
//		Car find = entityManager.find(Car.class, 1);
//		entityTransaction.begin();
//		entityManager.remove(find);
//		entityTransaction.commit();
		
		Engine find = entityManager.find(Engine.class, 1);
		entityTransaction.begin();
		entityManager.remove(find);
		entityTransaction.commit();
		
		
		

	}

}
