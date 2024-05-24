package com.vehicle.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Utilisateur {
	
	@Id
	private String matricule;
	private String nom;
	
	@ManyToMany
	@JoinTable(name="projet_utilisateurs",joinColumns = @JoinColumn(name = "matricule"),inverseJoinColumns = @JoinColumn(name = "id"))
	private List<Vehicle> projets;
	
	public Utilisateur() {
		super();
	}
	
	
	public Utilisateur(String matricule, String nom) {
		super();
		this.matricule = matricule;
		this.nom = nom;
	}
	
	


	public List<Vehicle> getProjets() {
		return projets;
	}


	public void setProjets(List<Vehicle> projets) {
		this.projets = projets;
	}


	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "Utilisateur [matricule=" + matricule + ", nom=" + nom + "]";
	}
	
	
	
	
}
