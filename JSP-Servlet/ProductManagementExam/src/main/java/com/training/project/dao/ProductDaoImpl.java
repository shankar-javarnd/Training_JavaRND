package com.training.project.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.project.db.DBUtility;
import com.training.project.model.Product;

public class ProductDaoImpl implements ProductDao {
		
	DBUtility db = new DBUtility();
	PreparedStatement pst;
	ResultSet rs;
	
	@Override
	public Product findProduct(int id) throws SQLException {

		String sql = "select * from product where pid=?";
		pst = db.createPST(sql);
		pst.setInt(1, id);
		rs = db.query(pst);
		if (rs.next()) {
			
			Product product = new Product();
			product.setPid(rs.getInt("pid"));
			product.setpName(rs.getString("pName"));
			product.setPrice(rs.getInt("price"));
			product.setQuantity(rs.getInt("quantity"));
			product.setVendor(rs.getString("vendor"));
			product.setWarranty(rs.getInt("warranty"));
			return product;
			
		}
		return null;
	}
	
	@Override
	public int addProduct(Product product) throws SQLException {
		String sql = "insert into product(pName,price,quantity,vendor,warranty)values(?,?,?,?,?)";
		pst = db.createPST(sql);
		pst.setString(1, product.getpName());
		pst.setDouble(2, product.getPrice());
		pst.setInt(3, product.getQuantity());
		pst.setString(4, product.getVendor());
		pst.setInt(5,product.getWarranty());
		return db.update(pst);
	}
	@Override
	public int updateProduct(Product product) throws SQLException {
		
		String sql = "update product set pName=?,price=?,vendor=?,quantity=?,warranty=? where pid=?";
		pst = db.createPST(sql);
		pst.setString(1, product.getpName());
		pst.setDouble(2, product.getPrice());
		pst.setString(3, product.getVendor());
		pst.setInt(4, product.getQuantity());
		pst.setInt(5, product.getWarranty());
		pst.setInt(6, product.getPid());
		return db.update(pst);
	}
	@Override
	public int deleteProduct(int id) throws SQLException {

		String sql = "delete from product where pid=?";
		pst = db.createPST(sql);
		pst.setInt(1, id);
		return db.update(pst);
	}
	@Override
	public List<Product> getAllProduct() throws SQLException {
		
		String sql = "select * from product";
		pst = db.createPST(sql);
		//pst.setString(1, userName);
		rs = db.query(pst);
		List<Product> productList = new ArrayList<Product>();
		while (rs.next()) {
			
			Product product = new Product();
			product.setPid(rs.getInt("pid"));
			product.setpName(rs.getString("pName"));
			product.setPrice(rs.getDouble("price"));
			product.setQuantity(rs.getInt("quantity"));
			product.setVendor(rs.getString("vendor"));
			product.setWarranty(rs.getInt("warranty"));
			productList.add(product);
		  
	    }
		return productList;
	}
	
	
	
}
