package com.qsp.practicejdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import org.postgresql.Driver;

public class JDBCPractice {
	static Connection connection3=null;
	static Scanner myInput=new Scanner(System.in);

	public static void main(String[] args) {
		
		//step1: Load /Register Driver
//		try {
////			Load Driver
////			Class.forName("org.postgresql.Driver");
////		} catch (ClassNotFoundException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		Register Driver
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//Step 2:Esatblish Connection:passing 3 string argument
//			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", "postgres", "root");
			//Step 2:Esatblish Connection:passing Single String Argument
//			Connection connection2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice?user=postgres&password=root");
			//Step 2:Esatblish Connection:passing Single String Argument and Properties object
			FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			connection3 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", properties);
			//Step 3:Creation of statement:using createStatement()
			Statement statement = connection3.createStatement();
			//Step 4:Execution of statement:using execute()
//			statement.execute("update student set id=1 where name='Krupashree'");
			//addBatch()
//			statement.addBatch("INSERT INTO student VALUES(3,'Vidhi')");
//			statement.addBatch("INSERT INTO student VALUES(4,'Prabhakar')");
//			statement.addBatch("INSERT INTO student VALUES(5,'Harshada')");
			//executeBatch()
//			int[] executeBatch = statement.executeBatch();
//			for (int i = 0; i < executeBatch.length; i++) {
//				System.out.println(executeBatch[i]);
//			}
//			ResultSet resultSet = statement.executeQuery("SELECT * FROM student ");
//			while (resultSet.next()) {
//				System.out.println(resultSet.getInt(1));
//				System.out.println(resultSet.getString("name"));
//			}
//			//SELECT QUERY BY UISNG execute()
//			boolean execute = statement.execute("SELECT * FROM student where id in(2,3,4)");
//			if (execute) {
//				ResultSet resultSet = statement.getResultSet();
//				while (resultSet.next()) {
//					System.out.println(resultSet.getInt("id"));
//					System.out.println(resultSet.getString(2));
//				}
//			} else {
//				System.out.println("Resultset cannot be fetched");
//
//			}
			
			
			//Step 3:Creation of statement:using prepareStatement()
//			PreparedStatement prepareStatement = connection3.prepareStatement("UPDATE student set name=? where id=?");//? position of delimiter
//			System.out.println("Enter id: ");
//			int id=myInput.nextInt();
//			myInput.nextLine();
//			System.out.println("Enter name: ");
//			String name=myInput.nextLine();
//			prepareStatement.setString(1, name);
//			prepareStatement.setInt(2, id);
			
			//Step4:Execution of statement:using executeUpdate()
//			prepareStatement.executeUpdate();
			//ExecuteBatch by using prepareStatement()
//			PreparedStatement preparedStatement = connection3.prepareStatement("INSERT INTO student VALUES(?,?)");
//			System.out.println("How many elements enetering:?");
//			int size=myInput.nextInt();
//			myInput.nextLine();
//			int []id=new int[size];
//			String [] name=new String[size];
//			for (int i = 0; i < name.length; i++) {
//				System.out.println("Enter id:");
//				id[i]=myInput.nextInt();
//				myInput.nextLine();
//				System.out.println("Enter name:");
//				name[i]= myInput.nextLine();
//				preparedStatement.setInt(1, id[i]);
//				preparedStatement.setString(2, name[i]);
//				preparedStatement.addBatch();
//				}
//			int[] executeBatch = preparedStatement.executeBatch();
//			for (int i = 0; i < executeBatch.length; i++) {
//				System.out.println(executeBatch[i]);
//			}
			
			CallableStatement callableStatement = connection3.prepareCall("call stu_proc(?,?)");
			callableStatement.setInt(1, 10);
			callableStatement.setString(2, "Nayan");
			callableStatement.execute();
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Step5: Close Connection
		finally
		{
			if (connection3!=null) {
				try {
					connection3.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
}
