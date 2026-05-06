package com.Mock_Spring.project1.Service;

import com.Mock_Spring.project1.DTO.RideResponse;
import com.Mock_Spring.project1.Entity.Ride;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RideService {

    List<Ride> rideList= Arrays.asList(
            new Ride(1,200,true,60),
            new Ride(2,150,false,40),
            new Ride(3,300,true,80)

    );

    public RideResponse getSurgeRides(){

        List<Ride> surgeRides=rideList.stream()
        .filter(r->r.isPeakTime())
                .filter(r->r.getDemand()>50)
        .map(r->{r.setFare(r.getFare()*1.25);
        return r;}).toList();

        int totalRides=rideList.size();

        double totalFare=rideList.stream().mapToDouble(Ride::getFare).sum();

        return new RideResponse(totalRides,totalFare,surgeRides);
    }
}
