package com.conceptcoding.structuralpatterns.decorator;

public class Farmhouse implements BasePizza{
    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }

    @Override
    public double getCost() {
        return 300.0;
    }
}
