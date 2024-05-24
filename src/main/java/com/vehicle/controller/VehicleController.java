package com.vehicle.controller;

import com.vehicle.repository.ProjetRepository;
import com.vehicle.repository.UtilisateurRepository;
import com.vehicle.service.ProjetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VehicleController {
	// appel ProjetService
	@Autowired ProjetService projetService;
	@Autowired ProjetRepository projetRepository;
	@Autowired UtilisateurRepository utilisateurRepository;
	

	
	// méthode pour afficher le formulaire projet.jsp
	@GetMapping("/vehicle")
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
		return "vehicle";
	}
	//méthode pour récupérer les data du form projet
	@PostMapping("/vehicle")
	public ModelAndView gererProjet(@RequestParam String description, @RequestParam String budget){
		/*
		ModelAndView model = new ModelAndView();
		//Affichage des données
		System.out.println(description+" avec un budget de " + budget);
		//Traitement des données
		Vehicle p = new Vehicle(description, Double.parseDouble(budget));
		projetService.addOrUpdateProjet(p);
		//changer le budget
		p.setBudget(40000);
		projetService.addOrUpdateProjet(p);
		//Recherche du projet id = 2
		Optional<Vehicle> pr = projetService.getProjetById(2);
        pr.ifPresent(System.out::println);
		//Retour du mudel vers page menu.jsp
		model.addObject("description", description);
		model.addObject("budget", budget);
		model.setViewName("menu");
		return model;
		*/
		
		ModelAndView model = new ModelAndView();
		return model;
		
	}
}

