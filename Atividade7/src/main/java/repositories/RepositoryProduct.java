package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.ConnectionFactory;
import model.Produto;
import services.ServiceProduct;

public class RepositoryProduct {
	
	private ServiceProduct service;
	private Connection conn;
	
	public RepositoryProduct() {
		this.conn = ConnectionFactory.getConnection();
	}
	
	public List<Produto> encontrar() {
		
		service = new ServiceProduct();
		
		PreparedStatement stmt;
		List<Produto> produtos = new ArrayList<Produto>();
		
		try {
			stmt = conn.prepareStatement("SELECT * FROM tb_product");
			ResultSet result = stmt.executeQuery();
			
			while (result.next()) {
				Produto produto = service.instanciarProduto(result);
				produtos.add(produto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produtos;
	}
	
	
}
