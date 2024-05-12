package com.jsp.mtm.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.mtm.controller.StudentController;
import com.jsp.mtm.controller.SubjectController;
import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;

public class View {
	static StudentController studentController =new StudentController();
	static SubjectController subjectController=new SubjectController();
	static Scanner myInput=new Scanner(System.in);
	public static List<Student> students;
	public static void main(String[] args) {
		boolean flag=true;
		do {
			System.out.println("1.Insert Subject\n2.Insert Student\nenter your choice:");
			byte userChoice=myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				myInput.close();
				System.out.println("Exited");
				flag=false;
				break;
			case 1:
				System.out.println("Enter how many subjects you want to insert:");
				int no_of_subjects=myInput.nextInt();
				myInput.nextLine();
				
				while (no_of_subjects>0) {
					Subject subject=new Subject();
					System.out.println("Enter subject ID:");
					int subject_id=myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter Subject name:");
					String subject_name=myInput.nextLine();
					System.out.println("Enter Subject description:");
					String subject_description=myInput.nextLine();
					System.out.println("Enter Subject trainer:");
					String subject_trainer=myInput.nextLine();
					subject.setId(subject_id);
					subject.setName(subject_name);
					subject.setDescription(subject_description);
					subject.setTrainer(subject_trainer);
					subjectController.insertSubject(subject);
					no_of_subjects--;
				}
				break;
			case 2:
				System.out.println("Enter how many Students you want to insert:");
				int no_of_students=myInput.nextInt();
				myInput.nextLine();
				while (no_of_students>0) {
					Student student=new Student();
					System.out.println("Enter student id:");
					int student_id=myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter student name:");
					String student_name=myInput.nextLine();
					System.out.println("Enter student email:");
					String student_email=myInput.nextLine();
					System.out.println("enter student mobile number:");
					long student_number=myInput.nextLong();
					myInput.nextLine();
					student.setId(student_id);
					student.setName(student_name);
					student.setEmail(student_email);
					student.setMobile_number(student_number);
					List<Subject> fetchAllSubjects = subjectController.fetchAllSubjects();
					for (Subject subject : fetchAllSubjects) {
						System.out.println("Subject ID"+subject.getId());
						System.out.println("Subject Name"+subject.getName());
						System.out.println("Subject Description"+subject.getDescription());
						System.out.println("Subject Trainer"+subject.getTrainer());
						List<Student> students = subject.getStudents();
					}
					System.out.println("Enter subject id to select");
					int subject_id_to_select=myInput.nextInt();
					Subject findSubject = subjectController.findSubject(subject_id_to_select);
					ArrayList<Subject> subjectList = new ArrayList<Subject>();
					subjectList.add(findSubject);
					student.setSubject(subjectList);
					ArrayList<Student> studentList = new ArrayList<Student>();
					studentList.add(student);
					
					studentController.insertStudent(studentList);
					no_of_students--;
				}
				break;
			case 3:
				List<Subject> fetchAllSubjects = subjectController.fetchAllSubjects();
				for (Subject subject : fetchAllSubjects) {
					students = subject.getStudents();
					subject.setStudents(students);
				}
				
				break;
			default:
				break;
			}
		} while (flag);

	}

}
