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

import com.chainsys.carrental.pojo.CarRental;
import com.chainsys.carrental.service.CarRentalService;

@Controller
@RequestMapping("/carrental")
public class CarRentalController {

	@Autowired
	CarRentalService creservice;

	@GetMapping("/list")
	public String getCarRentals(Model model) {
		List<CarRental> allCren = creservice.getCarRentals();
		model.addAttribute("allcarrentals", allCren);
		return "list-carrentals";
	}
	@GetMapping("/addform")
	public String showAddForm(Model model) {
		CarRental theCren = new CarRental();
		model.addAttribute("addcarrental", theCren);
		return "add-carrental-form";
	}

	@PostMapping("/add")
	// We need give from where to read data from the HTTP request and also the
	// content type ("application/json")
	public String addNewCarRental(@ModelAttribute("addcarrental") CarRental theCren) {
		creservice.save(theCren);
		return "redirect:/carrental/list";
	}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("carregno") int id, Model model) {
		CarRental theCren = creservice.findById(id);
		model.addAttribute("updatecarrental", theCren);
		return "update-carrental-form";
	}
	@PostMapping("/updatecarren")
	public String updateCarRentals(@ModelAttribute("updatecarrental") CarRental theCren) {
		creservice.save(theCren);
		return "redirect:/carrental/list";
	}
	@GetMapping("/deletecarren")
	public String deleteCarRental(@RequestParam("carregno") int id) {
		CarRental theCren = creservice.findById(id);
		creservice.deleteById(id);
		return "redirect:/carrental/list";
	}

}
