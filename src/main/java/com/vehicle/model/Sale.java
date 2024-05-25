package com.vehicle.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Sale {
    @EmbeddedId
    SaleKey saleKey;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "id")
    Vehicle vehicle;

    @ManyToOne
    @MapsId("credential")
    @JoinColumn(name = "credential")
    Seller seller;

    private double price;

    public Sale(Vehicle vehicle, Seller seller, double price) {
        this.saleKey = new SaleKey(vehicle.getId(), seller.getCredential(), new Date());
        this.vehicle = vehicle;
        this.seller = seller;
        this.price = price;
    }

    public Sale() {

    }

    public String toJson() throws JsonProcessingException {
        return "{\"vehicle_id\":" + vehicle.getId() +
                ", \"credential\": \"" + seller.getCredential() +
                "\", \"price\": " + price +
                ", \"date\": \"" + saleKey.date.toString() +
                "\", \"sellername\": \"" + seller.getName() +
                "\", \"vehicleinfo\": \"" + vehicle.getBrand() + " " + vehicle.getModel() + " " + vehicle.getYear() + " " + vehicle.getColor() +
                "\"}";
    }

    public SaleKey getSaleKey() {
        return saleKey;
    }

    public void setSaleKey(SaleKey saleKey) {
        this.saleKey = saleKey;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
