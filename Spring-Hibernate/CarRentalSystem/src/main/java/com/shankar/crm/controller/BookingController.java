package com.shankar.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shankar.crm.model.Bookings;
import com.shankar.crm.service.BookingsService;

@Controller
@RequestMapping("booking")
public class BookingController {
	
	@Autowired
	private BookingsService bookingService;
	
	@GetMapping("bookingForm")
	public String bookingForm(Model model) {
		model.addAttribute("bookings", new Bookings());
		return "booking-form";
	}
	
	@PostMapping("saveBooking")
	public String saveBooking(Model model,@ModelAttribute("bookings")Bookings bookings) {
		bookingService.saveBookings(bookings);
		return "customer-panel";
	}
}

