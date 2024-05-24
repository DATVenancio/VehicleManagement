package com.vehicle.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Seller {
	
	@Id
	private String credential;
	private String nom;
	
	@ManyToMany
	@JoinTable(name="projet_utilisateurs",joinColumns = @JoinColumn(name = "credential"),inverseJoinColumns = @JoinColumn(name = "id"))
	private List<Vehicle> projets;
	
	public Seller() {
		super();
	}
	
	
	public Seller(String credential, String nom) {
		super();
		this.credential = credential;
		this.nom = nom;
	}
	
	


	public List<Vehicle> getProjets() {
		return projets;
	}


	public void setProjets(List<Vehicle> projets) {
		this.projets = projets;
	}


	public String getCredential() {
		return credential;
	}
	public void setCredential(String matricule) {
		this.credential = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "Utilisateur [matricule=" + credential + ", nom=" + nom + "]";
	}
	
	
	
	
}
