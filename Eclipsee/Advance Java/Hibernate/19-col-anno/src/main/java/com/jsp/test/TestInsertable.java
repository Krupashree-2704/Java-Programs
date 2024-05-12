package com.jsp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.model.Person;

public class TestInsertable {
	Person person=new Person();
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = new Person();
		person.setId(5);
		person.setName("HIJ");
		person.setMob_no(12345);
		person.setGender(true);
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();

	}
	

}
