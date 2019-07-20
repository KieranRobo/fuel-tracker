package com.kieran.fueltracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="owned_vehicles")
public class OwnedVehicle {

    @JsonIgnore
    @Column(name="id")
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name="vehicle")
    private Vehicle vehicle;

    @Column(name="registration")
    private String registration;

    @Column(name="owner")
    private int owner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }
}
