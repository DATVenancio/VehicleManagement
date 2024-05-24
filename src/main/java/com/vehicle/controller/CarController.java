package com.vehicle.controller;

import com.vehicle.model.Car;
import com.vehicle.repository.ProjetRepository;
import com.vehicle.repository.UtilisateurRepository;
import com.vehicle.service.CarService;
import com.vehicle.service.ProjetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
	// appel ProjetService
	@Autowired CarService carService;
	@Autowired ProjetRepository projetRepository;
	@Autowired UtilisateurRepository utilisateurRepository;
	

	
	// méthode pour afficher le formulaire projet.jsp
	@GetMapping("/car")
	public String getProjetForm(){
		/*
		System.out.println(projetRepository.findByDescription("Terceiro"));
		System.out.println(projetRepository.findByDescriptionOrBudget("", 40000));
		System.out.println(projetRepository.getProjets(0,50000));
		for(Object[] p:projetRepository.getTousProjets()){
			System.out.println("Description : " + p[0]);
			System.out.println("Budget : " + p[1]);
		}
		
		//ajoute d'un projet dev
		Car pDev = new Car();
		pDev.setDescription("Realisation fullstack");
		pDev.setBudget(45000);
		pDev.setTechnologies("Angular,Spring, docker,...");
		projetRepository.save(pDev);
		
		//affichage de tous le projetDev
		System.out.println(projetRepository.getTousProjetDev().toString());
		
		//ajoute utilisateur et son affecatation  un projet
		Utilisateur u = new Utilisateur("m1","nom1");
		utilisateurRepository.save(u);
		Vehicle p = projetRepository.findById(2).get();
		p.getUtilisateurs().add(u);
		projetRepository.save(p);
		
		*/
		return "car";
	}
	//méthode pour récupérer les data du form projet
	@PostMapping("/car")
	public String gererProjet(@RequestParam String brand, @RequestParam String model,@RequestParam String year,
			@RequestParam String color,@RequestParam String amountDoor,@RequestParam String fuelType,
			@RequestParam String trunkCapacity){

		
		Car car = new Car(brand,model,year,color, Integer.valueOf(amountDoor),fuelType, Float.parseFloat(trunkCapacity));
		carService.addOrUpdateProjet(car);
		
		/*
		p.setBudget(40000);
		projetService.addOrUpdateProjet(p);
		//Recherche du projet id = 2
		Optional<Vehicle> pr = projetService.getProjetById(2);
        pr.ifPresent(System.out::println);
        */
		
		return "menu";

		
	}
}

