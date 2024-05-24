package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vehicle.model.Vehicle;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Vehicle, Integer> {
    List<Vehicle> findByDescription(String d);

    List<Vehicle> findByDescriptionOrBudget(String d, double b);

    @Query("select p from Projet p where p.budget between :BUDGETMIN and :BUDGETMAX")
    public List<Vehicle> getProjets(@Param(value = "BUDGETMIN") double min, @Param(value = "BUDGETMAX") double max);

    @Query("select p.description, p.budget from Projet p")
    public List<Object[]> getTousProjets();
    
    @Query("select p from ProjetDev p")
    public List<Object[]> getTousProjetDev();
}
