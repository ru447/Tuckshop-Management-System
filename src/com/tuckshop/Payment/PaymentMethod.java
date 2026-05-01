//package
package com.tuckshop.Payment;

// Abstract class
public abstract class PaymentMethod {
    protected double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment() throws PaymentException;

    public abstract void printReceipt();

    public abstract void paid(boolean okay) throws PaymentException;

}