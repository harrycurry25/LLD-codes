package com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.strategy;

public class SportsDrive implements DriveStrategy
{
    @Override
    public void drive() {
        System.out.println("Driving Capability: Sports");
    }
}
