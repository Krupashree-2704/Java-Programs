package com.jsp.sms.model;

//import java.util.List;

public class Student {
	private int id;
	private String name;
	private int age;
//	private List<Student>students;
//	public List<Student> getStudent() {
//		return students;
//	}
//
//	public void setStudent(List<Student> students) {
//		this.students = students;
//	}


	
	public int getId() {
		return id;
	}
	public Student(int id, String name, int age) {
	
	this.id = id;
	this.name = name;
	this.age = age;
}
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
