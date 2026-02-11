package com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.context;


import com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.strategy.DriveStrategy;

//extends context subclass
public class SportsVehicle extends Vehicle{


    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
