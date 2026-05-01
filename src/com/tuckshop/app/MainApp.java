//packages 
package com.tuckshop.app;

import java.util.ArrayList;
import java.util.List;

//import packages of other classes 

import com.tuckshop.Menu;
import com.tuckshop.Payment.PaymentMethod;
import com.tuckshop.Payment.CashPayment;
import com.tuckshop.Payment.MobileWalletPayment;
import com.tuckshop.Payment.PaymentException;
import com.tuckshop.Payment.CardPayment;
import com.tuckshop.Product;
import com.tuckshop.Sales;




public class MainApp {
    //main method 

    public static void main(String[]args) throws PaymentException{
        Checkout checkout = new Checkout();
        Menu menuList= new Menu();


        List<PaymentMethod> paymentmethods =  new ArrayList<>();
        paymentmethods.add(new CardPayment(200.00, "202507215"));
        paymentmethods.add(new CashPayment(300.00));
        paymentmethods.add(new MobileWalletPayment(600.00, "72631214"));

         boolean[] ask = { false,false, true };

        for (PaymentMethod m : paymentmethods) {
            for (boolean asks : ask) {
                checkout.process(m, asks);
            }
        }

/* 
        Sales sale = new Sales();
        sale.addProduct(new Product("Milk",12.50, 22));
        sale.addProduct(new Product("Bread",8.50, 2));
        //sales display method 
        sale.displaySales();
        */

        

  
       
       //calling the displayMenu method 
       menuList.displayMenu();


    }
}
