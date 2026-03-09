package com.conceptcoding.structuralpatterns.decorator;

public class PlainPizza implements BasePizza{
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 200.0;
    }
}
