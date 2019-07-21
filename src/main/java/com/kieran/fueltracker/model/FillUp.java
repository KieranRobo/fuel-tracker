package com.kieran.fueltracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="fillups")
@NoArgsConstructor
public class FillUp {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public FillUp(OwnedVehicle ownedVehicle, int mileage, double litresFilled, double cost) {
        this.ownedVehicle = ownedVehicle;
        this.mileage = mileage;
        this.litresFilled = litresFilled;
        this.cost = cost;
    }
}
