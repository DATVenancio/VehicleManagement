package com.vehicle.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String brand;
	private String model;
	private String year;
	private String color;
	
	/*

	@OneToMany(mappedBy = "projet")
	private List<Tache> taches;
	
	@ManyToMany
	@JoinTable(name="projet_utilisateurs",joinColumns = @JoinColumn(name = "id"),inverseJoinColumns = @JoinColumn(name = "matricule"))
	private List<Utilisateur> utilisateurs;
	*/
	
	
	
	public Vehicle() {
		super();
	}
	
	
	public Vehicle(int id, String brand, String model, String year, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", brand=" + brand + ", model=" + model + ", year=" + year + ", color=" + color
				+ "]";
	}
	
	

	
	
	
	
	
}
