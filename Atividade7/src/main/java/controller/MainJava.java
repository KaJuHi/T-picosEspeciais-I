package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.ConnectionFactory;
import model.Produto;

public class MainJava {

	public static void main(String[] args) throws SQLException {

		PreparedStatement stmt;
		Connection conn = ConnectionFactory.getConnection();
		
		stmt = conn.prepareStatement("SELECT * FROM tb_product");
		ResultSet result = stmt.executeQuery();
		
		while(result.next()) {
			
			
			System.out.println("Id: " + result.getLong("id") + " | Nome: " + result.getString("name") +
					" | Descrição: " + result.getString("description") + " | Preço: " + result.getDouble("price") + " | " + result.getString("image_uri"));
		}
		
	}
}
