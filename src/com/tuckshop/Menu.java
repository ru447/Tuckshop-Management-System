//package
package com.tuckshop;

import java.util.Scanner;
//this class is for the menu loop 
public class Menu {
   //type you code for menu here 

   

    public void displayMenu(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 1. Show Tuckshop Products   2.Exit ");
        int number= in.nextInt();
        //pre conditions 
        int count= 0;
        do{
            
            switch(number){
                case 1: 
                    System.out.println("Sweets");
                    System.out.println("Soft drinks");
                    System.out.println("biscuits");
                    System.out.println("chips");
                    break;
                case 2:
                    System.out.println("thank you and come again next time");
                    break;
               default:
                  System.out.println("Please enter a valid option");
                    
            }
            
            count++;
        } while(count!=1);
        
    }

}

