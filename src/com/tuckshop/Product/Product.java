package com.tuckshop.Product;
public class Product {
    private String itemName;
    private double unitPrice;
    private int quantity;

    public Product(String itemName,double unitPrice,int quantity){
        this.itemName=itemName;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }
    public void showDetails(){
        System.out.println("Name: " + itemName+" "+"Price: P"+unitPrice+" "+ "Quantity: "+ quantity);
    }
    
    public double getUnitPrice(){return unitPrice;}
    public String getItemName(){return itemName;}
    public int getQuantity(){return quantity;}
    
    public void reduceQuantity(int amount){this.quantity-=amount;}
}

