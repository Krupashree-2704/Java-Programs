package com.qspi.ems.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int emp_id;
	private String emp_fullname;
	private String emp_email;
	private String emp_dept;
	private double emp_salary;
	private int emp_age;
	private boolean emp_gender;
	private long emp_contact;
	private String emp_username;
	private String emp_password;
	public Employee() {
		
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_fullname() {
		return emp_fullname;
	}
	public void setEmp_fullname(String emp_fullname) {
		this.emp_fullname = emp_fullname;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public String getEmp_dept() {
		return emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	public double getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
	public int getEmp_age() {
		return emp_age;
	}
	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}
	public boolean isEmp_gender() {
		return emp_gender;
	}
	public void setEmp_gender(boolean emp_gender) {
		this.emp_gender = emp_gender;
	}
	public long getEmp_contact() {
		return emp_contact;
	}
	public void setEmp_contact(long emp_contact) {
		this.emp_contact = emp_contact;
	}
	public String getEmp_username() {
		return emp_username;
	}
	public void setEmp_username(String emp_username) {
		this.emp_username = emp_username;
	}
	public String getEmp_password() {
		return emp_password;
	}
	public void setEmp_password(String emp_password) {
		this.emp_password = emp_password;
	}
	
	
	
}

