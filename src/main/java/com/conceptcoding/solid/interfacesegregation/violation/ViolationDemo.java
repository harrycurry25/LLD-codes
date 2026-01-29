package com.conceptcoding.solid.interfacesegregation.violation;

public class ViolationDemo {

    public static void main(String[] args) {

        Waiter waiter=new Waiter();

        // Works fine
        waiter.takeOrder();
        waiter.serveFoodAndDrinks();

        // These will throw exceptions
        waiter.prepareFood();
        waiter.decideMenu();
        waiter.cleanTheKitchen();
    }
}
