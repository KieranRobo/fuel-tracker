package com.kieran.fueltracker.controller;

import com.kieran.fueltracker.database.FuelRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("fuel")
public class FuelController {

    @Resource
    private FuelRepository fuelRepository;

    @PutMapping("fillup")
    public void fillup(String regNumber, int currentMileage, double litresFilled, double cost) {
        fuelRepository.insertNewFillUp(regNumber, currentMileage, litresFilled, cost);
    }

}
