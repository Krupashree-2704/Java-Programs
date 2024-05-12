package com.jsp.ss.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import javax.persistence.Embeddable;

import com.jsp.ss.controller.Controller;
import com.jsp.ss.model.Student;
import com.jsp.ss.model.Subject;

public class View {
	static Scanner myInput=new Scanner(System.in);
	static Controller controller=new Controller();
	public static void main(String[] args) {
		System.out.println("Welcome...");
		boolean flag=true;
		do {
			System.out.println("1.Insert\n2.Read\n3.Update\n4.Delete\n0.Exit\nEnter your choice:");
			byte userChoice=myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				System.out.println("Exited");
				flag=false;
				break;
			case 1:
				System.out.println("1.Insert New Students and Assign new Subject/Existing subject\n2.Insert new Subject\n3.Insert new Subject for existing Student\nEnter Your choice:");
				byte userChoiceToInsert=myInput.nextByte();
				myInput.nextLine();
				switch (userChoiceToInsert) {
				case 1:
					Student student = new Student();
					List<Subject> subjects_list = new ArrayList<Subject>();
					System.out.println("Please give the student detail...");
					System.out.println("Enter the student id: ");
					int student_id = myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter the student name: ");
					String student_name = myInput.nextLine();
					System.out.println("Enter the student email_id: ");
					String student_email=myInput.nextLine();
					System.out.println("Enter the student contact no: ");
					long student_mobile_number=myInput.nextLong();
					myInput.nextLine();
					student.setId(student_id);
					student.setName(student_name);
					student.setEmail(student_email);
					student.setMobile_number(student_mobile_number);
					System.out.println("How many subject you want to add?");
					int count_of_subject = myInput.nextInt();
					myInput.nextLine();
					while(count_of_subject>0) {
						Subject subject = new Subject();
						System.out.println("Enter the subject id: ");
						int subject_id = myInput.nextInt();
						myInput.nextLine();
					    Subject Subject_Exist=controller.find(subject_id);
					    if(Subject_Exist!=null) {
					    	subjects_list.add(Subject_Exist);
					    	student.setSubject(subjects_list);
					    	if(controller.insert_already_exist_subject(student)) {
					    		System.out.println("Student with respective subject is added in database");
					    	}else {
					    		System.out.println("please try later");
					    	}
					     }else {
					    	System.out.println("Seems like you want to insert new subject\nplease give subject detail");
					    	System.out.println("Enter the subject name: ");
							String subject_name = myInput.nextLine();
							System.out.println("Enter trainer name: ");
							String subject_trainer = myInput.nextLine();
							System.out.println("Give description: ");
							String subject_des=myInput.nextLine();
							subject.setId(subject_id);
							subject.setName(subject_name);
							subject.setTrainer(subject_trainer);
							subject.setDescription(subject_des);
							subjects_list.add(subject);
							student.setSubject(subjects_list);
							if(controller.insert_new_subject(student,subject)) {
								System.out.println("Student with respective subject is added in database");
							}else {
								System.out.println("Please try later, some problem occured in the system.");
							}

					    }
						
					    count_of_subject--;
					}
					break;
				
				case 2:
					ArrayList<Subject> subjectList = new ArrayList<Subject>();
					System.out.println("How Many Subjects do you want to add?:");
					int count_of_subjects=myInput.nextInt();
					myInput.nextLine();
					while (count_of_subjects>0) {
						Subject subject=new Subject();
						System.out.println("Enter Subject ID:");
						int subject_id=myInput.nextInt();
						myInput.nextLine();
						System.out.println("Enter Subject Name:");
						String subject_name = myInput.nextLine();
						System.out.println("Enter Subject Description");
						String subject_description = myInput.nextLine();
						System.out.println("Enter Subject Trainer:");
						String subject_trainer = myInput.nextLine();
						subject.setId(subject_id);
						subject.setName(subject_name);
						subject.setDescription(subject_description);
						subject.setTrainer(subject_trainer);
						subjectList.add(subject);
						if (controller.insert_subject(subjectList)) {
							System.out.println("Subjects. Inserted");
						} else {
							System.out.println("Subjects not Inserted");
						}
						
						count_of_subjects--;
					}
					break;
				case 3:

					System.out.println("Enter Student Id to modify Subjects:");
					int student_id_to_modify_subject=myInput.nextInt();
					myInput.nextLine();
					Student findStudent= controller.findStudent(student_id_to_modify_subject);
					List<Subject> fetchAllSubjects = controller.fetchAllSubjects();
					for (Subject subject : fetchAllSubjects) {
						System.out.println(subject.getId());
						System.out.println(subject.getName());
						System.out.println(subject.getDescription());
						System.out.println(subject.getTrainer());
					}
					System.out.println("Enter subject Id to Insert:");
					int subject_di_to_assign=myInput.nextInt();
					myInput.nextLine();
					Subject find = controller.find(subject_di_to_assign);
					for (Subject subject : fetchAllSubjects) {
						if(subject.getId()==find.getId()) {
							List<Subject> subject2 = findStudent.getSubject();
							subject2.add(subject);
							findStudent.setSubject(subject2);
							boolean insert_subject_for_existing_student = controller.insert_subject_for_existing_student(findStudent, subject);
							if (insert_subject_for_existing_student) {
								System.out.println("Subject Details Modified");
							} else {
								System.out.println("Subject Details not Modified");
							}
						} else {
							System.out.println("Subject Details are wrong.");
						}
					}
					break;
				default:
					System.out.println("Invalid Choice!!!");
					break;
				}
				break;
			case 2:
				System.out.println("1.Read Particular Student and it's Subjects\n2.Read All Students\n3.Read All Subjects\nEnter Your Choice:");
				byte userReadOption=myInput.nextByte();
				myInput.nextLine();
				switch (userReadOption) {
				case 1:
					System.out.println("Enter Student id:");
					int student_id_to_find=myInput.nextInt();
					myInput.nextLine();
					Student findStudent = controller.findStudent(student_id_to_find);
					if (findStudent!=null) {
						System.out.println("Student's ID: "+findStudent.getId());
						System.out.println("Student's Name: "+findStudent.getName());
						System.out.println("Student's Email: "+findStudent.getEmail());
						System.out.println("Student's Mobile Number: "+findStudent.getMobile_number());
						List<Subject> subject = findStudent.getSubject();
						System.out.println("Details of Subjects for Respective Student ID: "+findStudent.getId());
						for (Subject findSubject : subject) {
							System.out.println("Subject ID: "+findSubject.getId());
							System.out.println("Subject Name: "+findSubject.getName());
							System.out.println("Subject Description: "+findSubject.getDescription());
							System.out.println("Subject Trainer: "+findSubject.getTrainer()+"\n");
						}
					} else {
						System.out.println("Student With given Id does not Exists");
					}
					break;
				case 2:
					List<Student> fetchAllStudents = controller.fetchAllStudents();
					for (Student student2 : fetchAllStudents) {
						System.out.println("Student ID:"+student2.getId());
						System.out.println("Student Name: "+student2.getName());
						System.out.println("Student Email: "+student2.getEmail());
						System.out.println("Student Mobile Number: "+student2.getMobile_number());
					}
					break;
				case 3:
					List<Subject> fetchAllSubjects = controller.fetchAllSubjects();
					for (Subject subject2 : fetchAllSubjects) {
						System.out.println("Subject ID:"+subject2.getId());
						System.out.println("Subject Name: "+subject2.getName());
						System.out.println("Subject Description: "+subject2.getDescription());
						System.out.println("Subject Trainer: "+subject2.getTrainer());
					}
					break;

				default:
					System.out.println("Invalid Option choosed by user!!!");
					break;
				}
				break;
			case 3:
				System.out.println("Which Entity do you want to Update: \n1.Student\n2.Subject");
				byte userEntityChoiceToUpdate=myInput.nextByte();
				myInput.nextLine();
				switch (userEntityChoiceToUpdate) {
				case 1:
					System.out.println("In Student what do you want to update:\n1.Student's Email ID\n2.Student's Mobile Number\nEnter your choice:");
					int studentEntityAttributeToUpdate=myInput.nextInt();
					myInput.nextLine();
					switch (studentEntityAttributeToUpdate) {
					case 1:
						System.out.println("Enter Student ID to Update it's Email ID:");
						int student_id_to_update_email=myInput.nextInt();
						myInput.nextLine();
						System.out.println("Enter Email Id to Update");
						Object emailIdToUpdate=myInput.nextLine();
						if (controller.updateStudent(student_id_to_update_email, emailIdToUpdate, studentEntityAttributeToUpdate)) {
							System.out.println("Updated Email Successfully.");
						} else {
							System.out.println("Update Operation not performed. Email Not Updated.");
						}
						break;
					case 2:
						System.out.println("Enter Student ID to Update it's Mobile Number:");
						int student_id_to_update_mobile_number=myInput.nextInt();
						myInput.nextLine();
						System.out.println("Enter Mobile Number to Update");
						Object mobileNumberToUpdate=myInput.nextLong();
						myInput.nextLine();
						if (controller.updateStudent(student_id_to_update_mobile_number, mobileNumberToUpdate, studentEntityAttributeToUpdate)) {
							System.out.println("Updated Mobile Number Successfully.");
						} else {
							System.out.println("Update Operation not performed. Mobile Number Not Updated.");
						}
						break;

					default:
						System.out.println("Invalid Choice!!!");
						break;
					}

					break;
				case 2:
					System.out.println("In Subject what do you want to update:\n1.Subject Description\n2.Subject Trainer\nEnter your choice:");
					byte subjectEntityAttributeToUpdate=myInput.nextByte();
					myInput.nextLine();
					switch (subjectEntityAttributeToUpdate) {
					case 1:
						System.out.println("Enter Subject ID to Update it's Description:");
						int subject_id_to_update_description=myInput.nextInt();
						myInput.nextLine();
						System.out.println("Enter Description to Update");
						Object descriptionToUpdate=myInput.nextLine();
						if (controller.updateSubject(subject_id_to_update_description, descriptionToUpdate, subjectEntityAttributeToUpdate)) {
							System.out.println("Updated Description Successfully.");
						} else {
							System.out.println("Update Operation not performed. Description Not Updated.");
						}
						break;
					case 2:
						System.out.println("Enter Subject ID to Update it's Description:");
						int subject_id_to_update_trainer=myInput.nextInt();
						myInput.nextLine();
						System.out.println("Enter Trainer to Update");
						Object trainerToUpdate=myInput.nextLine();
						if (controller.updateSubject(subject_id_to_update_trainer, trainerToUpdate, subjectEntityAttributeToUpdate)) {
							System.out.println("Updated Trainer details Successfully.");
						} else {
							System.out.println("Update Operation not performed. Trainer details Not Updated.");
						}
						break;

					default:
						System.out.println("Invalid Choice!!!");
						break;
					}
					break;

				default:
					System.out.println("Invalid Choice!!!");
					break;
				}
				break;
			case 4:
				System.out.println("1.Delete Student\n2.Delete Subject\nEnter your Choice:");
				int userChoiceToDelete=myInput.nextInt();
				myInput.nextLine();
				switch (userChoiceToDelete) {
				case 1:
					System.out.println("Enter Student ID to remove:");
					int studentIdToRemove=myInput.nextInt();
					myInput.nextLine();
					if (controller.removeStudent(studentIdToRemove)) {
						System.out.println("Student Deleted Successfully.Delete operation Performed Successfully");
					} else {
						System.out.println("Student Not Deleted Successfully.Delete operation Not Performed Successfully");
					}
					break;
				case 2:
					System.out.println("Enter Student ID to Remove Subject:");
					int student_id_to_remove_subject=myInput.nextInt();
					myInput.nextLine();
					System.out.println("Enter Subject ID to Remove for a Student:");
					int subject_id_to_remove_from_student=myInput.nextInt();
					myInput.nextLine();
					boolean deleteParticularSubject = controller.deleteParticularSubject(student_id_to_remove_subject,subject_id_to_remove_from_student);
					if (deleteParticularSubject) {
						System.out.println("Subject ID"+subject_id_to_remove_from_student+"Removed Successfully");
					} else {
						System.out.println("Subject ID"+subject_id_to_remove_from_student+"Not Removed Successfully");
					}
					break;
				case 3:
					System.out.println("Enter Subject ID to remove:");
					int subjectIdToRemove=myInput.nextInt();
					myInput.nextLine();
					if (controller.removeSubject(subjectIdToRemove)) {
						System.out.println("Subject Deleted Successfully.Delete operation Performed Successfully");;
					} else {
						System.out.println("Subject is taken by other student.Subject Cannot be Removed");
					}
					break;
				default:
					System.out.println("Invalid choice!!!");
					break;
				}
				break;
				
				
			default:
				System.out.println("Invalid Choice!!!Anpad Log");
				break;
			}
		} while (flag);
		
		
		

	}

}
