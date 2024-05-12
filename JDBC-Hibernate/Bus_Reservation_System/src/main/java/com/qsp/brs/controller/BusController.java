package com.qsp.brs.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.qsp.brs.model.Bus;

public class BusController {
	static Bus bus=new Bus();
	public int addBus(int bus_no,String bus_name,String bus_start_destination,String bus_end_destination,double bus_fare)
	{
		int rowAffected=0;
		Connection connection=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_registeration_system", "postgres", "root");
			PreparedStatement prepareStatement = connection.prepareStatement("insert into bus values(?,?,?,?,?);");
			prepareStatement.setInt(1, bus_no);
			prepareStatement.setString(2, bus_name);
			prepareStatement.setString(3, bus_start_destination);
			prepareStatement.setString(4, bus_end_destination);
			prepareStatement.setDouble(5, bus_fare);
			
			rowAffected = prepareStatement.executeUpdate();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (connection!=null) {
				try
				{
					connection.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
	}
		
		
		return rowAffected;
	}
	public ResultSet readAllBus()
	{
		Connection connection=null;
		ResultSet resultset=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_registeration_system", "postgres", "root");
			Statement statement = connection.createStatement();
			resultset = statement.executeQuery("select * from bus;");
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
				try
				{
					connection.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		return resultset;
				
	}
	public ResultSet readSpecificBus(int bus_no)
	{
		Connection connection=null;
		ResultSet executeQuery=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_registeration_system", "postgres", "root");
			PreparedStatement prepareStatement = connection.prepareStatement("select * from bus where bus_id=?");
			prepareStatement.setInt(1, bus_no);
			executeQuery = prepareStatement.executeQuery();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if (connection!=null) {
				try
				{
					connection.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		return executeQuery;
		
	}
	public int delete(int bus_id)
	{
		Connection connection =null;
		int rowAffected=0;
//		boolean execute=true;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_registeration_system", "postgres", "root");
			PreparedStatement prepareStatement = connection.prepareStatement("delete from bus where bus_id=?");
			prepareStatement.setInt(1, bus_id);
			rowAffected= prepareStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if (connection!=null) {
				try
				{
					connection.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		return rowAffected;
	}
//	public int busUpdate(byte userChoice,int busid,Object userUpdated)
//	{
//		Connection connection=null;
//		int rowAffected=0;
//		switch (userChoice) {
//		case 1:
//			try {
//				Class.forName("org.postgresql.Driver");
//				connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_registeration_system", "postgres", "root");
//				PreparedStatement prepareStatement = connection.prepareStatement("update bus set bus_name=? where bus_id=?");
//				String busname=(String)userUpdated;
//				prepareStatement.setString(1, busname);
//				prepareStatement.setInt(2, busid);
//				rowAffected= prepareStatement.executeUpdate();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			finally
//			{
//				if (connection!=null) {
//					try
//					{
//						connection.close();
//					}
//					catch(Exception e)
//					{
//						e.printStackTrace();
//					}
//				}
//			}
//			break;
//		case 2:
//			try {
//				Class.forName("org.postgresql.Driver");
//				connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_registeration_system", "postgres", "root");
//				PreparedStatement prepareStatement = connection.prepareStatement("update bus set bus_start_destination=? where bus_id=?");
//				String busstart=(String)userUpdated;
//				prepareStatement.setString(1, busstart);
//				prepareStatement.setInt(2, busid);
//				rowAffected= prepareStatement.executeUpdate();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			finally
//			{
//				if (connection!=null) {
//					try
//					{
//						connection.close();
//					}
//					catch(Exception e)
//					{
//						e.printStackTrace();
//					}
//				}
//			}
//			break;
//		case 3:
//			try {
//				Class.forName("org.postgresql.Driver");
//				connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_registeration_system", "postgres", "root");
//				PreparedStatement prepareStatement = connection.prepareStatement("update bus set bus_end_destination=? where bus_id=?");
//				String busend=(String)userUpdated;
//				prepareStatement.setString(1, busend);
//				prepareStatement.setInt(2, busid);
//				rowAffected= prepareStatement.executeUpdate();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			finally
//			{
//				if (connection!=null) {
//					try
//					{
//						connection.close();
//					}
//					catch(Exception e)
//					{
//						e.printStackTrace();
//					}
//				}
//			}
//			break;
//		case 4:
//			try {
//				Class.forName("org.postgresql.Driver");
//				connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_registeration_system", "postgres", "root");
//				PreparedStatement prepareStatement = connection.prepareStatement("update bus set bus_fare=? where bus_id=?");
//				double busfare=(double)userUpdated;
//				prepareStatement.setDouble(1, busfare);
//				prepareStatement.setInt(2, busid);
//				rowAffected= prepareStatement.executeUpdate();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			finally
//			{
//				if (connection!=null) {
//					try
//					{
//						connection.close();
//					}
//					catch(Exception e)
//					{
//						e.printStackTrace();
//					}
//				}
//			}
//			break;
//
//		default:
//			System.out.println("Please Check the options again....");
//			break;
//		}
//		
//		return rowAffected;
//	}
	public int updateBusName(int busid,String busname)
	{
		Connection connection=null;
		int rowAffected=0;
	
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_registeration_system", "postgres", "root");
			PreparedStatement prepareStatement = connection.prepareStatement("update bus set bus_name=? where bus_id=?");
			prepareStatement.setString(1, busname);
			prepareStatement.setInt(2, busid);
			rowAffected= prepareStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if (connection!=null) {
				try
				{
					connection.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		return rowAffected;
		
	}
	public int updateBusStartDestination(int busid,String busstartdestination)
	{
		Connection connection=null;
		int rowAffected=0;
	
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_registeration_system", "postgres", "root");
			PreparedStatement prepareStatement = connection.prepareStatement("update bus set bus_start_destination=? where bus_id=?");
			prepareStatement.setString(1, busstartdestination);
			prepareStatement.setInt(2, busid);
			rowAffected= prepareStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if (connection!=null) {
				try
				{
					connection.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		return rowAffected;
		
	}
	public int updateBusEndDestination(int busid,String busenddestination)
	{
		Connection connection=null;
		int rowAffected=0;
	
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_registeration_system", "postgres", "root");
			PreparedStatement prepareStatement = connection.prepareStatement("update bus set bus_end_destination=? where bus_id=?");
			prepareStatement.setString(1, busenddestination);
			prepareStatement.setInt(2, busid);
			rowAffected= prepareStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if (connection!=null) {
				try
				{
					connection.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		return rowAffected;
		
	}
	public int updateBusFare(int busid,double busfare)
	{
		Connection connection=null;
		int rowAffected=0;
	
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bus_registeration_system", "postgres", "root");
			PreparedStatement prepareStatement = connection.prepareStatement("update bus set bus_fare=? where bus_id=?");
			prepareStatement.setDouble(1, busfare);
			prepareStatement.setInt(2, busid);
			rowAffected= prepareStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if (connection!=null) {
				try
				{
					connection.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		return rowAffected;
		
	}
}
