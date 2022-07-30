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

import com.chainsys.carrental.pojo.CarRegistration;
import com.chainsys.carrental.pojo.CustomerRegistration;
import com.chainsys.carrental.service.CarRegistrationService;

@Controller
@RequestMapping("/car")
public class CarRegistrationController {

	@Autowired
	CarRegistrationService carservice;

	@GetMapping("/list")
	public String getCarRegistrations(Model model) {
		List<CarRegistration> allCars = carservice.getCars();
		model.addAttribute("allcars", allCars);
		return "list-cars";
	}
	@GetMapping("/addform")
	public String showAddForm(Model model) {
		CarRegistration theCar = new CarRegistration();
		model.addAttribute("addcar", theCar);
		return "add-car-form";
	}

	@PostMapping("/add")
	// We need give from where to read data from the HTTP request and also the
	// content type ("application/json")
	public String addNewCar(@ModelAttribute("addcar") CarRegistration theCar) {
		carservice.save(theCar);
		return "redirect:/car/list";
	}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("carid") int id, Model model) {
		CarRegistration theCar = carservice.findById(id);
		model.addAttribute("updatecar", theCar);
		return "update-car-form";
	}
	@PostMapping("/updatecar")
	public String Updatecars(@ModelAttribute("updatecar") CarRegistration theCar) {
		carservice.save(theCar);
		return "redirect:/car/list";
	}
	@GetMapping("/deletecar")
	public String deleteCustomer(@RequestParam("carid") int id) {
		CarRegistration theCar = carservice.findById(id);
		carservice.deleteById(id);
		return "redirect:/car/list";
	}

}
