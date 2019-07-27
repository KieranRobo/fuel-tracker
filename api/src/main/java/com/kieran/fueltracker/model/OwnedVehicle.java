package com.kieran.fueltracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="owned_vehicles")
@NoArgsConstructor
public class OwnedVehicle {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Id
    private int id;

    @JsonProperty("vehicle")
    @ManyToOne
    @JoinColumn(name="vehicle")
    private Vehicle vehicle;

    @JsonProperty("registration")
    @Column(name="registration")
    private String registration;

    @JsonProperty("owner")
    @Column(name="owner")
    private int owner;

    public OwnedVehicle(Vehicle vehicle, String registration, int owner) {
        this.vehicle = vehicle;
        this.registration = registration;
        this.owner = owner;
    }

}
