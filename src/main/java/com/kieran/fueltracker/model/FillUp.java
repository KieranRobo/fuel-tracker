package com.kieran.fueltracker.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FillUp {

    private @Id String regNumber;
    private int mileage;
    private double litresFilled;
    private double cost;

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
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
