package com.vehicle.model;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle{
	
	
	private int amountDoor;
	private String fuelType;
	private float trunkCapacity;
	
	
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
