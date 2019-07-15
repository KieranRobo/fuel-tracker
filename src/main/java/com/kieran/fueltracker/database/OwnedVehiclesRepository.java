package com.kieran.fueltracker.database;

import com.kieran.fueltracker.model.OwnedVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OwnedVehiclesRepository extends JpaRepository<OwnedVehicle, Long> {

    @Query(value = "SELECT ov FROM OwnedVehicle ov WHERE ov.id = :id")
    OwnedVehicle getOwnedVehicleById(int id);

}
