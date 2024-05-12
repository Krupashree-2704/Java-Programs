package com.jsp.ss.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.ss.controller.Controller;
import com.jsp.ss.model.Student;
import com.jsp.ss.model.Subject;


public class NewView {
	static Controller controller=new Controller();
	static Scanner myInput=new Scanner(System.in);
	public static void main(String[] args) {
//		ArrayList<Student> studentList = new ArrayList<Student>();
//		System.out.println("How Many Students you want to add?:");
//		int count_of_student=myInput.nextInt();
//		myInput.nextLine();
//		while (count_of_student>0) {
//			Student student=new Student();
//			System.out.println("Enter Student ID:");
//			int student_id=myInput.nextInt();
//			myInput.nextLine();
//			System.out.println("Enter Student Name:");
//			String student_name=myInput.nextLine();
//			System.out.println("Enter Student Email:");
//			String student_email=myInput.nextLine();
//			System.out.println("Enter Student Contact:");
//			long student_contact=myInput.nextLong();
//			myInput.nextLine();
//			student.setId(student_id);
//			student.setName(student_name);
//			student.setEmail(student_email);
//			student.setMobile_number(student_contact);
//			studentList.add(student);
//			if (controller.insert_student(studentList)) {
//				System.out.println("Student Inserted Successfully.Insertion Operation Performed");
//			} else {
//				System.out.println("Student Not Inserted Successfully.Insertion Operation not Performed");
//			}
//			count_of_student--;
//		}
//		ArrayList<Subject> subjectList = new ArrayList<Subject>();
//		System.out.println("How Many Subjects do you want to add?:");
//		int count_of_subject=myInput.nextInt();
//		myInput.nextLine();
//		while (count_of_subject>0) {
//			Subject subject=new Subject();
//			System.out.println("Enter Subject ID:");
//			int subject_id=myInput.nextInt();
//			myInput.nextLine();
//			System.out.println("Enter Subject Name:");
//			String subject_name = myInput.nextLine();
//			System.out.println("Enter Subject Description");
//			String subject_description = myInput.nextLine();
//			System.out.println("Enter Subject Trainer:");
//			String subject_trainer = myInput.nextLine();
//			subject.setId(subject_id);
//			subject.setName(subject_name);
//			subject.setDescription(subject_description);
//			subject.setTrainer(subject_trainer);
//			subjectList.add(subject);
//			if (controller.insert_subject(subjectList)) {
//				System.out.println("Subjects. Inserted");
//			} else {
//				System.out.println("Subjects not Inserted");
//			}
//			
//			count_of_subject--;
//		}
//		
//		System.out.println("Enter Student Id to modify Subjects:");
//		int student_id_to_modify_subject=myInput.nextInt();
//		myInput.nextLine();
//		Student findStudent = controller.findStudent(student_id_to_modify_subject);
//		List<Subject> fetchAllSubjects = controller.fetchAllSubjects();
//		for (Subject subject : fetchAllSubjects) {
//			System.out.println(subject.getId());
//			System.out.println(subject.getName());
//			System.out.println(subject.getDescription());
//			System.out.println(subject.getTrainer());
//		}
//		System.out.println("Enter subject Id to Insert:");
//		int subject_di_to_assign=myInput.nextInt();
//		myInput.nextLine();
//		for (Subject subject : fetchAllSubjects) {
//			if(subject.getId()==subject_di_to_assign) {
//				findStudent.setSubject(fetchAllSubjects);
//				boolean insert_subject_for_existing_student = controller.insert_subject_for_existing_student(findStudent, subject);
//				if (insert_subject_for_existing_student) {
//					System.out.println("Subject Details Modified");
//				} else {
//					System.out.println("Subject Details not Modified");
//				}
//			} else {
//				System.out.println("Subject Details are wrong.");
//			}
//		}
//		boolean deleteParticularSubject = controller.deleteParticularSubject(3, 44);
//		if (deleteParticularSubject) {
//			System.out.println("Removed");
//		} else {
//			System.out.println("Not Removed");
//		}
		boolean removeSubject = controller.removeSubject(44);
		if (removeSubject) {
			System.out.println("Subject Removed");
		} else {
			System.out.println("Subject is taken by other student.Subject Cannot be Removed");
		}
			
			
			
		
		
		
		
	}

}
