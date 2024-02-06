package com.hemram.foodDeliv_driver.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemram.foodDeliv_driver.service.DriverLocationService;

@RestController
@RequestMapping("/location")
public class DriverLocationController {

    @Autowired
    private DriverLocationService driverLocationService;

    //TODO: Business Logic

    @PutMapping
    public ResponseEntity updateDriverLocation() throws InterruptedException {

        int range = 20;
        while(range > 0) {
            driverLocationService.updateDriverLocation(range + ":" + Math.random());

            // Publish to Kafka every 1 Second
            Thread.sleep(1000); 
            range--;
        }

        return new ResponseEntity<>(Map.of("message", "Location Updated"), HttpStatus.OK);
    }

}
