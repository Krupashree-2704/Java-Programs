package com.qsp.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.Driver;

public class RegisterDriver {

	public static void main(String[] args) {
		//Step 1:Register driver
		//Load or Register=>Depend upon user
		
		try {
			
			Driver driver = new Driver();//Driver class of org.postgresql
			DriverManager.registerDriver(driver);//it takes driver reference as arg:so make driver object of Driver Class
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/5-register-driver-insert-record", "postgres", "root");
			Statement statement = connection.createStatement();
			//statement.execute("insert into stu values(1,'Aryan');insert into stu values(2,'Kate')");//way to insert multiple record in single execute()
			statement.execute("insert into stu values(3,'Arya');insert into stu values(4,'Kat');insert into stu values(5,'def')");
			connection.close();
			System.out.println("Records Inserted");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
