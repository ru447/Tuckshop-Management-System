package com.tuckshop.Product;

//DrinkItem inherits from Product
public class DrinkItem extends Product{
    private int bottleSize;

    public DrinkItem
    (String itemName,double unitPrice,int quantity,int bottleSize){
        super(itemName,unitPrice,quantity);
        this.bottleSize= bottleSize;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Type: Drink ");
        System.out.println("Bottle size:" + bottleSize + "ml");
                           
    }
}

