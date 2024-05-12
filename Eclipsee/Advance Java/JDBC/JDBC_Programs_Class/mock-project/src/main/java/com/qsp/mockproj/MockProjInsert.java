package com.qsp.mockproj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MockProjInsert {
	static Connection connection=null;
	public static void main(String[] args) {
		try {
			Scanner myInput=new Scanner(System.in);
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mock", "postgres", "root");
			String query="INSERT INTO medical VALUES(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			System.out.println("Enter Medicine id:");
			int id=myInput.nextInt();
			myInput.nextLine();
			System.out.println("Enter Medicine name:");
			String name=myInput.nextLine();
			myInput.close();
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally
		{
			if (connection!=null) {
				try {
					connection.close();
					System.out.println("Record Inserted Successfully");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}

	}

}
