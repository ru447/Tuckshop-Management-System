package com.tuckshop;
    
public class Sales {
    private Product product;
    private int quantitySold;
    private String paymentMethod;

public Sale(Product product, int quantitySold, String paymentMethod) {
    this.product = product;
    this.quantitySold = quantitySold;
    this.paymentMethod = paymentMethod;
  }
}
