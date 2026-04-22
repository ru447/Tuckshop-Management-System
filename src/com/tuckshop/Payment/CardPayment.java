package com.tuckshop.Payment;
class CardPayment extends PaymentMethod {
    private String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() throws PaymentException {
        if (cardNumber == null || cardNumber.trim().length() < 4) {
            System.out.println("Invalid card number.");
            return;
        }

        System.out.println("\nProcessing card payment...");
        String lastDigits = cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Card Number: ****" + lastDigits);
        printReceipt();
    }
}
