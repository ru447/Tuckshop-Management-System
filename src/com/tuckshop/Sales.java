package com.tuckshop;

import java.util.ArrayList; 

 public class Sales {
   
    private ArrayList <Product> products= new ArrayList<>();

<<<<<<< HEAD
    public Sales(ArrayList<Product> initialProducts, String saleId, PaymentMethod paymentMethod){
        this.saleId = saleId;
        this.saleDate = new Date();
        this.productsSold = new ArrayList<>(initialProducts);
        this.totalAmount = calculateTotal(initialProducts);
        this.paymentMethod = paymentMethod;
        this.isPaid = false;
=======
    public void addProduct(Product p){
        products.add(p);
>>>>>>> 60e1cfa76d0d8a62f73c24e29a1eac2ae481c126
    }
    
    public void displaySales(){
        for(Product p: products){
            System.out.println(p.getItemName()+ "---"+p.getUnitPrice());
        }
    }
<<<<<<< HEAD

    public void addProduct(Product product){
        productsSold. add(product);
        totalAmount += product. getPrice();
    }

    public void removeProduct(Product product){
        if (productsSold. remove (product)) {
            totalAmount -= product. getPrice();
            return true;
        }
        return false;
    }

    public void processPayment(PaymentMethod paymentMethod) throws PaymentException{
        if (totalAmount <= 0){
            throw new PaymentException ("Cannot process payment for zero amount");
            }
        this.paymentMethod = paymentMethod;
        this.isPaid = true;
    }

    public Date getSaleDate() {return saleDate;}

    public ArrayList<Product> getProductsSold() {return productsSold;}

    public String getSaleId() {return saleId;}

    public double getTotalAmount() {return totalAmount;}

    public PaymentMethod getPaymentMethod() {return paymentMethod;}

    public boolean isPaid() {return isPaid;}
    
=======
>>>>>>> 60e1cfa76d0d8a62f73c24e29a1eac2ae481c126
}
