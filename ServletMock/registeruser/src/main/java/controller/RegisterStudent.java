package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.postgresql.Driver;

import entity.CollStudent;

public class RegisterStudent {
	public static int insertStudent(CollStudent coll)
	{
		Connection conn=null;
		int rowAffected = 0;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/college-mgmt-system","postgres","root" );
			PreparedStatement prepareStatement = conn.prepareStatement("insert into collstudent(student_name,student_email,student_gender,student_location,student_stream,student_contact)values(?,?,?,?,?,?);");
			prepareStatement.setString(1, coll.getName());
			prepareStatement.setString(2, coll.getEmail());
			prepareStatement.setString(3, coll.getGender());
			prepareStatement.setString(4, coll.getLocation());
			prepareStatement.setString(5, coll.getStream());
			prepareStatement.setLong(6, coll.getContact());
			
			rowAffected = prepareStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			if(conn!=null)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return rowAffected;
	}
	
		
	

}
