package com.vehicle.model;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {


    private int amountDoor;
    private String fuelType;
    private double trunkCapacity;

    public Car(String brand, String model, String year, String color, int amountDoor, String fuelType, double trunkCapacity) {
		super(brand, model, year, color);
		
		this.amountDoor=amountDoor;
		this.fuelType = fuelType;
		this.trunkCapacity = trunkCapacity;
		// TODO Auto-generated constructor stub
	}

    public Car() {
        super();
    }

    public int getAmountDoor() {
        return amountDoor;
    }

    public void setAmountDoor(int amountDoor) {
        this.amountDoor = amountDoor;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Car [amountDoor=" + amountDoor + ", fuelType=" + fuelType + ", trunkCapacity=" + trunkCapacity + "]";
    }


}
