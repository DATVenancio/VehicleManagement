package com.vehicle.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SaleKey implements Serializable {
    @Column(name="id")
    int id;

    @Column(name="credential")
    String credential;

    public SaleKey(int id, String credential) {
        this.id = id;
        this.credential = credential;
    }

    public SaleKey() {

    }
}
