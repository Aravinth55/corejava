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

import com.chainsys.carrental.pojo.ReturnCar;
import com.chainsys.carrental.service.ReturnCarService;

@Controller
@RequestMapping("/returncar")
public class ReturnCarController {

	@Autowired
	ReturnCarService recervice;

	@GetMapping("/list")
	public String getReturnCar(Model model) {
		List<ReturnCar> allCret = recervice.getReturnCars();
		model.addAttribute("allreturncars", allCret);
		return "list-returncars";
	}
	@GetMapping("/addform")
	public String showAddForm(Model model) {
		ReturnCar theCret = new ReturnCar();
		model.addAttribute("addreturncar", theCret);
		return "add-returncar-form";
	}

	@PostMapping("/add")
	// We need give from where to read data from the HTTP request and also the
	// content type ("application/json")
	public String addNewReturnCar(@ModelAttribute("addreturncar") ReturnCar theCret) {
		recervice.save(theCret);
		return "redirect:/returncar/list";
	}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("carregno") int id, Model model) {
		ReturnCar theCren = recervice.findById(id);
		model.addAttribute("updatecarrental", theCren);
		return "update-returncar-form";
	}
	@PostMapping("/updatecarren")
	public String Updatereturncars(@ModelAttribute("updatecarrental") ReturnCar theCret) {
		recervice.save(theCret);
		return "redirect:/returncar/list";
	}
	@GetMapping("/deletecarren")
	public String deleteReturnCar(@RequestParam("carregno") int id) {
		ReturnCar theCret= recervice.findById(id);
		recervice.deleteById(id);
		return "redirect:/returncar/list";
	}

}
