package com.kieran.fueltracker.service;

import com.kieran.fueltracker.database.FuelRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FuelService {

    @Resource
    private FuelRepository fuelRepository;

    public void fillUp(int ownedVehicleId, int currentMileage, double litresFilled, double cost) {
        fuelRepository.insertNewFillUp(ownedVehicleId, currentMileage, litresFilled, cost);
    }

}
