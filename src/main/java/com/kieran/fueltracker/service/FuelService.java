package com.kieran.fueltracker.service;

import com.kieran.fueltracker.database.FuelRepository;
import com.kieran.fueltracker.model.FillUp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FuelService {

    @Resource
    private FuelRepository fuelRepository;

    public void fillUp(FillUp fillUp) {
        fuelRepository.save(fillUp);
    }

}
