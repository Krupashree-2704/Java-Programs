package com.jsp.mtm.model;

import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	static Scanner myInput=new Scanner(System.in);
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		do {
//			System.out.println("Enter Operation to perform");
//			System.out.println("1.Add\n2.Read\n3.Update\n4.delete");
//			System.out.println("enter digit respectively");
//			int userInput=myInput.nextInt();
//			myInput.nextLine();
//			switch (userInput) {
//			case 0:
//				myInput.close();
//				System.out.println("Exited");
//				System.exit(0);
//				break;
//			case 1:
//				
//				break;
//			case 2:
//				Student student = new Student();
//				System.out.println("Enter Student ID:");
//				int student_id=myInput.nextInt();
//				myInput.nextLine();
//				System.out.println("Enter Student Name:");
//				String student_name=myInput.nextLine();
//				System.out.println("Enter Student Email:");
//				String student_email=myInput.nextLine();
//				System.out.println("enter Student Mobile:");
//				long student_mobile=myInput.nextLong();
//				myInput.nextLine();
//				
//				student.setId(student_id);
//				student.setName(student_name);
//				student.setEmail(student_email);
//				student.setMobile_number(student_mobile);
//				ArrayList<Student> students = new ArrayList<Student>();
//				students.add(student);
//				
//				Subject subject = new Subject();
//				System.out.println("Enter Subject ID:");
//				int subject_id=myInput.nextInt();
//				myInput.nextLine();
//				System.out.println("Enter Subject Name:");
//				String subject_name=myInput.nextLine();
//				System.out.println("Enter Subject Description:");
//				String subject_description=myInput.nextLine();
//				System.out.println("Enter Subject Trainer:");
//				String subject_trainer=myInput.nextLine();
//				subject.setId(subject_id);
//				subject.setName(subject_name);
//				subject.setDescription(subject_description);
//				subject.setTrainer(subject_trainer);
//				
//				ArrayList<Subject> subjects = new ArrayList<Subject>();
//				subjects.add(subject);
//				
//				entityTransaction.begin();
//				
//				entityManager.persist(subject);
//				subject.setStudents(students);
//				for (Student student1 : students) {
//					entityManager.persist(student1);
//					student1.setSubject(subjects);
//				}
//				entityTransaction.commit();
//				
//				break;
//
//			default:
//				break;
//			}
//		} while (true);
	}

}
