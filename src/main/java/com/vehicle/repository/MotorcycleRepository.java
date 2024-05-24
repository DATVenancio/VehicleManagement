package com.vehicle.repository;

import com.vehicle.model.Car;
import com.vehicle.model.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorcycleRepository extends JpaRepository<Motorcycle, Integer> {
}
