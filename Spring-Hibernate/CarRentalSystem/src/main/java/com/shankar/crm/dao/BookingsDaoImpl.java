package com.shankar.crm.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shankar.crm.model.Bookings;
import com.shankar.crm.model.Customer;
@Repository
public class BookingsDaoImpl implements BookingsDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveBookings(Bookings bookings) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		 session.saveOrUpdate(bookings);
		 session.getTransaction().commit();		
	}

	@Override
	public void deleteBooking(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Bookings bookings = session.get(Bookings.class, id);
		session.delete(bookings);
		session.getTransaction().commit();
		
	}

	@Override
	public List<Bookings> getBookings() {
		
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Bookings.class);
		 criteria.addOrder(Order.asc("name"));
		List<Bookings> bookings = criteria.list();
		return bookings;
		
	}

}
