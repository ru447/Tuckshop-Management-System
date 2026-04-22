<<<<<<< HEAD
package com.Tuckshop;

import java.util.ArrayList;
import java.util.Date;
import com.Tuckshop.Product;
import com.Tuckshop.PaymentMethod;
import com.Tuckshop.PaymentException;
=======
package com.tuckshop;

public class Sales {
        private Date saleDate;
        private ArrayList<Product> productsSold;
        private String saleId;
        private double totalAmount;
        private PaymentMethod paymentmethod;
        private boolean isPaid;
>>>>>>> 8371e99 (update)

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

    private double calculateTotal(ArrayList<Product> products){
        double total = 0.0;
        for (Product product : products){
            total += product.getPrice();
        }
        return total;
    }

    public void addProduct(Product product){
        productsSold. add(product);
        totalAmount += product. getPrice();
    }

    public void removeProduct(Product product){
        if (productsSold. remove (product)) {

            totalAmount -= product. getPrice();
        }
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
    
}
