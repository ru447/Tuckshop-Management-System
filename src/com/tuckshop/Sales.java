package com.tuckshop;

import java.util.ArrayList; 

 public class Sales {
   
    private ArrayList <Product> products= new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }
    
    public void displaySales(){
        for(Product p: products){
            System.out.println(p.getItemName()+ "---"+p.getUnitPrice());
        }
    }
}
