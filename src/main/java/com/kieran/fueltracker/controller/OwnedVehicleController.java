package com.kieran.fueltracker.controller;

import com.kieran.fueltracker.Exceptions.VehicleDoesNotExistException;
import com.kieran.fueltracker.model.OwnedVehicle;
import com.kieran.fueltracker.service.VehicleService;
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
    public void newOwnedVehicle(@RequestBody OwnedVehicle ownedVehicle) {
        vehicleService.createOwnedVehicle(ownedVehicle);
    }
}
