package jdbcExample;

import java.sql.Connection;
import java.sql.Statement;

public class Main {

	static Connection connection = null;
	static Statement statement = null;
	
	public static void main(String[] args) {
		Create.CreateRecord();
		JDBCconnection.accessDB();
		

		
	}

}
