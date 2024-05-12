package com.jspiders.ems.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.border.EtchedBorder;
import javax.transaction.Transaction;

import com.jspiders.ems.model.Employees;

public class EmployeeController {
	
		static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
		static EntityManager entityManager = entityManagerFactory.createEntityManager();
		static EntityTransaction transaction = entityManager.getTransaction();
	
		
	
	public static boolean insertEmployee(Employees employee)
	{
		if (employee!=null) {
			transaction.begin();
			entityManager.persist(employee);
			transaction.commit();
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static Employees readParticularEmployee(int empid)
	{
		return entityManager.find(Employees.class, empid);
	}
	public static List<Employees> readAllEmployees()
	{
		TypedQuery<Employees> createQuery = entityManager.createQuery("select e from Employees e", Employees.class);
		List<Employees> resultList = createQuery.getResultList();
		return resultList;
	}
	public boolean updateEmpName(int empid,String name)
	{
		Employees employeeEmpName = entityManager.find(Employees.class, empid);
		if (employeeEmpName!=null) {
			transaction.begin();
			employeeEmpName.setName(name);
			entityManager.merge(employeeEmpName);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}
	public boolean updateEmpEmail(int empid,String email)
	{
		Employees employeeEmpEmail = entityManager.find(Employees.class, empid);
		if (employeeEmpEmail!=null) {
			transaction.begin();
			employeeEmpEmail.setEmail(email);
			entityManager.merge(employeeEmpEmail);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}
	public boolean updateEmpDept(int empid,String dept)
	{
		Employees employeeEmpDept = entityManager.find(Employees.class, empid);
		if (employeeEmpDept!=null) {
			transaction.begin();
			employeeEmpDept.setDept(dept);
			entityManager.merge(employeeEmpDept);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}
	public boolean updateEmpSalary(int empid,double sal)
	{
		Employees employeeEmpSal = entityManager.find(Employees.class, empid);
		if (employeeEmpSal!=null) {
			transaction.begin();
			employeeEmpSal.setSal(sal);
			entityManager.merge(employeeEmpSal);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}
	public boolean deleteEmp(int empID)
	{
		Employees deleteEmployee = entityManager.find(Employees.class, empID);
		if (deleteEmployee!=null) {
			transaction.begin();
			entityManager.remove(deleteEmployee);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}
}
