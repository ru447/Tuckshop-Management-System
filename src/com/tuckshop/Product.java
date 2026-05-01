package com.tuckshop;
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
        System.out.println("Name: " + itemName
                           + "Price: P"+ unitPrice
                           + "Quantity: "+ quantity);
    }
    
    public double getUnitPrice(){return unitPrice;}
    public String getItemName(){return itemName;}
    public int getQuantity(){return quantity;}
    
    public void reduceQuantity(int amount){this.quantity-=amount;}
}
//FoodItem inherits from Product
class FoodItem extends Product{
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
//DrinkItem inherits from Product
class DrinkItem extends Product{
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
