package com.boomi.designpattrens.strategy.strategies;

public interface PaymentStrategy {

    void collectPaymentDetails();

    boolean validatePaymentDetails();

    void pay(int amount);

}