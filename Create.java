package jdbcExample;

import java.sql.SQLException;

public class Create {

	public static void CreateRecord() {
	
	///////CREATE/////////
			System.out.println("Inserting a record into the table...");
			try {
				Main.statement = Main.connection.createStatement();
			} catch (SQLException e) {
				System.out.println("Couldn't create statement");
				e.printStackTrace();
			
			}
			String SQL = "INSERT INTO actor" + "VALUES(Barry, Stein)";

			try {
				Main.statement.executeUpdate(SQL);
			} catch (SQLException e) {
				System.out.println("Failed to create record");
				e.printStackTrace();
			}
			System.out.println("Inserted record into the table...");
		}

}
