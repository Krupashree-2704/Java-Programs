package com.jsp.ss.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ss.model.Student;
import com.jsp.ss.model.Subject;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		
//		entityTransaction.begin();
//		Student findStudentToUpdate = entityManager.find(Student.class, 1);
//		if (findStudentToUpdate!=null) {
//			findStudentToUpdate.setEmail("ar@g.co");
//			entityManager.merge(findStudentToUpdate);
//		} 
//		entityTransaction.commit();
//		entityTransaction.begin();
//		Student findStudentToUpdate = entityManager.find(Student.class, 1);
//		if (findStudentToUpdate!=null) {
//			findStudentToUpdate.setMobile_number(1234567);
//			entityManager.merge(findStudentToUpdate);
//		} 
//		entityTransaction.commit();
		entityTransaction.begin();
		Subject subjectIdToUpdateDescrip = entityManager.find(Subject.class ,11);
		if (subjectIdToUpdateDescrip!=null) {
			subjectIdToUpdateDescrip.setDescription("Structured Query Language");
			entityManager.merge(subjectIdToUpdateDescrip);
		} 
		entityTransaction.commit();
//		entityTransaction.begin();
//		Subject subjectIdToUpdateTrainer = entityManager.find(Subject.class ,11);
//		if (subjectIdToUpdateTrainer!=null) {
//			subjectIdToUpdateTrainer.setTrainer("Vinay Sir");
//			entityManager.merge(subjectIdToUpdateTrainer);
//		} 
//		entityTransaction.commit();
//	}
//	public void updateStudentEmail(int studentIdToUpdate,String student_email)
//	{
//		
//	}

	}
}
