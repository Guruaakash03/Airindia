package com.airindia_app_1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airindia_app_1.entity.Passenger;
import com.airindia_app_1.repository.PassengerRepository;
@Service
public class PassengerServiceipml implements PassengerService {

	@Autowired
	private PassengerRepository passRepo;
	@Override
	public void savePassenger(Passenger pass) {

		passRepo.save(pass);
	}
	@Override
	public List<Passenger> ListAllPassenger(Passenger pass) {
		
		List<Passenger> passengerdata = passRepo.findAll();
		return passengerdata;
	}
	@Override
	public void deletePassbyId(int id) {
		passRepo.deleteById(id);
		
	}
	@Override
	public Passenger updateOnePass(int id) {
		Optional<Passenger> findById = passRepo.findById(id);
		Passenger pass1 = findById.get();
		return pass1;
	}
	@Override
	public void updatePassinfo(Passenger pass) {
	passRepo.save(pass);
	
	}

}
