package com.qsp.sms;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.postgresql.Driver;

public class InsertNRecordspstm {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/010-insert-n-records-preparedstatement?user=postgres&password=root");
			String query="insert into student values(?,?)";
			PreparedStatement pstm =connection.prepareStatement(query); 
			boolean flag=true;
			byte ch=1;
			do {
				int id;
				String name;
				System.out.println("ID:");
				id=sc.nextInt();
				sc.nextLine();
				System.out.println("Name:");
				name=sc.nextLine();
						
				pstm.setInt(1, id);
				pstm.setString(2, name);
				pstm.execute();
				System.out.println("Insert more \n0.No\n1.Yes");
				ch=sc.nextByte();
				sc.nextLine();
				if(ch==0)
				{
					flag=false;
				}
				
			} while (flag);
			System.out.println("record inserted");
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Step1:Register Driver
		
		/*try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/010-insert-n-records-preparedstatement", properties);
			String query="insert into student values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			do {
				String name=null;
				int id=0;
				System.out.println("Enter ID:");
				id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name:");
				name=sc.nextLine();
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.execute();
				System.out.println("Do yo want to insert more queries \n0.N0\n1.Yes");
				int ch=sc.nextInt();
				sc.nextLine();
				if (ch==0) {
					break;
				}
				
				
			} while (true);
			System.out.println("Records Inserted");
			connection.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
