package com.vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vehicle.model.Vehicle;
import com.vehicle.model.Tache;
import com.vehicle.repository.ProjetRepository;
import com.vehicle.repository.TacheRepository;

@Controller
public class TacheController {
@Autowired TacheRepository tacheRepository;
@Autowired ProjetRepository projetRepository;
	


	@GetMapping("/taches")
	public String aficheTache() {
		return "tache";
	}
	@PostMapping("/taches")
	public ModelAndView addTaches(@RequestParam String id,
							@RequestParam String codeTache,
							@RequestParam String intitule) {
		ModelAndView model = new ModelAndView();
		Tache t = new Tache();
		Vehicle p = projetRepository.findById(Integer.parseInt(id)).get();
		t.setCodeTache(codeTache);
		t.setIntitule(intitule);
		t.setProjet(p);
		tacheRepository.save(t);
		
		
		model.addObject("intitule",intitule);
		model.addObject("description",p.getDescription());
		
		model.setViewName("resultTache");
		return model;
	}
	
}
