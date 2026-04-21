package com.tuckshop.Payment;

class MobileWalletPayment extends PaymentMethod {
    private String phoneNumber;

    public MobileWalletPayment(double amount, String phoneNumber) {
        super(amount);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void processPayment() throws PaymentException{
        if (phoneNumber == null || phoneNumber.trim().length() < 7) {
            System.out.println("Invalid phone number.");
            return;
        }

        System.out.println("\nProcessing mobile payment...");
        System.out.println("Phone Number: " + phoneNumber);
        printReceipt();
    }
}

