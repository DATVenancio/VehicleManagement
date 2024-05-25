package com.vehicle.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vehicle.model.*;
import com.vehicle.repository.SaleRepository;
import com.vehicle.repository.SellerRepository;
import com.vehicle.repository.VehicleRepository;
import com.vehicle.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SaleController {
    @Autowired
    SaleRepository saleRepository;
    @Autowired
    VehicleRepository vehicleRepository;
    @Autowired
    SellerRepository sellerRepository;
    @Autowired
    SaleService saleService;

    @GetMapping(path= "/sale", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllSales(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        boolean isFirst = true;
        for(Sale sale : saleRepository.getAllSales()){
            try {
                if(isFirst){
                    String ret = sale.toJson();
                    stringBuilder.append(ret);
                    isFirst = false;
                    continue;
                }
                String ret = sale.toJson();
                stringBuilder.append(",\n"+ret);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
        stringBuilder.append("]");
        System.out.println(saleRepository.getAllSales().toString());
        return stringBuilder.toString();
    }

    /* {
    *  id: int
    *  credential: string
    *  price: double
    *  }
    * */

    @PostMapping("/sale")
    public String addSale(@RequestParam String id, @RequestParam String credential, @RequestParam String price) {
        // get vehicle
        Optional<Vehicle> vehicleOptional = vehicleRepository.findById(Integer.parseInt(id));
        if(vehicleOptional.isEmpty()){
            return "Vehicle does not exist";
        }
        Vehicle vehicle = vehicleOptional.get();

        //get seller
        Optional<Seller> sellerOptional = sellerRepository.findById(credential);
        if(sellerOptional.isEmpty()){
            return "Seller does not exist";
        }
        Seller seller = sellerOptional.get();
        Sale sale = new Sale(vehicle, seller, Double.parseDouble(price));
        saleService.addOrUpdateSale(sale);
        return "ok";
    }
}
