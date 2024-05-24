package com.vehicle.controller;

import com.vehicle.model.Car;
import com.vehicle.repository.VehicleRepository;
import com.vehicle.repository.UtilisateurRepository;
import com.vehicle.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    // appel ProjetService
    @Autowired
    CarService carService;
    @Autowired
    UtilisateurRepository utilisateurRepository;

    //méthode pour ajouter une voiture
    @PostMapping("/car")
    public String addCar(@RequestParam String brand, @RequestParam String model, @RequestParam String year, @RequestParam String color, @RequestParam String amountDoor, @RequestParam String fuelType, @RequestParam String trunkCapacity) {
        Car car = new Car(brand, model, year, color, Integer.valueOf(amountDoor), fuelType, Double.parseDouble(trunkCapacity));
        carService.addOrUpdateProjet(car);
        return "ok";
    }
}

