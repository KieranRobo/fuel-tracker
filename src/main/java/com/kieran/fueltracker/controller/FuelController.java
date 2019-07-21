package com.kieran.fueltracker.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kieran.fueltracker.Exceptions.VehicleDoesNotExistException;
import com.kieran.fueltracker.model.OwnedVehicle;
import com.kieran.fueltracker.service.FuelService;
import com.kieran.fueltracker.service.VehicleService;
import lombok.Data;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@RequestMapping("fuel")
public class FuelController {

    @Resource
    private FuelService fuelService;

    @Resource
    private VehicleService vehicleService;

    @PutMapping("fillup")
    public void fillUp(@RequestBody FillUpPost fu) {
        Optional<OwnedVehicle> ownedVehicle = vehicleService.getOwnedVehicle(fu.ownedVehicleId);
        if (!ownedVehicle.isPresent()) {
            throw new VehicleDoesNotExistException("Owned vehicle with ID " + fu.ownedVehicleId + " does not exist");
        }
        fuelService.fillUp(ownedVehicle.get(), fu.mileage, fu.litresFilled, fu.cost);
    }

    @Data
    private static class FillUpPost {
        @JsonProperty("owned_vehicle_id")
        private int ownedVehicleId;

        @JsonProperty("mileage")
        private int mileage;

        @JsonProperty("litres_filled")
        private double litresFilled;

        @JsonProperty("cost")
        private double cost;
    }
}
