package com.vehicle.repository;

import com.vehicle.model.Seller;
import com.vehicle.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends JpaRepository<Seller, String> {
    @Query("select s from Seller s")
    public List<Seller> getAllSellers();
}
