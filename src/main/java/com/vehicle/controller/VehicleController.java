package com.vehicle.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vehicle.model.Vehicle;
import com.vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
	// méthode pour afficher le formulaire projet.jsp
	@Autowired
	VehicleRepository vehicleRepository;
	@GetMapping("/vehicle")
	public String getAllVehicles(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[");
		for(Vehicle vehicle : vehicleRepository.getAllVehicles()){
			try {
				String ret = vehicle.toJson();
				stringBuilder.append(ret+",\n");
			} catch (JsonProcessingException e) {
				throw new RuntimeException(e);
			}
		}
		stringBuilder.append("]");
		System.out.println(vehicleRepository.getAllVehicles().toString());
		return stringBuilder.toString();
	}
}

