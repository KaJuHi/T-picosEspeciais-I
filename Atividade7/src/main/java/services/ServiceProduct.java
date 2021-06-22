package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Produto;
import repositories.RepositoryProduct;

public class ServiceProduct {

	RepositoryProduct repository;
	
	public void ServiceProduct() {
		this.repository = new RepositoryProduct();
	}
	
	public List<Produto> listarProdutos() {
		return repository.encontrar();
	}
	
	public Produto instanciarProduto(ResultSet row) throws SQLException {
		
		Produto produto = new Produto();
		
		produto.setId(row.getLong("id"));
		produto.setDescription(row.getString("description"));
		produto.setImageUri(row.getString("image_uri"));
		produto.setName(row.getString("name"));
		produto.setPrice(row.getDouble("price"));
		
		return produto;
	}
}
