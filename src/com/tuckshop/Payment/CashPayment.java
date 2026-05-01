package com.tuckshop.Payment;
public class CashPayment extends PaymentMethod {

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() throws PaymentException{
        System.out.println("\nProcessing cash payment...");
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
