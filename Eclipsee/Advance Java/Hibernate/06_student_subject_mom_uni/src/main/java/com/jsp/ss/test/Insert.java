package com.jsp.ss.test;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ss.model.Student;
import com.jsp.ss.model.Subject;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		Student student1 = new Student();
//		student1.setId(1);
//		student1.setName("Aarya");
//		student1.setEmail("a@g.co");
//		student1.setMobile_number(123456);
//		
//		Subject subject1 = new Subject();
//		subject1.setId(11);
//		subject1.setName("SQL");
//		subject1.setDescription("Database");
//		subject1.setTrainer("VK");
//		
//		Subject subject2 = new Subject();
//		subject2.setId(22);
//		subject2.setName("Java");
//		subject2.setDescription("Middleware");
//		subject2.setTrainer("SK");
		
//		ArrayList<Subject> subjects=new ArrayList();
//		subjects.add(subject1);
//		subjects.add(subject2);
//		
//		student1.setSubject(subjects);
//		
//		entityTransaction.begin();
//		entityManager.persist(student1);
//		entityManager.persist(subject1);
//		entityManager.persist(subject2);
//		entityTransaction.commit();
//		
		
//		Considering we have subject already existing in subject table
//		Now If we want to add new Student and assign available Subject
		
		
//		Student student2 = new Student();
//		student2.setId(2);
//		student2.setName("Aakash");
//		student2.setEmail("a@g.co");
//		student2.setMobile_number(12345678);
//		
//		Subject subject = entityManager.find(Subject.class, 11);
//		ArrayList<Subject> subjects1 = new ArrayList<Subject>();
//		subjects1.add(subject);
//		
//		student2.setSubject(subjects1);
//		
//		entityTransaction.begin();
//		entityManager.persist(student2);
//		entityTransaction.commit();
		
		
		
		

	}

}
