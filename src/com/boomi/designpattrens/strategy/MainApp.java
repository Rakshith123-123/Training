package com.boomi.designpattrens.strategy;

import com.boomi.designpattrens.strategy.strategies.PaymentByCreditCard;
import com.boomi.designpattrens.strategy.strategies.PaymentByPayPal;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/Nrwj3gZiuJU
     */
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        // The strategy can now be easily picked at runtime

        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);

        System.out.println("==========================================");

        paymentService.setStrategy(new PaymentByPayPal());
        paymentService.processOrder(100);

    }

}
