package com.qsp.sms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.postgresql.Driver;

public class InsertRecordPreparedStatement {

	public static void main(String[] args) {
		try {
			//Step 1:Register Driver
		
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			//Step 2:Establish Connection:two arg methods=>String and properties
			FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_first_jdbc_program", properties);
			//Step 3:Create Statement
			String query="insert into student1 values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, 100);
			preparedStatement.setString(2, "Michael");
			//step 4:Execution of Statement
			preparedStatement.execute();
			//Step 5:Close Connection
			connection.close();
			System.out.println("Inserted!!!");
			/*String query="insert into student1 values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			//values set to delimiters(?)
			preparedStatement.setInt(1, 101);
			preparedStatement.setString(2, "Nisha");
			//execute prepared statement
			preparedStatement.execute();
			//close conn
			connection.close();
			System.out.println("Operation Performed");*/
			
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

	}

}
