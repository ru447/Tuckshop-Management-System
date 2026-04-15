package com.tuckshop.app;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=================================");
        System.out.println(" Welcome! How Can We Help You?");
        System.out.println("=================================");

        boolean running = true;
        while (running) {
            printMainMenu();
            int choice = readInt("Enter choice: ");
            switch (choice) {
                case 1: viewProducts(); break;
                case 2: addProduct(); break;
                case 3: makeSale(); break;
                case 4: service.printSalesReport(); break;
                case 5: searchProduct(); break;
                case 0:
                    System.out.println("Goodbye! See you next time.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 0-5.");
            }
        }
    }

    private void printMainMenu() {
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. View all products");
        System.out.println("2. Add new product");
        System.out.println("3. Make a sale");
        System.out.println("4. View sales report");
        System.out.println("5. Search product");
        System.out.println("0. Exit");
    }


}
