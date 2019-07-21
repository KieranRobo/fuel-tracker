package com.kieran.fueltracker.service;

import com.kieran.fueltracker.database.FuelRepository;
import com.kieran.fueltracker.model.FillUp;
import com.kieran.fueltracker.model.OwnedVehicle;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FuelService {

    @Resource
    private FuelRepository fuelRepository;

    public void fillUp(OwnedVehicle ownedVehicle, int mileage, double litresFilled, double cost) {
        FillUp fillUp = new FillUp(ownedVehicle, mileage, litresFilled, cost);
        fuelRepository.save(fillUp);
    }

}
