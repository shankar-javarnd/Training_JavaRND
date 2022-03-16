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

import com.shankar.crm.model.Customer;
import com.shankar.crm.service.CustomerService;



@Controller
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@GetMapping("list")
	public String getCustomers(Model model) {
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "list-customers";
	}
	@GetMapping("/addCustomerForm")
	public String addCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	@PostMapping("/saveCustomer")
	public String saveCustomer(Model model,@ModelAttribute("customer")Customer customer) {
		customerService.registerCustomer(customer);
		return "redirect:/customer/list";
	}
	@GetMapping("showFormForUpdate")
	public String showFormForUpdate(Model model, @RequestParam("id") int id) {
		System.out.println(id);
		Customer customer = customerService.getCustomerById(id);
		model.addAttribute("customer", customer);
		return "customer-form";
	}
	@GetMapping("delete")
	public String deleteCustomer(@RequestParam("id") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	}
	@GetMapping("/customerPanel")
	public String customerPanel(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-panel";
	}
	@GetMapping("/customerProfile")
	public String customerProfile(Model model, @RequestParam("id") int id) {
		Customer customer = customerService.getCustomerById(id);
		model.addAttribute("customer", new Customer());
		return "customer-profile";
	}
}

