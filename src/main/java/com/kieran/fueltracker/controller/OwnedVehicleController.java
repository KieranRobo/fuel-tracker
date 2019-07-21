package com.kieran.fueltracker.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kieran.fueltracker.Exceptions.VehicleDoesNotExistException;
import com.kieran.fueltracker.model.OwnedVehicle;
import com.kieran.fueltracker.model.Vehicle;
import com.kieran.fueltracker.service.VehicleService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("owned-vehicles")
public class OwnedVehicleController {

    @Resource
    private VehicleService vehicleService;

    @GetMapping
    public List<OwnedVehicle> getAllOwnedVehicles() {
        return vehicleService.getAllOwnedVehicles();
    }

    @GetMapping("{id}")
    public OwnedVehicle getOwnedVehicle(@PathVariable("id") int id) {
        Optional<OwnedVehicle> ownedVehicle = vehicleService.getOwnedVehicle(id);
        if (ownedVehicle.isPresent()) {
            return ownedVehicle.get();
        }
        throw new VehicleDoesNotExistException("Owned vehicle ID " + id + " does not exist");
    }

    @PostMapping
    public void newOwnedVehicle(@RequestBody OwnedVehiclePost ov) {
        Optional<Vehicle> vehicle = vehicleService.getVehicle(ov.vehicleId);
        if (!vehicle.isPresent()) {
            throw new VehicleDoesNotExistException("Vehicle ID " + ov.vehicleId + " does not exist");
        }
        vehicleService.createOwnedVehicle(ov.registration, vehicle.get(), ov.ownerId);
    }

    @Data
    private static class OwnedVehiclePost {
        @JsonProperty("vehicle_id")
        private int vehicleId;

        @JsonProperty("registration")
        private String registration;

        @JsonProperty("owner_id")
        private int ownerId;
    }
}


