package com.hemram.foodDeliv_driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.hemram.foodDeliv_driver.constant.AppConstant;

@Service
public class DriverLocationService {
    
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateDriverLocation(String Location){
        kafkaTemplate.send(AppConstant.DRIVER_LOCATION, Location);
        return true;
    }
}
