package com.kieran.fueltracker.service;

import com.kieran.fueltracker.database.OwnedVehiclesRepository;
import com.kieran.fueltracker.database.VehicleRepository;
import com.kieran.fueltracker.model.OwnedVehicle;
import com.kieran.fueltracker.model.Vehicle;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Resource
    private VehicleRepository vehicleRepository;

    @Resource
    private OwnedVehiclesRepository ownedVehicleRepository;

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public List<OwnedVehicle> getAllOwnedVehicles() {
        return ownedVehicleRepository.findAll();
    }

    public Optional<Vehicle> getVehicle(int id) {
        return vehicleRepository.findById(id);
    }

    public Optional<OwnedVehicle> getOwnedVehicle(int id) {
        return ownedVehicleRepository.findById(id);
    }

    public void createVehicle(String brand, String model, String year, int engineSize) {
        Vehicle vehicle = new Vehicle(brand, model, year, engineSize);
        vehicleRepository.save(vehicle);
    }

    public void createOwnedVehicle(String registration, Vehicle vehicle, int owner) {
        OwnedVehicle ownedVehicle = new OwnedVehicle(vehicle, registration, owner);
        ownedVehicleRepository.save(ownedVehicle);
    }

}
