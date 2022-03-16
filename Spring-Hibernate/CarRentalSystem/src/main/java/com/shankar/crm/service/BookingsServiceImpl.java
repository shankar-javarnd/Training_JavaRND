package com.shankar.crm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shankar.crm.dao.BookingsDao;
import com.shankar.crm.model.Bookings;

@Service
public class BookingsServiceImpl implements BookingsService {
	
	@Autowired
	private BookingsDao bookingsDao;

	@Override
	@Transactional
	public void saveBookings(Bookings bookings) {
		bookingsDao.saveBookings(bookings);		
	}

	@Override
	@Transactional
	public void deleteBooking(int id) {
		bookingsDao.deleteBooking(id);
		
	}

	@Override
	@Transactional
	public List<Bookings> getBookings() {
		// TODO Auto-generated method stub
		return bookingsDao.getBookings();				
	}

}
