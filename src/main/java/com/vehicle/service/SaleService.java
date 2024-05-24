package com.vehicle.service;

import com.vehicle.model.Motorcycle;
import com.vehicle.model.Sale;
import com.vehicle.repository.MotorcycleRepository;
import com.vehicle.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;

    public void addOrUpdateSale(Sale sale) {
        saleRepository.save(sale);
    }

}
