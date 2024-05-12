package com.qsp.sms.batchexecution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.postgresql.Driver;

public class BatchExecution {

	public static void main(String[] args) {
		// Register,two arg=>Step1,Step2
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			Connection connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/010-insert-n-records-preparedstatement", properties);
			// step3
			Statement statement = connection.createStatement();
			// step 4:
			statement.addBatch("INSERT INTO student VAULES (101,'A');");
			statement.addBatch("INSERT INTO student VAULES (102,'B');");
			statement.addBatch("INSERT INTO student VAULES (103,'C');");
			statement.addBatch("INSERT INTO student VAULES (104,'D');");
			int[] executeBatch = statement.executeBatch();
			for (int i = 0; i < executeBatch.length; i++) {
				System.out.println("Number of rows afftected:" + executeBatch[i]);
			}
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
		}

	}

}
