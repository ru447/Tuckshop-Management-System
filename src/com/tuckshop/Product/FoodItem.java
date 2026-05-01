package com.tuckshop.Product;

    //FoodItem inherits from Product
public class FoodItem extends Product{
    private String bestBefore;

    public FoodItem(String itemName,double unitPrice,int quantity,String bestBefore){
        super(itemName,unitPrice,quantity);
        this.bestBefore=bestBefore;
    }
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Type: Food item");
        System.out.println("Best Before: "+ bestBefore);
    }
}

