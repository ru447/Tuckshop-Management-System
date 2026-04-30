package com.tuckshop;
import java.util.Scanner;

public class Menu{

  
        public void displayMenu(){
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
                break;
                 case 2:
                    System.out.println("\n------ADD NEW PRODUCT-------");
                     break;
                    
                    case 3:
                        System.out.println("\n------MAKE A SALE-------");
                        break;
                         case 4:
                        System.out.println("\n------VIEW SALES REPORT-------");
                        break;
                         case 5:
                        System.out.println("\n------SEARCH FOR A PRODUCT-------");
                        break;
             }

                } while (choice !=6);
            }
        }
        





