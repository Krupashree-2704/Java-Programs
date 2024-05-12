package com.jsp.insertcrud.driver;

import java.util.Scanner;

import com.jsp.insertcrud.model.Professor;
import com.jsp.insertcrud.utility.Utility;

public class Driver {

	public static void main(String[] args) {
		Professor professor = new Professor();
		Scanner myInput=new Scanner(System.in);
		boolean flag=true;
		while (flag) {
			System.out.print("Enter ID:");
			int id=myInput.nextInt();
			professor.setPid(id);
			System.out.print("Enter Name:");
			String name=myInput.next();
			professor.setPname(name);
			System.out.print("Enter Subject:");
			String sub=myInput.next();
			professor.setPsub(sub);
			System.out.print("Enter Salary:");
			double sal=myInput.nextDouble();
			professor.setPsal(sal);
			System.out.print("Enter City:");
			String city=myInput.next();
			professor.setPcity(city);
			Utility.transaction.begin();
			Utility.entityManager.persist(professor);
			Utility.transaction.commit();
			System.out.println("Do you want to insert more data");
			byte choice=myInput.nextByte();
			if (choice==0) {
				flag=false;
			}
		}
		
		
		
		
		
		
		
		myInput.close();
		System.out.println("Insert Operation Done Successfully!!!!");

	}

}
