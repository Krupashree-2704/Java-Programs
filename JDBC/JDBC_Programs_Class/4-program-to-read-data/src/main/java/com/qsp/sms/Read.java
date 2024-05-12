package com.qsp.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

	public static void main(String[] args) {
		try {
			//Load/Register Driver
			Class.forName("org.postgresql.Driver");
			//Establish Connection
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_first_jdbc_program", "postgres", "root");
			//creation of statement
			Statement statement = connection.createStatement();
			//execution of statement
			///resultset=>holds data fetched from the table
			//statement.execute("insert into student1 values(2,'daya')");
			ResultSet resultSet = statement.executeQuery("select * from student1 where id=1");
			while(resultSet.next())
			{
				System.out.print("ID: "+resultSet.getInt(1));
				System.out.println(" Name: "+resultSet.getString("name"));
			}
			connection.close();
			System.out.println("Record Read Complete");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
