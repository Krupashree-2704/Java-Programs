package com.qsp.sms.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {

	public static void main(String[] args) {
		//step 1:Load/register driver
		//class name Class=>present in java.lang
		//in that mtd:Class.forName()=>characteristics =public static method
		
		try {
			Class.forName("org.postgresql.Driver");
			//step 2:eSTABLISH cONNECTION
			//url uniform resourse locator
			//cltrl+1=>creating local var
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_first_jdbc_program", "postgres", "root");
			//Step 3: creation of stmts
			Statement statement = connection.createStatement();
			//Step 4: execution of stmts
			//excuete:arg method
			//arg: SQL Query to be executed
			boolean execute = statement.execute("INSERT INTO student VALUES (3,'AKASH JA')");
			//statement.execute("INSERT INTO Student VALUES (1,'Akash Kangane')");//write :execute sql query
			//step 5: Close Connection
			connection.close();
			if (execute) {
				System.out.println("Data Inserted");
			} else {
				System.out.println("Data Not Inserted");

			}
			System.out.println("Data Inserted");
			//refresh table:play button
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//mention driver which we want=>error>surround with try/catch block
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
