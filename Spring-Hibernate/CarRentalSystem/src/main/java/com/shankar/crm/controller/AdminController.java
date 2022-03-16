package com.shankar.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shankar.crm.model.Bookings;
import com.shankar.crm.model.Customer;
import com.shankar.crm.service.BookingsService;


@Controller
@RequestMapping("admin")
public class AdminController {
	@Autowired
	private BookingsService bookingsService;
	
	@GetMapping("/adminPanel")
	public String customerPanel(Model model) {
		model.addAttribute("customer", new Customer());
		return "admin-panel";
	}
	@GetMapping("/bookingList")
	public String bookingList(Model model) {
		List<Bookings> bookings = bookingsService.getBookings();
		model.addAttribute("bookings", bookings);
		return "list-bookings";
	}
}
