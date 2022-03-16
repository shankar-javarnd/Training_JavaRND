package com.shankar.crm.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shankar.crm.model.Customer;

public interface CustomerDao {
	public void registerCustomer(Customer theCustomer);

	public void updateCustomer(int id);

	public void deleteCustomer(int id);

	public Customer getCustomerById(int id);

	public List<Customer> getCustomerByName(String firstName);

	public List<Customer> getCustomers();
}
