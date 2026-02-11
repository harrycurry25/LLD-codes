package com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.context;

import com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.strategy.DriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
