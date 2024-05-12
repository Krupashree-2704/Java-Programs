package com.jsp.ce.oto.bi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.ce.oto.bi.Car;
import com.jsp.ce.oto.bi.Engine;

public class Controller {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public boolean insert_car_engine(Car car,Engine engine)
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
	public Car findCar(int car_id)
	{
		return entityManager.find(Car.class, car_id);
	}
	public Engine findEngine(int engine_id)
	{
		return entityManager.find(Engine.class, engine_id);
	}
	public List<Car> fetchAllCars()
	{
		TypedQuery<Car> query = entityManager.createQuery("SELECT s FROM Car s", Car.class);
		return query.getResultList();
	}
	public boolean updateCar(int car_id_to_update, byte userCarChoice, Object updated_car_name)
	{
		switch (userCarChoice) {
		case 1:
			Car updateCar = entityManager.find(Car.class, car_id_to_update);
			if (updateCar!=null) {
				updateCar.setCar_name((String)updated_car_name);
				entityTransaction.begin();
				entityManager.merge(updateCar);
				entityTransaction.commit();
				return true;
			}
			break;
		case 2:
			Car updateCar1 = entityManager.find(Car.class, car_id_to_update);
			if (updateCar1!=null) {
				updateCar1.setCar_cost((Double)updated_car_name);
				entityTransaction.begin();
				entityManager.merge(updateCar1);
				entityTransaction.commit();
				return true;
			}
			break;

		default:
			System.out.println("Select appropriate option!!!");
			break;
		}
		
		return false;
	}
	public boolean updateEngine(int engine_id_to_update, byte userEngineChoice, Object updated_engine_entity)
	{
		switch (userEngineChoice) {
		case 1:
			Engine updateEngine = entityManager.find(Engine.class, engine_id_to_update);
			if (updateEngine!=null) {
				updateEngine.setCc((Double)updated_engine_entity);
				entityTransaction.begin();
				entityManager.merge(updateEngine);
				entityTransaction.commit();
				return true;
			}
			break;

		default:
			System.out.println("Select Appropriate Option");
			break;
		}
		return false;
	}
	
	
	public List<Engine> fetchAllEngines()
	{
		TypedQuery<Engine> query = entityManager.createQuery("SELECT s FROM Engine s", Engine.class);
		return query.getResultList();
	}
	public boolean removeCarAndEngine(int car_id_to_remove)
	{
		entityTransaction.begin();
		Car findCarToRemove = entityManager.find(Car.class,car_id_to_remove );
		Engine engine = findCarToRemove.getEngine();
		if (findCarToRemove!=null) {
//			entityTransaction.begin();
			entityManager.remove(findCarToRemove.getEngine());
//			entityManager.remove(engine.getCar());
			entityManager.remove(findCarToRemove);
			entityManager.remove(engine);
			entityTransaction.commit();
			return true;
		}
		
		return false;
	}
}
