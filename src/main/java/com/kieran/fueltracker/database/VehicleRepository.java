package com.kieran.fueltracker.database;

import com.kieran.fueltracker.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    @Query(value = "SELECT v FROM Vehicle v WHERE v.id = :id")
    Vehicle getVehicleById(int id);

}
