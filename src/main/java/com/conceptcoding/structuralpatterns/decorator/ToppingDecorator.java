package com.conceptcoding.structuralpatterns.decorator;


//Step3: Define the Abstract Base Decorator
public abstract class ToppingDecorator implements BasePizza{
    BasePizza pizza;

    public ToppingDecorator(BasePizza basePizza)
    {
        this.pizza=basePizza;
    }

}
