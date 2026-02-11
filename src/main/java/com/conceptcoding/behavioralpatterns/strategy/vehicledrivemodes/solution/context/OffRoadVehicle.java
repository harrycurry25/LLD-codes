package com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.context;

import com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.strategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
