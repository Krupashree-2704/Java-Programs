package com.qsp.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InitializeConn {
	static Connection connection;

	public static Connection create() {
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/smsproject", "postgres", "root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		

	}

}
