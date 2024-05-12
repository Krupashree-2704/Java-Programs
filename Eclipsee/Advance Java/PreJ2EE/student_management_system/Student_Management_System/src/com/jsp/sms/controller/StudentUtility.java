package com.jsp.sms.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.jsp.sms.model.Student;


public class StudentUtility {
	static Scanner myInput=new Scanner(System.in);
//	Create Methods
//	1.Add Student
	public static Student addStudent()
	{
		
		Student student = new Student();
		System.out.println("Enter Student ID:");
		student.setId(myInput.nextInt());
		myInput.nextLine();
		System.out.println("Enter Student Name:");
		student.setName(myInput.nextLine());
		System.out.println("Enter Student Age:");
		student.setAge(myInput.nextInt());
		myInput.nextLine();
		return student;
	}
//	2.Update Student
	public static void update(List<Student>students,int updateChoice)
	{
		switch (updateChoice) {
		case 1:
			System.out.println("Enter the student ID you want to update details:");
			int student_id_update=myInput.nextInt();
			myInput.nextLine();
			System.out.println("Enter the updated Name:");
			String student_name_updated=myInput.nextLine();
			System.out.println("Enter the updated Age:");
			int student_age_updated=myInput.nextInt();
			myInput.nextLine();
			int index_cap=0;
			for (Student student : students) {
				if (student.getId()==student_id_update) {
					break;
				}
				index_cap++;
			}
			students.get(index_cap).setName(student_name_updated);
			students.get(index_cap).setAge(student_age_updated);
			break;
		case 2:
			System.out.println("Enter the student ID you want to update details:");
			int student_id_update_name=myInput.nextInt();
			myInput.nextLine();
			System.out.println("Enter the updated Name:");
			String student_name_updated_name=myInput.nextLine();
			int count_name=0;
			for (Student student : students) {
				if (student.getId()==student_id_update_name) {
					break;
				}
				count_name++;
			}
			students.get(count_name).setName(student_name_updated_name);
			break;
		case 3:
			System.out.println("Enter the student ID you want to update details:");
			int student_id_update_age=myInput.nextInt();
			myInput.nextLine();
			System.out.println("Enter the updated Age:");
			int student_age_updated_age=myInput.nextInt();
			myInput.nextLine();
			int count_age=0;
			for (Student student : students) {
				if (student.getId()==student_id_update_age) {
					break;
				}
				count_age++;
			}
			students.get(count_age).setAge(student_age_updated_age);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
	}
//	3.Display Student
	public static void displayAllStudents(List<Student>student)
	{
		Iterator<Student> studentIterator = student.iterator();
		while (studentIterator.hasNext()) {
			System.out.println(studentIterator.next().toString());
			
		}
	}
	
//	4.Delete student
	public static void Removestudent(List<Student>students)
	{
		System.out.println("Enter student ID to Delete:");
		int student_id_remove=myInput.nextInt();
		myInput.nextLine();
		Iterator<Student> studentIterator = students.iterator();
		while (studentIterator.hasNext()) {
			Student student = studentIterator.next();
			if (student.getId()==student_id_remove) {
				studentIterator.remove();
			}
			
		}
		
	}
	
}
