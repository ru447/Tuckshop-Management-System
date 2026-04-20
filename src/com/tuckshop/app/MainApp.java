//packages 
package com.tuckshop.app;
//import packages of other classes 
import com.tuckshop.Menu;

public class MainApp {
    //initial setup by Tlotlo
    public static void main(String[]args){
       Menu menuList= new Menu();
       PaymentMethod payment= new PaymentMethod();
       
       //calling the displayMenu method 
       menuList.displayMenu();
    }
}
