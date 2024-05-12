package com.qsp.gms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.postgresql.Driver;

public class StoP {
	private static String url="jdbc:postgresql://localhost:5432/grocery_database";

	public static void main(String[] args) {
		Connection connection=null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			connection = DriverManager.getConnection(url, properties);
			//CallableStatement callableStatement = connection.prepareCall("CALL groceryemp(2,'Sunaina',5678,'HR');");
			CallableStatement callableStatement = connection.prepareCall("CALL groceryemp(?,?,?,?)");
			callableStatement.setInt(1, 3);
			callableStatement.setString(2, "Madanlal");
			callableStatement.setInt(3, 6565);
			callableStatement.setString(4, "Junior Tester");
			callableStatement.execute();
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
		finally
		{
			if (connection!=null) {
				try {
					connection.close();
					System.out.println("Executed");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	

	}

}
