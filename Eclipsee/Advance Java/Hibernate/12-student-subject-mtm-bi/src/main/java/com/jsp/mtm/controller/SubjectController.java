package com.jsp.mtm.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;

public class SubjectController {
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
	EntityManager entityManager = createEntityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Subject findSubject(int subjid)
	{
		return entityManager.find(Subject.class, subjid);
	}
	public boolean insertSubject(Subject subjects)
	{
		if (subjects!=null) {
			entityTransaction.begin();
			
			entityManager.persist(subjects);
			
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	public Subject listofstudentoptedbysubject(int subjectId)
	{
		return entityManager.find(Subject.class, subjectId);
	}
	public List<Subject> fetchAllSubjects()
	{
		TypedQuery<Subject> query = entityManager.createQuery("SELECT s FROM Subject s", Subject.class);
		return query.getResultList();
	}
}
