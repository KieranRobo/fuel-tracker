package com.kieran.fueltracker.service;

import com.kieran.fueltracker.database.OwnedVehiclesRepository;
import com.kieran.fueltracker.database.VehicleRepository;
import com.kieran.fueltracker.model.OwnedVehicle;
import com.kieran.fueltracker.model.Vehicle;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class VehicleService {

    @Resource
    private VehicleRepository vehicleRepository;

    @Resource
    private OwnedVehiclesRepository ownedVehicleRepository;

    public Optional<Vehicle> getVehicle(int id) {
        return vehicleRepository.findById(id);
    }

    public OwnedVehicle getOwnedVehicle(int id) {
        return ownedVehicleRepository.getOwnedVehicleById(id);
    }

    public void createVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

}
