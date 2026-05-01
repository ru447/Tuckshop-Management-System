package com.tuckshop;

import com.tuckshop.app.Checkout;
import com.tuckshop.Payment.CardPayment;
import com.tuckshop.Payment.CashPayment;
import com.tuckshop.Payment.MobileWalletPayment;
import com.tuckshop.Payment.PaymentException;
import com.tuckshop.Payment.PaymentMethod;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
       private ArrayList<Product> product = new ArrayList<>();
       private ArrayList<Sale> sales = new ArrayList<>();
       private Checkout checkout = new Checkout();
        
    public void displayMenu(){

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("*******************************************");
        System.out.println("     Welcome! How Can We Help You?");
        System.out.println("*******************************************");

        do{
            System.out.println("\n------MAIN MENU------");
            System.out.println("1. View All Products");
            System.out.println("2. New Product");
            System.out.println("3. Make A Sale");
            System.out.println("4. Exit");
            System.out.println("Enter choice (1-4)");
             if(!scanner.hasNextInt()){
                System.out.println("Invalid Choice");
                scanner.nextLine();
                continue;
             }

            choice = scanner.nextInt();
            scanner.nextLine();

             switch(choice){
                 case 1:
                     System.out.println("\n------STOCK LIST-------");
                break;
                 case 2:
                    System.out.println("\n-----ADD PRODUCT-----");
                    System.out.println("1. Food Item");
                    System.out.println("2. Drink Item");
                    System.out.println("Choose product type");

                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter Product Name");
                    String name = scanner.nextLine();

                    System.out.println("Enter price");
                    double price = scanner.nextDouble();

                    System.out.println("Enter Quantity");
                    int quantity = scanner.nextInt();

                    if(type == 1){
                        System.out.println("Enter expiry date");
                        String expiryDate = scanner.nextLine();
                        products.add(new FoodItem(name, price, quantity, expiryDate));
                        System.out.println("Food Product Added");
                    }else if(type == 2){
                        System.out.println("Enter Volume in ml");
                        int volumeML = scanner.nextInt();
                        products(new DrinkItem(name, price, quantity, volumeML));
                        System.out.println("Drink Product Added");
                    }else{
                        System.out.println("Invalid Product Type");
                    }
                     break;

                case 3:
                    System.out.println("\n-------MAKE A SALE------");
                    if(products.isEmpty()){
                         System.out.println("No Products Available");
                     }else {
                         for(int i = 0; i < products.size(); i++){
                             System.out.println((i + 1) + "." + products.get(i));
                         }
                     }
                    System.out.println("Choose product number");
                    int productNumber = scanner.nextInt();
                    
                    System.out.println("Enter the quantity");
                    int saleQuantity = scanner.nextInt();

                    Product product = products.get(productNumber - 1);

                    System.out.println("Choose payment method");
                    System.out.println("1. Cash");
                    System.out.println("2. Mobile Wallet");
                    System.out.println("3. Swipe Card");

                    int paymentChoice = scanner.nextInt();
                    scanner.nextLine();

                    PaymentMethod paymentMethod = null;

                    if(paymentChoice == 1){
                        paymentMethod = new CashPayment(0);
                    }else if(paymentChoice == 2){
                        System.out.println("Enter phone number");
                        String phoneNumber = scanner.nextLine();
                        paymentMethod = new MobileWalletPayment(0, phoneNumberNumber);
                    }else if(paymentChoice == 3){
                        System.out.println("Enter card number");
                        String cardNumber = scanner.nextLine();
                        paymentMethod = new CardPayment(0, cardNumber);
                    }else{
                        System.out.println("Invalid Payment Method");
                        break;
                    }
                    Sales sale = new Sales("Sale :  " + saleNumber, product, saleQuantity, paymentMethod);

                    try{
                        checkout.process(paymentMethod, sale.getTotalAmount());
                        sale.markAsPaid();
                        product.reduceQuantity(saleQuantity);
                        sale.add(sale);
                        System.out.println("Sale Recorded ");
                    }catch(PaymentException e){
                        System.out.println("Payment Failed : " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Exiting Menu!!");
                    break;

                     
             }
        }while(choice != 4);
    }
}




