package com.practice.express;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.express.dao.CustomerDAO;
import com.practice.express.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping("/list")
	public String listCustomers(Model model) {

		// get the customers from dao
		List<Customer> customers = customerDAO.getCustomers();
		System.out.println("Customer************ :" + customers);

		// add the customer to model
		model.addAttribute("customers", customers);

		return "list-customers";
	}
}
