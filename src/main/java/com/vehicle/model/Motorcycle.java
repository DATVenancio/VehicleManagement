package com.vehicle.model;

import jakarta.persistence.Entity;

@Entity
public class Motorcycle extends Vehicle {

    private boolean hasTrunk;
    private String startingType;
    private double seatHeight;

    public Motorcycle(String brand, String model, String year, String color, boolean hasTrunk, String startingType, double seatHeight) {
        super(brand, model, year, color);
        this.hasTrunk = hasTrunk;
        this.startingType = startingType;
        this.seatHeight = seatHeight;
    }

    public Motorcycle() {
        super();
    }

    @Override
    public String toString() {
        return super.toString() + "Motorcycle{" + "hasTrunk=" + hasTrunk + ", startingType='" + startingType + '\'' + ", seatHeight=" + seatHeight + '}';
    }

    public boolean isHasTrunk() {
        return hasTrunk;
    }

    public void setHasTrunk(boolean hasTrunk) {
        this.hasTrunk = hasTrunk;
    }

    public String getStartingType() {
        return startingType;
    }

    public void setStartingType(String startingType) {
        this.startingType = startingType;
    }

    public double getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(double seatHeight) {
        this.seatHeight = seatHeight;
    }
}
