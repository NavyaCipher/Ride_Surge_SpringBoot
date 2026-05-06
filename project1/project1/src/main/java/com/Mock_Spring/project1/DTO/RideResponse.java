package com.Mock_Spring.project1.DTO;

import com.Mock_Spring.project1.Entity.Ride;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RideResponse {

    private int totalRides;
    private double totalFare;
    List<Ride> surgeRides;
}
