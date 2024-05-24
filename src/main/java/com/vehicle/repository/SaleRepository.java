package com.vehicle.repository;

import com.vehicle.model.Sale;
import com.vehicle.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {
    @Query("select s from Sale s")
    public List<Sale> getAllSales();
}
