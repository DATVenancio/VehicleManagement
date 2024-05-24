package com.vehicle.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.model.Car;
import com.vehicle.repository.CarRepository;

@Service
public class CarService {

	@Autowired CarRepository carRepository;
	public void addOrUpdateProjet(Car car) {
		carRepository.save(car);
	}
	public Optional<Car> getProjetById(int id) {
		return carRepository.findById(id);
	}

}
