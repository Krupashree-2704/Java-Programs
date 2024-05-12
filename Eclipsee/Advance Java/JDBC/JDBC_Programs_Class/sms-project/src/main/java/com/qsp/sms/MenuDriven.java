package com.qsp.sms;
import java.util.*;
public class MenuDriven {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String n=sc.nextLine();
		System.out.println("Welcome"+n+"to ABC School Management System");
		while(true) {
			System.out.println("1.Add Student\n2.Read Student Details \n3.Update Student\n4.Delete Student\n5.Exit ");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter your Name:");
				String name=sc.nextLine();
				System.out.println("Enter your City:");
				String city=sc.nextLine();
				System.out.println("Enter your Phone no.:");
				String phone=sc.nextLine();
				Student s=new Student(name,city,phone);
				boolean ir=ExecuteQurr.insertRecord(s);
				if (ir) {
					System.out.println("Records Inserted Successfully");
					System.out.println("Student Record:"+s);
				} else {
					System.out.println("Records Not Inserted !!!!!");
				}
				
				break;
			case 2:
				Student s1=new Student();
				ExecuteQurr.readRecord(s1);
				
				break;
			case 3:
				System.out.println("Enter name:");
				String na=sc.nextLine();
				System.out.println("Enter City:");
				String c=sc.nextLine();
				System.out.println("Enter Phone:");
				String p=sc.nextLine();
				Student s2=new Student(na,c,p);
				boolean ur = ExecuteQurr.updateRecord(s2);
				if (ur) {
					System.out.println("Record Updated Successfully");
					
				} else {
					System.out.println("Record Not Updated!!!");
				}
				
				
				
				break;
			case 4:
				System.out.println("Enter id to Delete Student Details:");
				int id=sc.nextInt();
				sc.nextLine();
				boolean dr=ExecuteQurr.deleteRecord(id);
				if (dr) {
					System.out.println("Deleted Record Successfully");
					
				} else {
					
					System.out.println("Not Deleted Records!!!!");
				}

				break;
			case 5:
				break;


			default:
				break;
			}
			
		}
		
		
	}

	

}
