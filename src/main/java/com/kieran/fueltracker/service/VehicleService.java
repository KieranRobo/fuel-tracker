package com.kieran.fueltracker.service;

import com.kieran.fueltracker.database.OwnedVehiclesRepository;
import com.kieran.fueltracker.database.VehicleRepository;
import com.kieran.fueltracker.model.OwnedVehicle;
import com.kieran.fueltracker.model.Vehicle;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VehicleService {

    @Resource
    private VehicleRepository vehicleRepository;

    @Resource
    private OwnedVehiclesRepository ownedVehicleRepository;

    public Vehicle getVehicle(int id) {
        return vehicleRepository.getVehicleById(id);
    }

    public OwnedVehicle getOwnedVehicle(int id) {
        return ownedVehicleRepository.getOwnedVehicleById(id);
    }

}
