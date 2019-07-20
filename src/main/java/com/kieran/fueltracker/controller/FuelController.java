package com.kieran.fueltracker.controller;

import com.kieran.fueltracker.model.FillUp;
import com.kieran.fueltracker.service.FuelService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("fuel")
public class FuelController {

    @Resource
    private FuelService fuelService;

    @PutMapping("fillup")
    public void fillUp(@RequestBody FillUp fillUp) {
        fuelService.fillUp(fillUp);
    }

}
