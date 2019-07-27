package com.kieran.fueltracker.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Vehicle does not exist")
public class VehicleDoesNotExistException extends RuntimeException {
    public VehicleDoesNotExistException(String messsage) {
        super(messsage);
    }
}
