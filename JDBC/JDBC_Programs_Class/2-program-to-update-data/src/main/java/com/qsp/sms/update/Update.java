package com.qsp.sms.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			//DriverManager=>helper class  to get connection
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_first_jdbc_program", "postgres", "root");
			Statement statement = connection.createStatement();
			//statement.execute("INSERT INTO student1 VALUES (1,'AKASH K')");
			//UPDATING DATA WITH THE HELP OF ID =>UPDATE TABLENAME SET COL_NAME =NEW VALUE WHERE<CONDITION>
			statement.execute("update student1 set Name='Khushaal' WHERE Id=2");
			connection.close();
			System.out.println("Record Updated");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
