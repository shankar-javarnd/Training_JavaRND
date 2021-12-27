package com.training.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.project.model.Product;

public interface ProductDao {
	
	public int addProduct(Product product) throws SQLException; 
	
	public int updateProduct(Product product) throws SQLException; 
	
	public int deleteProduct(int id) throws SQLException; 
	
	public Product findProduct(int id) throws SQLException;
	
	public List<Product> getAllProduct() throws SQLException; 

}
