//packages 
package com.tuckshop.app;

import java.util.ArrayList;
import java.util.List;

//import packages of other classes 
import com.tuckshop.Menu;
import com.tuckshop.Payment.PaymentMethod;
import com.tuckshop.Payment.CashPayment;
import com.tuckshop.Payment.MobileWalletPayment;
import com.tuckshop.Payment.CardPayment;



public class MainApp {
    //main method 

    public static void main(String[]args){
        Checkout checkout = new Checkout();
        Menu menuList= new Menu();

   List<PaymentMethod> methods = new ArrayList<>();
        methods.add(new CashPayment(200.0));
        methods.add(new MobileWalletPayment(300.0, "72121314"));
        methods.add(new CardPayment(400.0, "202203947585"));
       
       //calling the displayMenu method 
       menuList.displayMenu(); // Omaatla please create displayMenu method in the Menu class 

       //testing phase 
       double[] amounts = { 120.0, 900.0 };

        for (PaymentMethod m : methods) {
            for (double amount : amounts) {
                checkout.process(m, amount);
            }
        }

        System.out.println("Done.");
    }
}
