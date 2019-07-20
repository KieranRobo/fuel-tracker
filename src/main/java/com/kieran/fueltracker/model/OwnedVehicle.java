package com.kieran.fueltracker.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;

@Entity
@Table(name="owned_vehicles")
public class OwnedVehicle {

    @JsonIgnore
    @Column(name="id")
    @Id
    private int id;

    @JsonProperty("vehicle_id")
    @Column(name="vehicle")
    private int vehicleId;

    @JsonProperty("registration")
    @Column(name="registration")
    private String registration;

    @JsonProperty("owner")
    @Column(name="owner")
    private int owner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
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
