package com.vehicle.service;

import com.vehicle.model.Sale;
import com.vehicle.model.Seller;
import com.vehicle.repository.SaleRepository;
import com.vehicle.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;
    public void addOrUpdateSeller(Seller seller) {
        sellerRepository.save(seller);
    }
}
