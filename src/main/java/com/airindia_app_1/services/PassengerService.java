package com.airindia_app_1.services;

import java.util.List;

import com.airindia_app_1.entity.Passenger;

public interface PassengerService {
	
	public void savePassenger(Passenger pass);

	public List<Passenger> ListAllPassenger(Passenger pass);

	public void deletePassbyId(int id);

	public Passenger updateOnePass(int id);

	public void updatePassinfo(Passenger pass);
	

}
