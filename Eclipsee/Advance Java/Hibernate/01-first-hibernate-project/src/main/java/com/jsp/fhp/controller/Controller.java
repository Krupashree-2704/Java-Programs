package com.jsp.fhp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {

	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");

//		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("persistance_unit_name");
		EntityManager entityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
//		.getTransaction=>similar to .getConnection()
		System.out.println(createEntityManagerFactory);

	}

}
