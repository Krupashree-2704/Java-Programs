package com.qsp.sms.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionBySingleString {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/my_first_jdbc_program?user=postgres&password=root");
			//getConnection=>overloaded method
			//url+username+pass=>together pass
			/*
			 * url ke bad seperator use(?)kiya and then user=postgres(&)seperator joining username with password password=root
			 */
			Statement statement = connection.createStatement();
			//statement.execute("insert into student1 values(3,'Namdev')");
			//statement.execute("update student1 set name='nancy' where id=3");
			//statement.execute("delete from student1 where name='nancy'");
			ResultSet resultSet = statement.executeQuery("select * from student1");
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("id")+" ");
				//System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString("name"));
			}
			connection.close();
			System.out.println("Inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
