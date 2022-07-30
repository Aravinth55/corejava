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
import com.chainsys.carrental.pojo.CompanyAdmin;
import com.chainsys.carrental.service.CarRentalService;
import com.chainsys.carrental.service.CompanyAdminService;

@Controller
@RequestMapping("/comadmin")
public class CompanyAdminController {

	@Autowired
	CompanyAdminService cmdservice;

	@GetMapping("/list")
	public String getCompanyAdmins(Model model) {
		List<CompanyAdmin> allCmd = cmdservice.getCompanyAdmins();
		model.addAttribute("allcompanyadmins", allCmd);
		return "list-companyadmins";
	}
	@GetMapping("/addform")
	public String showAddForm(Model model) {
		CompanyAdmin theCmd = new CompanyAdmin();
		model.addAttribute("addcompanyadmin", theCmd);
		return "add-companyadmin-form";
	}

	@PostMapping("/add")
	// We need give from where to read data from the HTTP request and also the
	// content type ("application/json")
	public String addNewCompanyAdmin(@ModelAttribute("addcompanyadmin") CompanyAdmin theCmd) {
		cmdservice.save(theCmd);
		return "redirect:/comadmin/list";
	}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("userid") int id, Model model) {
		CompanyAdmin theCren = cmdservice.findById(id);
		model.addAttribute("updatecompanyadmin", theCren);
		return "update-carrental-form";
	}
	@PostMapping("/updatecomadmin")
	public String updateCompanyAdmin(@ModelAttribute("updatecompanyadmin") CompanyAdmin theCmd) {
		cmdservice.save(theCmd);
		return "redirect:/comadmin/list";
	}
	@GetMapping("/deletecomadmin")
	public String deleteCompanyAdmin(@RequestParam("userid") int id) {
		CompanyAdmin theCmd = cmdservice.findById(id);
		cmdservice.deleteById(id);
		return "redirect:/comadmin/list";
	}

}
