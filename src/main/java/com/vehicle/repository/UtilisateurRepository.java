package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.model.Seller;

@Repository
public interface UtilisateurRepository extends JpaRepository<Seller, String>{
	
	
}
