package com.jsp.entity.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.model.Person;


public class TestInsert {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
//		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager1.getTransaction();
		
		Person person = new Person();
		person.setName("ABC");
		person.setGender(true);
		person.setMob_no(1234567);
		person.setParent_email("abc@g.co");
		
		entityTransaction.begin();
		entityManager1.persist(person);
		entityTransaction.commit();
	}
	
//	First insert record
//	then make find class
//	then make 2 em's
	/*
	 * by one em find record
	 * by 2nd em find record but this time select stmt not printed
	 */

}
