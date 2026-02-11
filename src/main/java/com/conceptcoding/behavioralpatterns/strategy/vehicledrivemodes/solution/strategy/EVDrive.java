package com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.strategy;

// Concrete strategy for electric drive mode
public class EVDrive implements DriveStrategy{


    @Override
    public void drive() {
        System.out.println("Driving Capability: Electric");
    }
}
