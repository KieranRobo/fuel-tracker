package com.kieran.fueltracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="vehicles")
@NoArgsConstructor
public class Vehicle {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Id
    private int id;

    @JsonProperty("brand")
    @Column(name="brand")
    private String brand;

    @JsonProperty("model")
    @Column(name="model")
    private String model;

    @JsonProperty("year")
    @Column(name="year")
    private String year;

    @JsonProperty("engine_size")
    @Column(name="engine_size")
    private int engineSize;

    public Vehicle(String brand, String model, String year, int engineSize) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineSize = engineSize;
    }
}
