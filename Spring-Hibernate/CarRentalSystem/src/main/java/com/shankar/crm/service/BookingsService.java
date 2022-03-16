package com.shankar.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shankar.crm.model.Bookings;

@Service
public interface BookingsService {
	
	public void saveBookings(Bookings bookings);

	public void deleteBooking(int id);

	public List<Bookings> getBookings();
}
