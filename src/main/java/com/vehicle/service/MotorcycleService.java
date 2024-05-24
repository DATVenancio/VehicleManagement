package com.vehicle.service;

import com.vehicle.model.Car;
import com.vehicle.model.Motorcycle;
import com.vehicle.repository.CarRepository;
import com.vehicle.repository.MotorcycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MotorcycleService {

	@Autowired
	MotorcycleRepository motorcycleRepository;
	public void addOrUpdateMotorcycle(Motorcycle motorcycle) {
		motorcycleRepository.save(motorcycle);
	}

}
