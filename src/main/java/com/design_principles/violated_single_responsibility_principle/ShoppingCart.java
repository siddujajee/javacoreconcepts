package com.design_principles.violated_single_responsibility_principle;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> productsList = new ArrayList<Product>();

    public void addToCart(Product product) {
        productsList.add(product);
    }

    public ArrayList<Product> getCartProducts() {
        return productsList;
    }

    public double totalAmount() {
        double sum = 0.0;

        for (Product p : productsList) {
            sum += p.getProductPrice();
        }

        return sum;
    }

    public void printInvoice() {
        System.out.println("Cart Items:");
        System.out.println(" ============================= ");
        for (Product product : productsList) {
            System.out.println(" || " + product.getProductName() + "        || " + product.getProductPrice() + " || ");
            System.out.println(" ----------------------------");
        }
        System.out.println("Total = " + totalAmount());
    }

    public static void main(String[] args) {
        ShoppingCart s = new ShoppingCart();
        s.addToCart(new Product("fan", 2000));
        s.addToCart(new Product("nivea face wash", 300));
        s.addToCart(new Product("nivea body wash", 500));

        s.totalAmount();
        s.printInvoice();
    }
}
