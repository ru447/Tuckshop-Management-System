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

// Cash Payment
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

// Card Payment
class CardPayment extends PaymentMethod {
    private String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
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

// Mobile Payment
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

// Main class
public class PaymentSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amount;

        // Safe amount input
        System.out.print("Enter amount: ");
        if (scanner.hasNextDouble()) {
            amount = scanner.nextDouble();
            scanner.nextLine(); // clear buffer
        } else {
            System.out.println("Invalid amount entered.");
            return;
        }

        // Menu
        System.out.println("\nChoose payment method:");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. Mobile");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid choice.");
            return;
        }

        int choice = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        PaymentMethod payment;

        switch (choice) {
            case 1:
                payment = new CashPayment(amount);
                break;

            case 2:
                System.out.print("Enter card number: ");
                String card = scanner.nextLine();

                if (card.trim().isEmpty()) {
                    System.out.println("Card number cannot be empty.");
                    return;
                }

                payment = new CardPayment(amount, card);
                break;

            case 3:
                System.out.print("Enter phone number: ");
                String phone = scanner.nextLine();

                if (phone.trim().isEmpty()) {
                    System.out.println("Phone number cannot be empty.");
                    return;
                }

                payment = new MobilePayment(amount, phone);
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Process payment (polymorphism)
        payment.processPayment();
    }
}