package com.airindia_app_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.airindia_app_1.entity.Passenger;
import com.airindia_app_1.services.PassengerService;
import com.airindia_app_1.utils.AirindiaEmailService;

@Controller
public class PassengerController {

	@Autowired
	private PassengerService passServ;
	@Autowired
	private AirindiaEmailService emailServ;
	
	
	@RequestMapping("/show")
	public String show() {
		return "show";
		
	}
	@RequestMapping("/savepass")
	public String savepassdetails(Passenger pass) {
		passServ.savePassenger(pass);
		emailServ.EmailServices(pass.getEmail(),"WELCOME TO AIR-INDIA","Thanks for recerived your Flight");
		return "show";
		
	}
	@RequestMapping("/list_all")
	public String ListAllPassengers(Passenger pass,ModelMap model ) {
		
		List<Passenger> passengerdata = passServ.ListAllPassenger(pass);
		model.addAttribute("passengerdata", passengerdata);
		return "listall";
		
	}
	
	@RequestMapping("/deletepass")
	public String deletepass(@RequestParam("id") int id,ModelMap model,Passenger pass) {
		passServ.deletePassbyId(id);
		List<Passenger> passengerdata = passServ.ListAllPassenger(pass);
		model.addAttribute("passengerdata", passengerdata);
		return "listall";
	}
	
	@RequestMapping("/updatepass")
	public String updatepass(@RequestParam("id") int id,ModelMap model) {
		Passenger pass1 = passServ.updateOnePass(id);
		model.addAttribute("pass1", pass1);
		return "update_pass";
	}
	@RequestMapping("/updatepassdata")
	public String updatepassdata(Passenger pass,ModelMap model) {
	passServ.updatePassinfo(pass);	
	List<Passenger> passengerdata = passServ.ListAllPassenger(pass);
	model.addAttribute("passengerdata", passengerdata);
	return "listall";
	}
	
}
