package com.qsp.sms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

import org.postgresql.Driver;

public class SelectProc {
static Connection connection=null;
private static String url="jdbc:postgresql://localhost:5432/010-insert-n-records-preparedstatement";
	public static void main(String[] args) {
		try {
			//table mein column names s_id,s_name instead of id and name
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);	
			connection = DriverManager.getConnection(url, properties);
			/*CallableStatement callableStatement = connection.prepareCall("CALL fetch_student(?,?,?);");
			callableStatement.setInt(1, 6);//SET USED to give values to IN parameter
			callableStatement.registerOutParameter(2, Types.NUMERIC);//registerOutParameter(parameter place(in stored-procedure),type of col_name in db) Types=>java.sql
			callableStatement.registerOutParameter(3, Types.VARCHAR);//for character-varying=>VARCHAR
			callableStatement.execute();
			//Now: we have to get the selected values>for numeric:getBigInt(parameter position);for Varchar:getString(parameter position);
			//for numeric=NUMERIC
			System.out.println("Id: "+callableStatement.getBigDecimal(2));//for number=>callableStatement(uske pass value hai)callableStatement.getBigDecimal(paramenter position in procedure)
			System.out.println("Name: "+callableStatement.getString(3));//callableStatement.getString(paramenter position in procedure)*/
			CallableStatement callableStatement = connection.prepareCall("call fetch_student (?,?,?);");
			callableStatement.setInt(1, 2);
			callableStatement.registerOutParameter(2, Types.NUMERIC);
			callableStatement.registerOutParameter(3,Types.VARCHAR);
			callableStatement.execute();
			System.out.println("ID: "+callableStatement.getBigDecimal(2));
			System.out.println("Name: "+callableStatement.getString(3));
			
			
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
