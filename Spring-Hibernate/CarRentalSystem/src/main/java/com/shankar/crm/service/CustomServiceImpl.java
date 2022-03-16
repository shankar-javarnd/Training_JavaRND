package com.shankar.crm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shankar.crm.dao.CustomerDao;
import com.shankar.crm.model.Customer;

@Service
public class CustomServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public void registerCustomer(Customer theCustomer) {
		customerDao.registerCustomer(theCustomer);

	}

	@Override
	@Transactional
	public void updateCustomer(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);

	}

	@Override
	@Transactional
	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

	@Override
	@Transactional
	public List<Customer> getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

}
