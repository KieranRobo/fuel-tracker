package com.kieran.fueltracker.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kieran.fueltracker.Exceptions.VehicleDoesNotExistException;
import com.kieran.fueltracker.model.Vehicle;
import com.kieran.fueltracker.service.VehicleService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("vehicles")
public class VehicleController {

    @Resource
    private VehicleService vehicleService;

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping("{id}")
    public Vehicle getVehicle(@PathVariable("id") int id) {
        Optional<Vehicle> vehicle = vehicleService.getVehicle(id);
        if (vehicle.isPresent()) {
            return vehicle.get();
        }
        throw new VehicleDoesNotExistException("Vehicle with ID " + id + " does not exist");
    }

    @PostMapping
    public void newOwnedVehicle(@RequestBody VehiclePost v) {
        vehicleService.createVehicle(v.brand, v.model, v.year, v.engineSize);
    }

    @Data
    private static class VehiclePost {
        @JsonProperty("brand")
        private String brand;

        @JsonProperty("model")
        private String model;

        @JsonProperty("year")
        private String year;

        @JsonProperty("engine_size")
        private int engineSize;
    }
}
