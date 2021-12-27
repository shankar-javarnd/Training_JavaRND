package com.training.project.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.training.project.dao.ProductDao;
import com.training.project.dao.ProductDaoImpl;
import com.training.project.dao.UserDao;
import com.training.project.dao.UserDaoImpl;
import com.training.project.model.Product;

public class ProductServiceImpl implements ProductService {
	ProductDao productDao = new ProductDaoImpl();
	Scanner sc = new Scanner(System.in);

	@Override
	public int addProduct(Product product) throws SQLException {
		return productDao.addProduct(product);
	}

	@Override
	public int updateProduct(Product product) throws SQLException {
		
		return productDao.updateProduct(product);
	}

	@Override
	public int deleteProduct(int id) throws SQLException {
		return productDao.deleteProduct(id);
	}

	@Override
	public List<Product> getAllProduct() throws SQLException {
		return productDao.getAllProduct();
	}

	@Override
	public Product findProduct(int id) throws SQLException {
		return productDao.findProduct(id);
	}

}
