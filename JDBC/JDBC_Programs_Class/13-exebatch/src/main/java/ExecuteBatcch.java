import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteBatcch {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/010-insert-n-records-preparedstatement", "postgres", "root");
			Statement statement = connection.createStatement();
			/*statement.addBatch("insert into student values(101,'a')");
			statement.addBatch("insert into student values(102,'b')");
			statement.addBatch("insert into student values(102,'c')");
			int[] batch = statement.executeBatch();
			for (int i = 0; i < batch.length; i++) {
				System.out.println("Rows Affcted"+batch[i]);
			}*/
			statement.addBatch("insert into student values(104,'aa')");
			statement.addBatch("insert into student values(105,'ab')");
			statement.addBatch("inst into student values(106,'ac')");
			int[] batch2 = statement.executeBatch();//syntax error at or near "inst"
			//array=>jitne queries add kiye=>3
			for (int i = 0; i < batch2.length; i++) {
				System.out.println("Rows Affcted"+batch2[i]);
			}
			/*statement.addBatch("insert into student values(104,'aa');insert into student values(105,'ab')");
			statement.addBatch("insert into student values(106,'aba')");
			statement.addBatch("insert into student values(107,'ac')");
			int[] batch = statement.executeBatch();//Too many update results were returned.
			for (int i = 0; i < batch.length; i++) {
				System.out.println("Rows Affcted"+batch[i]);
			}*/
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
