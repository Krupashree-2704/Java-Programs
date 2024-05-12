package com.jsp.mtm.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;


public class StudentController {
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
	EntityManager entityManager = createEntityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Student findStudent(int studid)
	{
		return entityManager.find(Student.class, studid);
	}
	public boolean insertStudent(List<Student>students)
	{
		if (students!=null) {
			entityTransaction.begin();
			for (Student student : students) {
				entityManager.persist(student);
			}
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	public Student listofsubjectoptedbystudent(int studentId)
	{
		return entityManager.find(Student.class, studentId);
	}
	public List<Student> fetchAllStudents()
	{
		TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s", Student.class);
		return query.getResultList();
	}
}
