package com.jsp.entity.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.model.Person;

public class TestFind {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager1.getTransaction();
		Person find = entityManager1.find(Person.class, 1);
		Person find2 = entityManager2.find(Person.class, 1);
		System.out.println(find.getId());
		System.out.println(find.getName());
		System.out.println(find2.getId());
		System.out.println(find2.getName());

	}

}
