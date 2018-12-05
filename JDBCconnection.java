package jdbcExample;

//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;

/////OPENING THE CONNECTION/////
public class JDBCconnection {
	static final String JDBC_Driver = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://192.168.1.126:3306/sakila-db";

	static final String Username = "root";
	static final String Password = "5622";

	public static void accessDB() {
		//Connection connection = null;
		//Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Connecting to database...");
		try {
			Main.connection =
					DriverManager.getConnection(DB_URL, Username, Password);
		} catch (SQLException e) {			
			e.printStackTrace();
		}				

		finally {
			Create.CreateRecord();

		try {
			if (Main.statement != null)
				Main.connection.close();

		} 	catch (SQLException se) { }

		try {
			if (Main.connection != null)
				Main.connection.close();

		} 	catch (SQLException se) {
			se.printStackTrace();
		}
	}
		System.out.println("Connection Closed, Goodbye!");	
	}	
}
