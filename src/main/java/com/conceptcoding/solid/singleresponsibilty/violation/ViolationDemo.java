package com.conceptcoding.solid.singleresponsibilty.violation;

public class ViolationDemo {

    public static void main(String[] args) {

        Invoice invoice=new Invoice(new Marker("name","color",10,2026),10);

        invoice.calculateTotal();
        invoice.saveToDB();
        invoice.printInvoice();
    }
}
