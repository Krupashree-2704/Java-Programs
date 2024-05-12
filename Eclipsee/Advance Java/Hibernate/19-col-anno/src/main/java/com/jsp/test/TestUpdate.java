package com.jsp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import com.jsp.entity.model.Person;

public class TestUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
//		Person find = createEntityManager.find(Person.class,1);
//		find.setName("Sharan");
//		createEntityManager.merge(find);
		transaction.commit();

	}

}
