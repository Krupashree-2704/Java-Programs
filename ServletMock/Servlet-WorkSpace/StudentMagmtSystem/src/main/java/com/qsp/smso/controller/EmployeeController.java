package com.qsp.smso.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeController {
	
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();
	
}
