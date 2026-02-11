package com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.strategy;

// Concrete strategy for normal drive mode
public class NormalDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Driving Capability: Normal");
    }
}
