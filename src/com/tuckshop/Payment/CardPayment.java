package com.tuckshop.Payment;
public class CardPayment extends PaymentMethod {
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
