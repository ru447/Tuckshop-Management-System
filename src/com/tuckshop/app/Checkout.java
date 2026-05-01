package com.tuckshop.app;

import com.tuckshop.Payment.PaymentException;
import com.tuckshop.Payment.PaymentMethod;

public class Checkout {

    public void process(PaymentMethod method, boolean ask) throws PaymentException {
        System.out.println("Checking out");
        try {
            method.paid(ask); 
            System.out.println("Success");
            } catch (PaymentException e){
                System.out.println("Failed");
            } finally {
            System.out.println("!!!!!");
        }
    }


}
