package com.kieran.fueltracker.controller;

import com.kieran.fueltracker.model.OwnedVehicle;
import com.kieran.fueltracker.model.Vehicle;
import com.kieran.fueltracker.service.VehicleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("vehicles")
public class VehicleController {

    @Resource
    private VehicleService vehicleService;

    @GetMapping("{id}")
    public Vehicle getVehicle(@PathVariable("id") int id) {
        return vehicleService.getVehicle(id);
    }

    @GetMapping("owned/{id}")
    public OwnedVehicle getOwnedVehicle(@PathVariable("id") int id) {
        return vehicleService.getOwnedVehicle(id);
    }
}
