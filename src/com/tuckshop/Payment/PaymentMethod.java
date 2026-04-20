//package
package com.tuckshop;

import java.util.Scanner;

// Abstract class
abstract class PaymentMethod {
    protected double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();

    public void printReceipt() {
        System.out.println("Payment successful.");
        System.out.printf("Amount paid: P%.2f%n", amount);
    }
}