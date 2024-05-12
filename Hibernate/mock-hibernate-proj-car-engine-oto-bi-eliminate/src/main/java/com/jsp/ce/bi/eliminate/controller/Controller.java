package com.jsp.ce.bi.eliminate.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ce.bi.eliminate.model.Car;
import com.jsp.ce.bi.eliminate.model.Engine;

public class Controller {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public static boolean insert(Car car,Engine engine)
	{
		if (car!=null&&engine!=null) {
			entityTransaction.begin();
			entityManager.persist(car);
			entityManager.persist(engine);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	public static Car findCarandEngine(int car_id)
	{
		return entityManager.find(Car.class, car_id);
	}
	public static Engine findEngineandCar(int engine_id)
	{
		return entityManager.find(Engine.class, engine_id);
	}
	public boolean updateCarName(String carname,int car_id)
	{
		entityTransaction.begin();
		Car findCar = entityManager.find(Car.class, car_id);
		if (findCar!=null) {
			findCar.setCar_name(carname);
			entityManager.merge(findCar);
			entityTransaction.commit();
			return true;
		}
		
		return false;
	}
	public boolean removeCarandEngine(int car_id)
	{
		entityTransaction.begin();
		Car removeCar = entityManager.find(Car.class, car_id);
		if (removeCar!=null) {
			entityManager.remove(removeCar);
			entityManager.remove(removeCar.getEngine());
			entityTransaction.commit();
			return true;
		}
		
		return false;
	}
}

