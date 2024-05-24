package com.vehicle.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.model.Vehicle;
import com.vehicle.repository.ProjetRepository;

@Service
public class ProjetService {
	@Autowired ProjetRepository projetRepository;
	public void addOrUpdateProjet(Vehicle projet) {
		projetRepository.save(projet);
	}
	public Optional<Vehicle> getProjetById(int id) {
		return projetRepository.findById(id);
	}
}
