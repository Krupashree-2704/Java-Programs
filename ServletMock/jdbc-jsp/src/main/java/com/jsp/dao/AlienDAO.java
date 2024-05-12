package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.Driver;

import com.jsp.model.Alien;

public class AlienDAO {
	Connection connection=null;
	public Alien getAlien(int aid)
	{
		Alien alien = new Alien();
		
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/servlet-jsp", "postgres", "root");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from alien where aid="+aid);
			if (resultSet.next()) {
				alien.setAid(resultSet.getInt("aid"));
				alien.setAname(resultSet.getString("aname"));
				alien.setAtech(resultSet.getString(3));
				
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
		
		return alien;
	}
	
	public int createAlien(Alien alien)
	{
		int executeUpdate=0;
		Driver driver = new Driver();
		try {
			DriverManager.registerDriver(driver);
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/servlet-jsp?user=postgres&password=root");
			PreparedStatement prepareStatement = connection.prepareStatement("insert into alien values(?,?,?);");
			prepareStatement.setInt(1, alien.getAid());
			prepareStatement.setString(2, alien.getAname());
			prepareStatement.setString(3, alien.getAtech());
			executeUpdate = prepareStatement.executeUpdate();
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
		
		return executeUpdate;
	}
	
}

