package com.qsp.sms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;

import org.postgresql.Driver;

public class PrepareStatementExecuteUpdate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection connection=null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
		    connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/15-prepare-statement-using-batch-execution", properties);
		    System.out.println("Enter how many elements have to be inserted");
		    int size=sc.nextInt();
		    int[]id=new int[size];
		    String[]name=new String[size];
		    String sql="insert into student (id,name) values(?,?)";
		    PreparedStatement prepareStatement = connection.prepareStatement(sql);
		    for (int i = 0; i < name.length; i++) {
		    	System.out.println("Enter id:");
		    	id[i]=sc.nextInt();
		    	sc.nextLine();
		    	System.out.println("Enter name:");
		    	name[i]=sc.nextLine();
		    	prepareStatement.setInt(1, id[i]);
		    	prepareStatement.setString(2, name[i]);
		    	prepareStatement.addBatch();//values set
			}
		    int[] batch = prepareStatement.executeBatch();
		   
		    for (int j = 0; j < batch.length; j++) {
		    	  System.out.println(batch[j]+"Rows Affected");
			}
		
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
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}

}
