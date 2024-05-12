package com.jsp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.model.Person;

public class TestUnique {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person1 = new Person();
//		error
		person1.setId(7);
		person1.setName("heo");
		person1.setMob_no(123456789);
//		error
		person1.setParent_email("unique@g1.co");
		Person person2 = new Person();
		person2.setId(8);
		person2.setName("hello");
		person2.setMob_no(123456789);
		person2.setParent_email("unique@g.co");
		entityTransaction.begin();
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityTransaction.commit();

	}

}
