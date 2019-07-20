package com.kieran.fueltracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicles")
public class Vehicle {

    @JsonIgnore
    @Id
    @Column(name="id")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
}
