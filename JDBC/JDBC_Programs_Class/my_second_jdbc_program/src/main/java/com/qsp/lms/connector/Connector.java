package com.qsp.lms.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {

	public static void main(String[] args) {
		/**
		 * Step 1: Load/Register Driver
		 */
		try {
			Class.forName("org.postgresql.Driver");
			/**
			 * Step 2: Establish Connection
			 */ 
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_second_jdbc_progarm", "postgres", "root");
			/**
			 * Step 3: Cretaion of Statements
			 */
			Statement statement = connection.createStatement();
			/**
			 * Step 4: Execution of Statements
			 */
			statement.execute("INSERT INTO library VALUES (1,'LIBO','NATAL',123)");
			statement.execute("INSERT INTO library VALUES (2,'SINHA','NSP',1234)");
			/**
			 * Step 5: Close Connection
			 */
			connection.close();
			System.out.println("Data Inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
