package com.shankar.crm.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shankar.crm.model.Bookings;

public interface BookingsDao {
	
	public void saveBookings(Bookings bookings);

	public void deleteBooking(int id);

	public List<Bookings> getBookings();
}
