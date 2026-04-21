package com.tuckshop.app;

import com.payment.PaymentException;
import com.payment.PaymentMethod;

public class Checkout {

    public void process(PaymentMethod method, double amount) {
        System.out.println("Checkout using " + method.getName());
        try {
            method.pay(amount);
            System.out.println("Status: SUCCESS");
        } catch (PaymentException e) {
            System.out.println("Status: FAILED");
            System.out.println("Reason: " + e.getMessage());
        } finally {
            System.out.println("!!!!!");
        }
    }


}
