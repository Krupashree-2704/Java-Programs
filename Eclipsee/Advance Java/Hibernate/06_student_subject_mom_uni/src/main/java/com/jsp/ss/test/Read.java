package com.jsp.ss.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.ss.model.Student;
import com.jsp.ss.model.Subject;

public class Read {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
//		Student find = entityManager.find(Student.class, 1);
//		System.out.println("Student ID: "+find.getId());
//		System.out.println("Student Name: "+find.getName());
//		System.out.println("Student Email: "+find.getEmail());
//		System.out.println("Student Mobile Number: "+find.getMobile_number());
//		List<Subject> subject2 = find.getSubject();
//		System.out.println("Details of Subjects for Respective Student ID: "+find.getId());
//		for (Subject subject : subject2) {
//			System.out.println("Subject ID: "+subject.getId());
//			System.out.println("Subject Name: "+subject.getName());
//			System.out.println("Subject Description: "+subject.getDescription());
//			System.out.println("Subject Trainer's Name: "+subject.getTrainer()+"\n");
//		}
//		
//		
		
		
////	Subject subject = entityManager.find(Subject.class, 11);
//		System.out.println(subject2.getId());
//		System.out.println(subject2.getName());
//		System.out.println(subject2.getDescription());
//		System.out.println(subject2.getTrainer());
		
//		System.out.println(subject2.get);
		
		//JPQL Query Execution
//		String jpql="SELECT s FROM Student s";
//		in eM.createQuery(String query,ClassName.class); return TypedQuery type list of Class Type:this is for writing query
//		TypedQuery<Student> createQuery = entityManager.createQuery(jpql, Student.class);
//		To make the string as query and to convert the query into typedQuery type and :we have cQ.getResultSet() which return list of student type
//		to print all values in list:do for each loop and print all this 
//		List<Student> resultList = createQuery.getResultList();
//		for (Student student : resultList) {
//			System.out.println("Student ID:"+student.getId());
//			System.out.println("Student's ID: "+student.getId());
//			System.out.println("Student's Name: "+student.getName());
//			System.out.println("Student's Email: "+student.getEmail());
//			System.out.println("Student's Mobile Number: "+student.getMobile_number());
////		}
		
		

	}

}
