
public class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name,double price,int quantityt){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public void displayProduct(){
        System.out.println("Name: " + name + "Price: P"+ price + "Quantity: "quantity);
    }
    
    public double getPrice?(){return price;}
    public String getName(){return name;}
    public int getQuantity(){return quantity;}
    public void reduceQuantity(int amount){this.quantity-=amount;}
}
//FoodItem inherits from Product
class FoodItem extends Product{
    private String expiryDate;

    public FoodItem(String name,double price,int quantity,String expiryDate){
        super(name,price,quantity);
        this.expiryDate=expiryDate;
    }
    @Override
    public void displayProduct(){
        super.displayProduct();
        System.out.println("Type: Food| Expiry: "+ expiryDate);
    }
}
//DrinkItem inherits from Product
class DrinkItem extends Product{
    private int volumeML;

    public DrinkItem
    (String name,double price,int quantity,int volumeML){
        super(name,price,quantity);
        this.volumeML= volumeML;
    }

    @Override
    public void displayProduct(){
        super.displayProduct();
        System.out.println("Type: Drink Volume: "+ volumeML+"ml");
    }
}
