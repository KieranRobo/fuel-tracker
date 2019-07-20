package com.kieran.fueltracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="fillups")
public class FillUp {

    @JsonIgnore
    @Column(name="id")
    @Id
    private int id;

    @JsonProperty("owned_vehicle")
    @ManyToOne
    @JoinColumn(name="owned_vehicle")
    private OwnedVehicle ownedVehicle;

    @JsonProperty("mileage")
    @Column(name="mileage")
    private int mileage;

    @JsonProperty("litres_filled")
    @Column(name="litres_filled")
    private double litresFilled;

    @JsonProperty("cost")
    @Column(name="cost")
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
