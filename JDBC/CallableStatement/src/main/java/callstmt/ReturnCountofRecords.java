package callstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class ReturnCountofRecords {
	static Connection connection=null;
	public static void main(String[] args) {
		Driver driver = new Driver();
		try {
			DriverManager.registerDriver(driver);
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/callableStmt", null)
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
