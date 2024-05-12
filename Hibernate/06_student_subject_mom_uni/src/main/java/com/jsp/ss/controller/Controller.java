package com.jsp.ss.controller;

import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import com.jsp.ss.model.Student;
import com.jsp.ss.model.Subject;


public class Controller {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
//	public boolean insertStudentsAndSubjecs(Student student,List<Subject> subject)
//	{
//		if (student!=null && subject!=null) {
//			entityTransaction.begin();
//			entityManager.persist(student);
//			entityManager.persist(subject);
//			entityTransaction.commit();
//			return true;
//		}
//		return false;
//	}
//	public Subject findSubjectDetails(int subjectID)
//	{
//		return entityManager.find(Subject.class, subjectID);
//	}
	public boolean insert_new_subject(Student student , Subject subject) {
		if(student!=null && subject!=null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityManager.persist(subject);
			entityTransaction.commit();
			return true;
		}
		
		return false;
	}
	public boolean insert_already_exist_subject(Student student) {
		if(student!=null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
			return true;
		}

		return false;
	}
	public boolean insert_student(List<Student>student)
	{
		if (student!=null) {
			entityTransaction.begin();
			for (Student student2 : student) {
				entityManager.persist(student2);
			}
			entityTransaction.commit();
			return true;
		} 
		return false;
	}
	public boolean insert_subject(List<Subject>subject)
	{
		if (subject!=null) {
			entityTransaction.begin();
			for (Subject subject2 : subject) {
				entityManager.persist(subject2);
			}
			
			entityTransaction.commit();
			return true;
		} 
		return false;
	}
	public boolean insert_subject_for_existing_student(Student student,Subject subject)
	{
		if(student!=null && subject!=null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityManager.persist(subject);
			entityTransaction.commit();
			return true;
		}
		return false;
		
	}
	public Subject find(int subject_id) {
		return entityManager.find(Subject.class, subject_id);
	}
	public Student findStudent(int student_id)
	{
		return entityManager.find(Student.class,student_id );
		
	}
	public List<Student> fetchAllStudents()
	{
		TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s", Student.class);
		return query.getResultList();
	}
	public List<Subject> fetchAllSubjects()
	{
		TypedQuery<Subject> query = entityManager.createQuery("SELECT s FROM Subject s", Subject.class);
		return query.getResultList();
	}
	public boolean updateStudent(int student_id_to_update,Object updated_attribute,int userChoice)
	{
		if (userChoice==1) {

			entityTransaction.begin();
			Student findStudentToUpdate = entityManager.find(Student.class, student_id_to_update);
			if (findStudentToUpdate!=null) {
				findStudentToUpdate.setEmail((String)updated_attribute);
				entityManager.merge(findStudentToUpdate);
			} 
			entityTransaction.commit();
			return true;
		
		} else if (userChoice==2) {
			entityTransaction.begin();
			Student findStudentToUpdate = entityManager.find(Student.class, student_id_to_update);
			if (findStudentToUpdate!=null) {
				findStudentToUpdate.setMobile_number((Long)updated_attribute);
				entityManager.merge(findStudentToUpdate);
			} 
			entityTransaction.commit();
			return true;
		}else{
			System.out.println("Invalid Option!!!!");
			return false;
			
		}
//		return true;
	}
	public boolean updateSubject(int subject_id_to_update,Object updated_attribute1,byte userChoice)
	{
		if (userChoice==1) {
			
			entityTransaction.begin();
			Subject subjectIdToUpdateDescrip = entityManager.find(Subject.class ,subject_id_to_update);
			if (subjectIdToUpdateDescrip!=null) {
				subjectIdToUpdateDescrip.setDescription((String)updated_attribute1);
				entityManager.merge(subjectIdToUpdateDescrip);
			} 
			entityTransaction.commit();
			return true;
		} else if (userChoice==2) {

			entityTransaction.begin();
			Subject subjectIdToUpdate = entityManager.find(Subject.class ,subject_id_to_update);
			if (subjectIdToUpdate!=null) {
				subjectIdToUpdate.setTrainer((String)updated_attribute1);
				entityManager.merge(subjectIdToUpdate);
			} 
			entityTransaction.commit();
			return true;
		}else{
			System.out.println("Invalid Option Bad Luck!!!!");
			return false;
			
		}
//		return true;
	}
	public boolean removeStudent(int student_id)
	{
		Student findStudentToRemove = entityManager.find(Student.class, student_id);
		if (findStudentToRemove!=null) {
			entityTransaction.begin();
			entityManager.remove(findStudentToRemove);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	public boolean removeSubject(int subject_id)
	{
		Subject findSubjectToRemove = entityManager.find(Subject.class, subject_id);
		if (findSubjectToRemove!=null) {
			entityTransaction.begin();
			entityManager.remove(findSubjectToRemove);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	public boolean deleteParticularSubject(int studentIdToFind,int subjectIdToDelete)
	{
		Student student = entityManager.find(Student.class,studentIdToFind);
		if (student!=null) {
			List<Subject> subjects = student.getSubject();
			if (subjects==null) {
				return false;
			}
			else
			{
				Subject subjectToRemove=null;
				for (Subject subject2 : subjects) {
					if (subject2.getId()==subjectIdToDelete) {
						subjectToRemove=subject2;
						break;
					}
				}
				if (subjectToRemove!=null) {
					entityTransaction.begin();
					subjects.remove(subjectToRemove);
					entityTransaction.commit();
					return true;
				}
				else {

					return false;
				}
			}
	
		}

		return false;
	}
	
}
