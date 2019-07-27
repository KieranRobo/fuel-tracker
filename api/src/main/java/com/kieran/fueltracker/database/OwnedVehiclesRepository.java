package com.kieran.fueltracker.database;

import com.kieran.fueltracker.model.OwnedVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ownedVehicleRepository")
public interface OwnedVehiclesRepository extends JpaRepository<OwnedVehicle, Integer> {

}
