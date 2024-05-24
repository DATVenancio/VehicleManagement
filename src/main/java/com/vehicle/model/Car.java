package com.vehicle.model;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {


    private int amountDoor;
    private String fuelType;
    private float trunkCapacity;

    
    

    public Car(String brand, String model, String year, String color,int amountDoor, String fuelType, float trunkCapacity) {
		super(brand, model, year, color);
		
		this.amountDoor=amountDoor;
		this.fuelType = fuelType;
		this.trunkCapacity = trunkCapacity;
		// TODO Auto-generated constructor stub
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

    public float getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(float trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public String toString() {
        return "Car [amountDoor=" + amountDoor + ", fuelType=" + fuelType + ", trunkCapacity=" + trunkCapacity + "]";
    }


}
