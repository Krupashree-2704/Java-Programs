package com.jsp.entity.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.model.Person;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
//		Person person = new Person();
//		person.setId(1);
//		person.setName("Abhishek");
//		entityTransaction.begin();
//		entityManager.persist(person);
//		entityTransaction.commit();
		Person find = entityManager.find(Person.class, 1);
		System.out.println(find.getId());
		System.out.println(find.getName());
		Person find1 = entityManager.find(Person.class, 1);
//		find1.setName("Krupashree");
		System.out.println(find1.getId());
		System.out.println(find1.getName());
		entityTransaction.begin();
		entityManager.merge(find1);
		entityTransaction.commit();
		Person find2 = entityManager2.find(Person.class, 1);
		
		
		System.out.println(find2.getId());
		System.out.println(find2.getName());
		Person find3 = entityManager2.find(Person.class, 1);
		System.out.println(find3.getId());
		System.out.println(find3.getName());
	}

}
