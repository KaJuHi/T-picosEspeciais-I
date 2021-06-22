package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection conn;
	
	public static Connection getConnection() {
		if(conn == null) {
			try {
				
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				conn = DriverManager.getConnection("jdbc:mysql://localhost/atividade", "root", "1234");
			
			} catch (SQLException e) {
				throw new RuntimeException(e);
				}
		}
		
		return conn;
	}
}
