package com.jsp.mtm.view;

import java.util.ArrayList;
import java.util.List;

import com.jsp.mtm.controller.StudentController;
import com.jsp.mtm.controller.SubjectController;
import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;

public class StudentView {
	static SubjectController subjcont=new SubjectController();
	static StudentController stucont=new StudentController();
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Subject> subjectList = new ArrayList<Subject>();
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Manuja");
		student1.setEmail("m@g.co");
		student1.setMobile_number(1234333);
		

		System.out.println(subjectList);
		
		
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Krupa");
		student2.setEmail("k@g.co");
		student2.setMobile_number(231324);
		
		
		Subject findSubject1 = subjcont.findSubject(11);
		Subject findSubject2=subjcont.findSubject(22);
		subjectList.add(findSubject1);
		subjectList.add(findSubject2);
		student1.setSubject(subjectList);
		
		Subject findSubject3 = subjcont.findSubject(11);
		Subject findSubject4=subjcont.findSubject(22);
		subjectList.add(findSubject3);
		subjectList.add(findSubject4);
		student2.setSubject(subjectList);
		
		studentList.add(student1);
		studentList.add(student2);
		stucont.insertStudent(studentList);
//		subjcont.insertSubject(subjectList);
		
		
		
//		subjcont.insertSubject(subjectList);
		
		Student findStudent = stucont.findStudent(9);
		if (findStudent!=null) {
			System.out.println("ID:"+findStudent.getId());
			System.out.println("Name:"+findStudent.getName());
			System.out.println("Email:"+findStudent.getEmail());
			System.out.println("Mobile:"+findStudent.getMobile_number());
			List<Subject> subject = findStudent.getSubject();
			System.out.println(subject);
//			for (Subject subject2 : subject) {
//				System.out.println("Sub ID:"+subject2.getId());
//				System.out.println("Sub Name:"+subject2.getName());
//				System.out.println("Sub Desc:"+subject2.getDescription());
//				System.out.println("Sub Trainer:"+subject2.getTrainer());
//			}
			
		}
		
		
		
		
	}

}
