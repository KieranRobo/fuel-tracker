package com.kieran.fueltracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fillups")
public class FillUp {

    @JsonIgnore
    @Id
    private int id;

    @ManyToOne
    private OwnedVehicle ownedVehicle;

    private int mileage;
    private double litresFilled;
    private double cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OwnedVehicle getOwnedVehicle() {
        return ownedVehicle;
    }

    public void setOwnedVehicle(OwnedVehicle ownedVehicle) {
        this.ownedVehicle = ownedVehicle;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getLitresFilled() {
        return litresFilled;
    }

    public void setLitresFilled(double litresFilled) {
        this.litresFilled = litresFilled;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
