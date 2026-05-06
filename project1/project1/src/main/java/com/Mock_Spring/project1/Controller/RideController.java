package com.Mock_Spring.project1.Controller;

import com.Mock_Spring.project1.DTO.RideResponse;
import com.Mock_Spring.project1.Service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rides")
public class RideController {

    @Autowired
    RideService rideService;

    @GetMapping("/surge")
    public RideResponse getRidesSurge(){
        return rideService.getSurgeRides();
    }
}
