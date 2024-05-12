package com.qsp.sms.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/010-insert-n-records-preparedstatement","postgres","root");
			Statement statement = connection.createStatement();
			boolean execute = statement.execute("select * from student where id in(101,102)");
			//execute=>has true=>if records are there in resultset
			//=>has false=>if records are not there in resultset
			//statement.executeQuerry=>directly resultset  milta hai
			//statement.getResultSet()=>it first check d/b(resultset)mein values hai to hi resultset se values retrieve hoge
			if (execute) {
				ResultSet resultSet = statement.getResultSet();
				while(resultSet.next())
				{
					System.out.println("ID: "+resultSet.getInt(1));
					System.out.println("Name:"+resultSet.getString(2));
					//System.out.println("Name:"+resultSet.getString(3));
					//System.out.println("Name:"+resultSet.getString(4));
				}
				System.out.println("Records Exists");
			} else {
				System.out.println("Records Does not exists");
			}
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
