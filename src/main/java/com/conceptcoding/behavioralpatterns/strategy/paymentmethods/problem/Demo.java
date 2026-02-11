package com.conceptcoding.behavioralpatterns.strategy.paymentmethods.problem;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Payment Processor: Problem Demo");
        PaymentProcessor paymentProcessor=new PaymentProcessor();
        paymentProcessor.processPayment("credit_card",100);
        paymentProcessor.processPayment("paypal",200);
        paymentProcessor.processPayment("credit_card",300);
        paymentProcessor.processPayment("credit_card",400);


    }
}
