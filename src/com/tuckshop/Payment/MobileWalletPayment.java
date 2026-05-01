package com.tuckshop.Payment;

public class MobileWalletPayment extends PaymentMethod {
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
     
    }
    @Override
    public void printReceipt(){
    System.out.println("Payment successful.");
    System.out.printf("Amount paid: P%.2f%n", amount);
    }

    @Override
    public void paid(boolean okay) throws PaymentException {
        
        if(okay == true){
        throw new PaymentException("this customer paid");
    }
}
}

