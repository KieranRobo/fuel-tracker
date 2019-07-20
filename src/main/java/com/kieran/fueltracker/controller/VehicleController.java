package com.kieran.fueltracker.controller;

import com.kieran.fueltracker.Exceptions.VehicleDoesNotExistException;
import com.kieran.fueltracker.model.Vehicle;
import com.kieran.fueltracker.service.VehicleService;
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
    public void newVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.createVehicle(vehicle);
    }
}
