package com.Mock_Spring.project1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ride {

    @Id
    private int id;
    private double fare;
    private boolean peakTime;
    private int demand;

    public int getId() {
        return id;
    }

    public double getFare() {
        return fare;
    }

    public boolean isPeakTime() {
        return peakTime;
    }

    public int getDemand() {
        return demand;
    }
}
