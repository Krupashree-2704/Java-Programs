package com.jsp.ce.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ce.model.Car;
import com.jsp.ce.model.Engine;

public class Controller {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public boolean insert(Car car,Engine engine)
	{
		if (car!=null && engine!=null) {
			entityTransaction.begin();
			entityManager.persist(car);
			entityManager.persist(engine);
			entityTransaction.commit();
			return true;
		}
		
		return false;
		
		
	}
	public Car searchById(int primaryKey) {
//		Car car=new Car();
		Car car = entityManager.find(Car.class, primaryKey);
		
		return car;
	}
//	public Engine searchByID(int primaryKey)
//	{
//		Engine engine = entityManager.find(Engine.class, primaryKey);
//		return engine;
//	}
	public boolean removeCarByID(int primaryKey)
	{
		
		Car searchBycarId = searchById(primaryKey);
//		searchBycarId.getEngine();
		if (searchBycarId!=null) {
			entityTransaction.begin();
			entityManager.remove(searchBycarId);
			entityManager.remove(searchBycarId.getEngine());
			entityTransaction.commit();
			return true;
		} else {
			System.out.println("Car ID does not exists");

		}
		
		return false;
	}

	public boolean updateCarByCost(int car_id,double updated_cost)
	{
		Car car=searchById(car_id);
		if (car!=null) {
			car.setCost(updated_cost);
			entityTransaction.begin();
			entityManager.merge(car);
			entityTransaction.commit();
			return true;
		} else {
			System.out.println("Car with given id does not exists .no update opertaion performed");
		}
		return false;
	}
	public boolean updateEngineByCC(int car_id,double updated_cc)
	{
		Car searchById = searchById(car_id);
		Engine engine = searchById.getEngine();
		if (engine!=null) {
			engine.setCc(updated_cc);
			entityTransaction.begin();
			entityManager.merge(engine);
			entityTransaction.commit();
			return true;
		} else {
			System.out.println("Engine with given id does not exists .no update opertaion performed");
		}
		return false;
		
	}
//	public boolean updateCarBy(int car_id,double updated_cost)
//	{
//		Car car=searchById(car_id);
//		if (car!=null) {
//			car.setCost(updated_cost);
//			entityTransaction.begin();
//			entityManager.merge(car);
//			entityTransaction.commit();
//			return true;
//		} else {
//			System.out.println("Car with given id does not exists .no update opertaion performed");
//		}
//		return false;
//	}
	
/*
 * access modifier:public,private,protected
 * access modifier defines accessibility of the member
 * 
 * non-access modifier:static ,non-static 
 * defines characteristics of member
 * 
 */
	
}
