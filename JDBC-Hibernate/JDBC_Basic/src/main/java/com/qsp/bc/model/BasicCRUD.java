package com.qsp.bc.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import org.postgresql.Driver;
//import java.sql.Statement;

public class BasicCRUD {
	public static void main(String[] args) {
		Scanner myInput=new Scanner(System.in);
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/basiccrud", properties);
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into studentclass values('sunio',6);");
//			Class.forName("org.postgresql.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/basiccrud", "postgres", "root");
//			Statement statement = connection.createStatement();
//			ResultSet executeQuery = statement.executeQuery("select * from studentclass");
//			while (executeQuery.next()) {
//				System.out.println(executeQuery.getString(1));
//				System.out.println(executeQuery.getInt("rollno"));
//			}
//			PreparedStatement preparedStatement = connection.prepareStatement("insert into studentclass values(?,?)");
//			boolean flag=true;
//			while (flag) {
//				System.out.println("Enter Name :");
//				String name=myInput.nextLine();
//				System.out.println("Enter Rollno :");
//				int rollno=myInput.nextInt();
//				myInput.nextLine();
//				preparedStatement.setString(1, name);
//				preparedStatement.setInt(2, rollno);
//				boolean execute = preparedStatement.execute();
//				System.out.println("Do you want to continue Y/N");
//				String resp=myInput.nextLine();
//				if ((resp.equalsIgnoreCase("Y"))) {
//					flag=true;
//				}
//				else
//				{
//					flag=false;
//				}
//			}
//					ResultSet executeQuery = preparedStatement.executeQuery();
////					ResultSet resultSet = preparedStatement.getResultSet();
//					while (executeQuery.next()) {
//						System.out.println(executeQuery.getString(1));
//						System.out.println(executeQuery.getInt("rollno"));
//					}
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
		  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
}
}
