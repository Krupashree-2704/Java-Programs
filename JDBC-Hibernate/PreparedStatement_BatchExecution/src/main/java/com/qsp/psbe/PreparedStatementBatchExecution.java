package com.qsp.psbe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementBatchExecution {
	static Connection connection=null;
	static Scanner myInput=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/preparedstatementaddbatch?user=postgres&password=root");
			String query="insert into ps values(?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			boolean flag=true;
			while (flag) {
				System.out.println("Enter Roll no:");
				int rollno=myInput.nextInt();
				myInput.nextLine();
				System.out.println("Enter Name:");
				String name=myInput.nextLine();
				prepareStatement.setInt(1, rollno);
				prepareStatement.setString(2, name);
				prepareStatement.addBatch();
				System.out.println("Do you want to add more:Y/N");
				String decide=myInput.nextLine();
				if (decide.equalsIgnoreCase("N")) {
					flag=false;
				}
			}
			int[] executeBatch = prepareStatement.executeBatch();
			for (int i = 0; i < executeBatch.length; i++) {
				System.out.println(executeBatch[i]);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
