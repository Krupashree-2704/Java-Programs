package com.jsp.insertcrud.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Utility {

		public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
		public static EntityManager entityManager = entityManagerFactory.createEntityManager();
		public static EntityTransaction transaction = entityManager.getTransaction();
	

}
