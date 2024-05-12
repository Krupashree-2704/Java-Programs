package com.jsp.mtm.view;

import java.util.ArrayList;

import com.jsp.mtm.controller.StudentController;
import com.jsp.mtm.controller.SubjectController;
import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;

public class SubjectView {
	static SubjectController subjcont=new SubjectController();
	static StudentController stucont=new StudentController();
	public static void main(String[] args) {
		ArrayList<Subject> subjectList = new ArrayList<Subject>();
		ArrayList<Student> studentlist = new ArrayList<Student>();
		Subject subject1 = new Subject();
		subject1.setId(55);
		subject1.setName("Python");
		subject1.setDescription("Python+Structured query Language");
		subject1.setTrainer("VK");
		subjectList.add(subject1);
		
		
		Subject subject2 = new Subject();
		subject2.setId(66);
		subject2.setName("HTML");
		subject2.setDescription("HyperTextMarkUpLanguage");
		subject2.setTrainer("UK");
		subjectList.add(subject2);
		Student findStudent1 = stucont.findStudent(9);
		Student findStudent2 = stucont.findStudent(10);
		studentlist.add(findStudent1);
		studentlist.add(findStudent2);
		subjectList.add(subject1);
		subjectList.add(subject2);
		subject1.setStudents(studentlist);
		subject2.setStudents(studentlist);
		
//		subjcont.insertSubject(subjectList);
		
	}
}
