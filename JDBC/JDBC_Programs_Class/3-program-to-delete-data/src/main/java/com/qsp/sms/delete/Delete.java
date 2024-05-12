package com.qsp.sms.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		try {
			//step1
			Class.forName("org.postgresql.Driver");
			//step2
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_first_jdbc_program", "postgres", "root");
			//step3
			Statement statement = connection.createStatement();
			//step 4
			statement.execute("DELETE from student1 WHERE id=2");
			//step5
			connection.close();
			System.out.println("Deleted!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
