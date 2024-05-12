package com.jsp.sms.view;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.sms.controller.StudentUtility;
import com.jsp.sms.model.Student;





public class StudentView {
	static Scanner myInput=new Scanner(System.in); 
	static StudentUtility studentUtility=new StudentUtility();
	static ArrayList <Student>studentList=new ArrayList<Student>();
	public static void main(String[] args) {
		
		boolean flag=true;
		do {
			System.out.print("1.Insert Student Details\n2.Read Students Details\n3.Update Student Details\n4.Delete Student\n0.Exit\nEnter your choice:");
			byte userChoice=myInput.nextByte();
			switch (userChoice) {
			case 1:
				Student addStudent = studentUtility.addStudent();
				studentList.add(addStudent);
				System.out.println("Student Added Successfully");
				
				
				
				break;
			case 2:
				studentUtility.displayAllStudents(studentList);
				
				break;
			case 3:
				System.out.println("1.Update Name and Age\n2.Update Name\n3.Update Age\nEnter Your Choice:");
				int updated_choice=myInput.nextInt();
				myInput.nextLine();
				switch (updated_choice) {
				case 1:
					studentUtility.update(studentList, updated_choice);
					break;
				case 2:
					studentUtility.update(studentList, updated_choice);
					break;
				case 3:
					studentUtility.update(studentList, updated_choice);
					break;
				default:
					System.out.println("Invalid Choice!!!");
					break;
				}
				break;
			case 4:
				studentUtility.Removestudent(studentList);
				break;
			case 0:
				flag=false;
				System.out.println("Thank you for Taking Service....");				
				break;
			default:
				System.out.println("Invalid Choice!!!");
				break;
			}
			
		} while (flag);
		
		
		

	}

}
