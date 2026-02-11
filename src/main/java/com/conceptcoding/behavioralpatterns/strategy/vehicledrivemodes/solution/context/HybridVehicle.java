package com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.context;

import com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.strategy.DriveStrategy;

public class HybridVehicle extends Vehicle{
    public HybridVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
