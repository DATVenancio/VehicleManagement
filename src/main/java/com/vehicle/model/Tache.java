package com.vehicle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Tache {
    @Id
    private String codeTache;
    private String intitule;
    @ManyToOne
    private Vehicle projet;

    public Tache() {
        super();
    }

    public Tache(String codeTache, String intitule) {
        super();
        this.codeTache = codeTache;
        this.intitule = intitule;
    }

    public String getCodeTache() {
        return codeTache;
    }

    public void setCodeTache(String codeTache) {
        this.codeTache = codeTache;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    
    

	public Vehicle getProjet() {
		return projet;
	}

	public void setProjet(Vehicle projet) {
		this.projet = projet;
	}

	@Override
	public String toString() {
		return "Tache [codeTache=" + codeTache + ", intitule=" + intitule + ", projet=" + projet + "]";
	}
    
}