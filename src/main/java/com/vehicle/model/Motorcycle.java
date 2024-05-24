package com.vehicle.model;

import jakarta.persistence.Entity;

@Entity
public class Motorcycle extends Vehicle{

	private boolean hasTrunk;
	private String startingType;
	private float seatHeight;
	
	
	
}
