package com.jsp.ce.oto.bi.eliminateduplicate.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import com.jsp.ce.oto.bi.eliminateduplicate.Car;
//import com.jsp.ce.oto.bi.eliminateduplicate.Engine;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

	}

}
