package com.training.project.service;

import java.sql.SQLException;
import java.util.List;

import com.training.project.model.Product;

public interface ProductService {
	
	public int addProduct(Product product) throws SQLException; 
	
	public int updateProduct(Product product) throws SQLException; 
	
	public int deleteProduct(int id) throws SQLException; 
	
	public List<Product> getAllProduct() throws SQLException;
	
	public Product findProduct(int id) throws SQLException;
}
