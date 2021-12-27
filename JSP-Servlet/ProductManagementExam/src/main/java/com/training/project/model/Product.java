package com.training.project.model;

public class Product {
	
	private int pid;
	private String pName;
	private double price;
	private int quantity;
	private String vendor;
	private int warranty;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String pName, double price, int quantity, String vendor, int warranty) {
		super();
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
		this.vendor = vendor;
		this.warranty = warranty;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
}
