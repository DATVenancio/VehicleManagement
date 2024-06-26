package com.vehicle.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vehicle.model.Car;
import com.vehicle.model.Sale;
import com.vehicle.model.Seller;
import com.vehicle.model.Vehicle;
import com.vehicle.repository.SellerRepository;
import com.vehicle.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
public class SellerController {
    @Autowired
    SellerRepository sellerRepository;
    @Autowired
    SellerService sellerService;
    // create new seller
    /* {"credential" : AB213153,
    *  "name" : Name,
    *  "birthday": YYYY-MM-DD
    * }
    * */
    @PostMapping("/seller")
    public String addSeller(@RequestParam String credential, @RequestParam String name, @RequestParam String birthday) {
        Seller seller = new Seller(credential, name, Date.valueOf(birthday) );
        sellerService.addOrUpdateSeller(seller);
        return "ok";
    }
    @GetMapping(path="/seller", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllSellers(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        boolean isFirst = true;
        for(Seller seller : sellerRepository.getAllSellers()){
            try {
                if(isFirst){
                    String ret = seller.toJson();
                    stringBuilder.append(ret);
                    isFirst = false;
                    continue;
                }
                String ret = seller.toJson();
                stringBuilder.append(",\n"+ret);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
