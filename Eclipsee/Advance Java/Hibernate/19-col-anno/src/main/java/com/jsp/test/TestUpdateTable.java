package com.jsp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.model.Person;

public class TestUpdateTable {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
//		Person person1 = new Person();
//		person1.setId(3);
//		person1.setName("hello");
//		person1.setMob_no(123456789);
//		person1.setGender(true);
		Person find = entityManager.find(Person.class, 3);
		find.setGender(false);
		find.setMob_no(12344);
		entityTransaction.begin();
		entityManager.persist(find);
		
		entityTransaction.commit();

	}

}
