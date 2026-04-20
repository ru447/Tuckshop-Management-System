package com.tuckshop;
class CashPayment extends PaymentMethod {

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("\nProcessing cash payment...");
        printReceipt();
    }
}
