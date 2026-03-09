package com.conceptcoding.structuralpatterns.decorator;

public class TandooriPaneerDelight implements BasePizza{
    @Override
    public String getDescription() {
        return "Tandoori Paneer Delight Pizza";
    }

    @Override
    public double getCost() {
        return 400.00;
    }
}
