package com.qsp.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.Driver;

public class Registerp {

	public static void main(String[] args) {
		try {
			//Step 1:Register Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			//Step 2:Establish Connection
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/010-insert-n-records-preparedstatement", "postgres", "root");
			//Step 3:Creation of Statement
			Statement statement = connection.createStatement();
			//Step 4:Execution of Statement
			//statement.execute("insert into stu values(6,'Lion');update stu set name='Kunal'where id=2;delete from stu where id=5;insert into stu values(5,'Prabhakar')");
			ResultSet resultSet = statement.executeQuery("select * from student");
			while (resultSet.next()) {
				System.out.print("ID: "+resultSet.getInt("s_id"));
				System.out.println(" "+"Name: "+resultSet.getString("s_name"));
				
			}
			//Step 5:Close Connection
			connection.close();
			System.out.println("All Operations Performed Successfully!!!");
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
