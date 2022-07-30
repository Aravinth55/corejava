package com.chainsys.carrental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.carrental.pojo.CustomerRegistration;
import com.chainsys.carrental.service.CustomerRegistrationService;

@Controller
@RequestMapping("/customer")
public class CustomerRegistrationController {
@Autowired
CustomerRegistrationService crservice;

@GetMapping("/list")
public String getCustomerRegistrations(Model model) {
	List<CustomerRegistration> allCustomers = crservice.getCustomers();
	model.addAttribute("allcustomers",allCustomers);
	return "list-customers";
}
@GetMapping("/addform")
public String showAddForm(Model model) {
	CustomerRegistration theCus = new CustomerRegistration();
	model.addAttribute("addcustomer", theCus);
	return "add-customer-form";
}

@PostMapping("/add")
// We need give from where to read data from the HTTP request and also the
// content type ("application/json")
public String addNewCustomer(@ModelAttribute("addcustomer") CustomerRegistration theCus) {
	crservice.save(theCus);
	return "redirect:/customer/list";
}
@GetMapping("/updateform")
public String showUpdateForm(@RequestParam("cusid") int id, Model model) {
	CustomerRegistration theCus = crservice.findById(id);
	model.addAttribute("updatecustomer", theCus);
	return "update-customer-form";
}
@PostMapping("/updatecus")
public String Updatecustomers(@ModelAttribute("updatecustomer") CustomerRegistration theCus) {
	crservice.save(theCus);
	return "redirect:/customer/list";
}
@GetMapping("/deletecustomer")
public String deleteCustomer(@RequestParam("cusid") int id) {
	CustomerRegistration theCus = crservice.findById(id);
	crservice.deleteById(id);
	return "redirect:/customer/list";
}
}
