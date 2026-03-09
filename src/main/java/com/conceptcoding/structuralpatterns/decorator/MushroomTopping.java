package com.conceptcoding.structuralpatterns.decorator;


// Step 4: Define the Concrete Decorators
public class MushroomTopping extends ToppingDecorator {

    public MushroomTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Mushroom";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 40;
    }
}
