package com.vehicle.controller;

import com.vehicle.model.Car;
import com.vehicle.model.Motorcycle;
import com.vehicle.service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotorcycleController {
    @Autowired
    MotorcycleService motorcycleService;
    @PostMapping("/moto")
    public String addMotorcyclie(@RequestParam String brand, @RequestParam String model, @RequestParam String year, @RequestParam String color, @RequestParam String hasTrunk, @RequestParam String startingType, @RequestParam String seatHeight) {
        Motorcycle motorcycle = new Motorcycle(brand, model, year, color, hasTrunk.equals("true"), startingType, Double.parseDouble(seatHeight));
        motorcycleService.addOrUpdateMotorcycle(motorcycle);
        return "ok";
    }
}
