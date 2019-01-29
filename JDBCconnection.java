package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/////OPENING THE CONNECTION/////
public class JDBCconnection {

	static Connection connection = null;
	static Statement statement = null;

	static final String JDBC_Driver = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/sakila";
	static final String Username = "root";
	static final String Password = "";

	public void accessDB() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Connecting to database...");
		try {
			connection =
					DriverManager.getConnection(DB_URL, Username, Password);
		} catch (SQLException e) {			
			e.printStackTrace();
		}				
	}	
	public void AddRecord() {

		///////CREATE/////////

		System.out.println("Inserting a record into the table...");
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			System.out.println("Couldn't create statement");
			e.printStackTrace();

		}
		String SQL = "INSERT INTO actor (first_name, last_name) VALUES ('BARRY', 'STEIN')";

		try {
			statement.executeUpdate(SQL);

		} catch (SQLException e) {
			System.out.println("Failed to create record");
			e.printStackTrace();				
		}
		System.out.println("Inserted record into the table.");

		////connection close after inserting record////
		try {
			if (statement != null)
				connection.close();

		} 	catch (SQLException se) { }

		try {
			if (connection != null)
				connection.close();

		} 	catch (SQLException se) {
			se.printStackTrace();
		}

		System.out.println("Connection Closed, Goodbye!");
	}

}

