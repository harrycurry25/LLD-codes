package com.conceptcoding.structuralpatterns.decorator;

public class VeggiesTopping extends ToppingDecorator {

    public VeggiesTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Veggies";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30;
    }
}
