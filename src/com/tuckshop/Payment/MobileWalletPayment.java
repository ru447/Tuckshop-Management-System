package com.tuckshop;
public class MobileWalletPayment / Mobile Payment
class MobilePayment extends PaymentMethod {
    private String phoneNumber;

    public MobilePayment(double amount, String phoneNumber) {
        super(amount);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void processPayment() {
        if (phoneNumber == null || phoneNumber.trim().length() < 7) {
            System.out.println("Invalid phone number.");
            return;
        }

        System.out.println("\nProcessing mobile payment...");
        System.out.println("Phone Number: " + phoneNumber);
        printReceipt();
    }
}

