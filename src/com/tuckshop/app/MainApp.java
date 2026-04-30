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
import com.tuckshop.Product;
import com.tuckshop.Sales;




public class MainApp {
    //main method 

    public static void main(String[]args){
        Checkout checkout = new Checkout();
        Menu menuList= new Menu();


        Sales sale = new Sales();
        sale.addProduct(new Product("Milk",12.50, 22));
        sale.addProduct(new Product("Bread",8.50, 2));
        //sales display method 
        sale.displaySales();

        

  
       
       //calling the displayMenu method 
       menuList.displayMenu();

       //testing phase 
       /* 
       double[] amounts = { 120.0, 900.0 };

        for (PaymentMethod m : methods) {
            for (double amount : amounts) {
                checkout.process(m, amount);
            }
        }

        System.out.println("Done.");
        */
    }
}
