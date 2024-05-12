package com.qsp.sms;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.postgresql.Driver;

public class InsertNRecords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Driver driver = new Driver();
		try {
			DriverManager.registerDriver(driver);
			FileInputStream fileInputStream= new FileInputStream("dbconfig.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_first_jdbc_program", properties);
			Statement statement = connection.createStatement();
			boolean flag=true;
			byte loop=1;
			String name=null;
			int id=0;
			do {
				int ch;
				System.out.println("1.Insert\n2.Update\n3.Delete\n4.Read\nEnter Your choice");
				ch=sc.nextInt();
				sc.nextLine();
				switch (ch) {
				case 1:
					System.out.println("Enter ID: ");
					id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name:");
					name=sc.nextLine();
					statement.execute("insert into student1 values("+id+",'"+name+"')");

					break;
				case 2:
					System.out.println("Enter ID to be updated: ");
					id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name to be updated:");
					name=sc.nextLine();
					statement.execute("update student1 set id="+id+" where name='"+name+"'");

					break;
				case 3:
					System.out.println("Enter ID to be deleted: ");
					id=sc.nextInt();
					sc.nextLine();
					statement.execute("delete from student1 where id="+id+" ");

					break;
				case 4:
					ResultSet resultSet = statement.executeQuery("select * from student1 ");
					System.out.println("ID\tName");
					while(resultSet.next())
					{
						System.out.print(resultSet.getInt(1));
						System.out.println("\t"+resultSet.getString(2));
					}

					break;

				default:
					break;
				}
				
				System.out.println("Do you want to Perform more operations\n1.Yes\n0.No");
				loop=sc.nextByte();
				if (loop==0) {
					flag=false;
					
				} 
				
			} while (flag);
			
			connection.close();
			
			/*statement.execute("insert into student1 values(50,'jack')");
			ResultSet resultSet = statement.executeQuery("select * from student1");
			System.out.println("ID\tName");
			while(resultSet.next())
			{
				System.out.print(resultSet.getInt(1)+"\t");
				System.out.println(resultSet.getString(2));
			}
			
			connection.close();
			System.out.println("Record Inserted");
			while(true)
			
			{
				System.out.println("Do you want to insert record\n0.No\n1.Yes");
				int ch=sc.nextInt();
				sc.nextLine();
				if (ch==0) {
					connection.close();
					System.exit(0);
				} else if(ch==1){
					System.out.println("Name:");
					String name=sc.nextLine();
					System.out.println("ID");
					int id=sc.nextInt();
					sc.nextLine();
					statement.execute("insert into student1 values ("+id+",'"+name+"')");
					
				}
				else
				{
					System.out.println("Invalid");
			}
				System.out.println("record inserted");
			
		}*/
			
		}
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
