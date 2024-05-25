package com.vehicle.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class SaleKey implements Serializable {
    @Column(name="id")
    int id;

    @Column(name="credential")
    String credential;

    @Column(name="date")
    Date date;

    public SaleKey(int id, String credential, Date date) {
        this.id = id;
        this.credential = credential;
        this.date = date;
    }

    public SaleKey() {

    }
}
