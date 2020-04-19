package com.practice.express.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.express.entity.Customer;
import com.practice.express.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String listCustomers(Model model) {

		// get the customers from dao
		List<Customer> customers = customerService.getCustomers();
		System.out.println("Customer************ :" + customers);

		// add the customer to model
		model.addAttribute("customers", customers);

		return "list-customers";
	}
}
