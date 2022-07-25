package com.chainsys.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.springmvc.dao.DoctorRepository;
import com.chainsys.springmvc.pojo.Appointment;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;
import com.chainsys.springmvc.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	DoctorService drservice;

	@GetMapping("/list")
	public String getDoctors(Model model) {
		List<Doctor> allDoctors = drservice.getDoctors();
		model.addAttribute("alldoctors", allDoctors);
		return "list-doctors";
	}

	@GetMapping("/addform")
	public String showAddForm(Model model) {
		Doctor theDoc = new Doctor();
		model.addAttribute("adddoctor", theDoc);
		return "add-doctor-form";
	}

	@PostMapping("/add")
	// We need give from where to read data from the HTTP request and also the
	// content type ("application/json")
	public String addNewDoctor(@ModelAttribute("adddoctor") Doctor theDoc) {
		drservice.save(theDoc);
		return "redirect:/doctor/list";
	}

	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("docid") int id, Model model) {
		Doctor theDoc = drservice.findById(id);
		model.addAttribute("updatedoctor", theDoc);
		return "update-doctor-form";
	}

	@PostMapping("/updatedoc")
	public String UpdateDoctors(@ModelAttribute("updatedoctor") Doctor theDoc) {
		drservice.save(theDoc);
		return "redirect:/doctor/list";
	}

	@GetMapping("/deletedoctor")
	public String deleteDoctor(@RequestParam("docid") int id) {
		Doctor theDoc = drservice.findById(id);
		drservice.deleteById(id);
		return "redirect:/doctor/list";
	}

	@GetMapping("/finddoctorbyid")
	public String findDoctorById(@RequestParam("docid") int id, Model model) {
		Doctor theDoc = drservice.findById(id);
		model.addAttribute("finddoctorbyid", theDoc);
		return "find-doctor-by-id-form";
	}
	@GetMapping("/getdocapp")
	public String getAppointments(@RequestParam("id") int id,Model model) {
		DoctorAppointmentsDTO dto =drservice.getDoctorAndAppointments(id);
		model.addAttribute("getdoc",dto.getDoctor());
		model.addAttribute("applist",dto.getAppointments());
	return "list-doctor-appointments";
	}
	//localhost:8080/doctor/trans?id=220
	@GetMapping("/trans")
	public void testTransaction(@RequestParam("id") int id) {
		DoctorAppointmentsDTO dto= new DoctorAppointmentsDTO();
		Doctor dr=new Doctor();
		dr.setID(id);
		dr.setNAME("Venkat");
		  Date drdob=new Date(92,7,16);
		dr.setDOB(drdob);
		dr.setCITY("Thirunelveli");
		dr.setPHONE_NO(9080163531l);
		dr.setSPACIALITY("ENT");
		dr.setSTANDARD_FEES(1000);
		dto.setDoctor(dr);
		List<Appointment> applist=new ArrayList<Appointment>();
		int nextAppId=drservice.getNextAppointmentId();
		  for(int i=nextAppId;i<=nextAppId+2;i++) 
	        {
	            Appointment app=new Appointment();
	            app.setApp_id(i);
	            Date appdt=new Date(22,7,25);
	            app.setApp_date(appdt); 
	            app.setId(id);
	            app.setPatient_name("Strac");
	            app.setFees_collected(dr.getSTANDARD_FEES());
	            app.setFees_nature("Low");
	            dto.addAppointment(app);
	        }
		  drservice.addDoctorAndAppointments(dto);
		  System.out.println("Successfully completed");
		
		
	}
}