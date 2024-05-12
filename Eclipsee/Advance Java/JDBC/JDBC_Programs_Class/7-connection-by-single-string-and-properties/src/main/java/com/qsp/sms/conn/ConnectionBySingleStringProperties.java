package com.qsp.sms.conn;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionBySingleStringProperties {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			
			Class.forName("org.postgresql.Driver");
			FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");//arg=>filename along with extension
			//dbconfig.properties =>want under maven project,not in src or any other file
			//In dbconfig.properties=>give details of configuration of database:user=postgres password=root w/o single quotes
			Properties properties = new Properties();
			properties.load(fileInputStream);
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_first_jdbc_program", properties);
			Statement statement = connection.createStatement();
			//statement.execute("delete from student1 where id=1");
			//connection.close();
			/*while(true) {
			System.out.println("Do you want to insert record \n0.No\n1.Yes");
			int a=sc.nextInt();
			
			if(a==1)
			{
				ConnectionBySingleStringProperties.insert();
			}
			else if(a==0) {
				System.exit(0);
				
			}
			else
			{
				System.out.println("Invalid");
			}
			
			}*/
			
			while(true)
			{
				System.out.println("Do you want to Insert Record\n1.Yes\n0. No");
				int ch=sc.nextInt();
				sc.nextLine();
				
				if (ch==1) {
					System.out.println("Enter ID:");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name:");
					String name=sc.nextLine();
					statement.execute("insert into student1(id,name)values("+id+",'"+name+"')");
				} else if(ch==0) {
					connection.close();
					break;
				}
				else
				{
					System.out.println("Invalid Choice!!!!!");
				}
				
			}
			System.out.println("Records Inserted");
			
			/*System.out.println("enter how many records to be inserted");
			int ch=sc.nextInt();
			
			while(ch>0)
			{
				System.out.println("Enter ID:");
				id = sc.nextInt();
				System.out.println("Enter Name:");
				name = sc.next();
				statement.execute("insert into student1(id,name)values("+id+",'"+name+"')");
				ch--;
			}
			System.out.println("Records inserted Successfully");
	
			

			//statement.execute("insert into student1 values(3,'Ajay')");
			//statement.execute("update student1 set id=4 where name='Ajay'");
			//statement.execute("delete from student1 where id=4");*/
			
			//System.out.println("Record Inserted");
			//overloaded method=>present in DriverManager Class
			//in single string=>url of postgresql
			//sc.close();*/
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//FileNotFoundException=>comes when file passed in fileInputStream does not found
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//IO Exception=>comes if
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*public static void insert() throws SQLException
	{
		System.out.println("Enter ID:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_first_jdbc_program", "postgres","root");
		Statement statement = connection.createStatement();
		statement.execute("insert into student1(id,name)values("+id+",'"+name+"')");
	}*/
	
	

}
