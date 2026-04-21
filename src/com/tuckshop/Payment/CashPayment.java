package com.tuckshop.Payment;
class CashPayment extends PaymentMethod {

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() throws PaymentException{
        System.out.println("\nProcessing cash payment...");
        printReceipt();
    }
}
