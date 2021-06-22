package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static Connection connection;
	
	/*Singleton*/
	public static Connection getConnection() {
		
		if(connection == null) {
		
			try {
				
				//necess�rio para aplicac�es web
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				
				connection = DriverManager.getConnection("jdbc:mysql://localhost/if_delivery", "root", "1234");
				
			
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		
		} 
			
		return connection;
		

	}
	
}
