package jdbcExample;

public class Main {
		
	public static void main(String[] args) {
		
		JDBCconnection connection = new JDBCconnection();
		connection.accessDB();
		
		JDBCconnection create = new JDBCconnection();
		create.AddRecord();

	}
}
