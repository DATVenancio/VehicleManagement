package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.model.Tache;

@Repository
public interface TacheRepository extends JpaRepository<Tache,String>{

}
