package dbconnect;

import java.sql.Connection;

public class DbConnect {
	static Connection connection=null;
	
	public static Connection getConnection()
	{
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return connection;
	}
}
