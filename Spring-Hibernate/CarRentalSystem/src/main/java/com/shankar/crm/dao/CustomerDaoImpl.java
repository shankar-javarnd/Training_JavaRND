package com.shankar.crm.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.shankar.crm.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void registerCustomer(Customer theCustomer) {
		
		System.out.println(theCustomer.getName());
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		 session.saveOrUpdate(theCustomer);
		// TODO Auto-generated method stub
		 session.getTransaction().commit();

	}
	@Override
	public void updateCustomer(int id) {
	}
	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
		session.getTransaction().commit();


	}

	@Override
	public Customer getCustomerById(int id) {
		Session session = sessionFactory.openSession();
		Customer customer =session.get(Customer.class, id);
		return customer;
	}

	@Override
	public List<Customer> getCustomerByName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Customer> getCustomers() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		 criteria.addOrder(Order.asc("firstName"));
		List<Customer> customers = criteria.list();
		return customers;
	}

}
