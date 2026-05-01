package com.tuckshop;

import java.util.ArrayList;
import java.util.Date;
import com.tuckshop.Product;
import com.tuckshop.Payment.PaymentMethod;
import com.tuckshop.Payment.PaymentException;

 public class Sales {
    private Date saleDate;
    private ArrayList<Product> productsSold;
    private String saleId;
    private double totalAmount;
    private PaymentMethod paymentMethod;
    private boolean isPaid;

    public Sales(ArrayList<Product> initialProducts, String saleId, PaymentMethod paymentMethod){
        this.saleId = saleId;
        this.saleDate = new Date();
        this.productsSold = new ArrayList<>(initialProducts);
        this.totalAmount = calculateTotal(initialProducts);
        this.paymentMethod = paymentMethod;
        this.isPaid = (paymentMethod != null);
    }

    public Sales(String saleId) {
        this.saleId = saleId;
        this.saleDate = new Date();
        this.productsSold = new ArrayList<>();
        this.totalAmount = 0.0;
        this.paymentMethod = null;
        this.isPaid = false;    
    }

    private double calculateTotal(ArrayList<Product> products){
        double total = 0.0;
        for (Product product : products){
            total += product.getUnitPrice();
        }
        return total;
    }

    public void addProduct(Product product){
        if product == null) {
            System.out.println("Cannot add null product");
            return;
        }
        if (product.getQuantity() <= 0) {
            System.out.println(product.getItemName() + " is out of stock");
            return; 
        }
        productsSold. add(product);
        totalAmount += product.getUnitPrice();
        product.reduceQuantity(1);
        System.out.println(product.getItemName() + " added to sale.");
    }

    public void removeProduct(Product product){
        if (product == null) {
            System.out.println("Cannot remove null product");
            return;
        }
        if (productsSold. remove (product)) {
            totalAmount -= product. getUnitPrice();
            System.out.println(product.getItemName() + " removed from sale.");
        } else {
            System.out.println(product.getItemName() + " not found in this sale.");
        }
    }

    public void processPayment(PaymentMethod paymentMethod) throws PaymentException{
        if (totalAmount <= 0){
            throw new PaymentException ("Cannot process payment for zero amount");
            }
            if (productsSold.isEmpty()) {
                throw new PaymentException("No products in sale to process payment");
            }
            if (paymentMethod == null) {
                throw new PaymentException("Payment method cannot be null");
            }
        this.paymentMethod = paymentMethod;
        this.isPaid = true;
        System.out.println("Payment processed successfully for Sale " + saleId);
    }

    public Date getSaleDate()                   {return saleDate;}

    public ArrayList<Product> getProductsSold() {return productsSold;}

    public String getSaleId()                   {return saleId;}

    public double getTotalAmount()              {return totalAmount;}

    public PaymentMethod getPaymentMethod()     {return paymentMethod;}

    public boolean isPaid()                     {return isPaid;}
    
    @Override
    public String toString() {
        return "Sale ID: " + saleId
        + " | Date: " + saleDate 
        + " | Total: P" + String.format("%.2f", totalAmount)
        + " | " (isPaid ? "Paid" : "Unpaid");
    }
}
