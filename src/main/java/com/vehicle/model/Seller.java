package com.vehicle.model;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import jakarta.persistence.*;

@Entity
public class Seller {

    @Id
    private String credential;
    private String name;
    private Date birthday;

    @OneToMany(mappedBy = "seller")
    private Set<Sale> sales;

    public Seller() {
        super();
    }


    public Seller(String credential, String name, Date birthday) {
        super();
        this.credential = credential;
        this.name = name;
        this.birthday = birthday;
    }
    public String getCredential() {
        return credential;
    }

    public void setCredential(String matricule) {
        this.credential = matricule;
    }

    public String getName() {
        return name;
    }

    public void setName(String nom) {
        this.name = nom;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date date) {
        this.birthday = date;
    }

    @Override
    public String toString() {
        return "Utilisateur [matricule=" + credential + ", nom=" + name + "]";
    }

    public String toJson() throws JsonProcessingException {
        return "{\"credential\": \"" + credential + "\", \"name\": \"" + name +
                "\", \"birthday\": \"" + birthday.toString() + "\"}";
    }

}
