package com.kieran.fueltracker.controller;

import com.kieran.fueltracker.model.OwnedVehicle;
import com.kieran.fueltracker.model.Vehicle;
import com.kieran.fueltracker.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("vehicles")
public class VehicleController {

    @Resource
    private VehicleService vehicleService;

    @GetMapping("{id}")
    public Vehicle getVehicle(@PathVariable("id") int id) {
        return vehicleService.getVehicle(id).get();
    }

    @GetMapping("owned/{id}")
    public OwnedVehicle getOwnedVehicle(@PathVariable("id") int id) {
        return vehicleService.getOwnedVehicle(id);
    }

    @PostMapping("")
    public void getOwnedVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.createVehicle(vehicle);
    }
}
