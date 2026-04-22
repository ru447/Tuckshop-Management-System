package src.com.tuckshop;

import src.com.tuckshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args){

        ArrayList<Product> product = new ArrayList<>();
        ArrayList<Sale> sales = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("*******************************************");
        System.out.println("     Welcome! How Can We Help You?");
        System.out.println("*******************************************");

        do{
            System.out.println("\n------MAIN MENU------");
            System.out.println("1. View All Products");
            System.out.println("2. Add New Product");
            System.out.println("3. Make A Sale");
            System.out.println("4. View Sales Report");
            System.out.println("5. Search For A Product");
            System.out.println("6. Exit");
            System.out.println("Enter choice (1-6)");

            choice = scanner.nextInt();
            scanner.nextLine();

             switch(choice){
                 case 1:
                     System.out.println("\n------STOCK LIST-------");
                     if(products.isEmpty()){
                         System.out.println("No Products Available");
                     }else {
                         for(int i = 0; i < products.size(); i++){
                             System.out.println((i + 1) + "." + products.get(i));
                         }
                         System.out.println("Total No Of Products:  " + products.size());
                     }
                     break;
                 case 2:

                     break;

                     
             }
        }
    }
}




