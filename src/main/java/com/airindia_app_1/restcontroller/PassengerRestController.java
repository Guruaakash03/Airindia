package com.airindia_app_1.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airindia_app_1.entity.Passenger;
import com.airindia_app_1.repository.PassengerRepository;

@RestController
@RequestMapping("/api")
public class PassengerRestController {
	//http://localhost:8080/api
	@Autowired
	private PassengerRepository passRepo;
	
	@GetMapping
	public List<Passenger> getAllPassenger(){
		List<Passenger> passdata = passRepo.findAll();
		return passdata;
	}

	//http://localhost:8080/api
	@PostMapping
	public void saveApi(@RequestBody Passenger pass) {
		passRepo.save(pass);
	}
	
	//http://localhost:8080/api
		@PutMapping
		public void updateApi(@RequestBody Passenger pass) {
			passRepo.save(pass);
		}
	
	
}
