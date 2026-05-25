package com.design_principles.single_responsibility_principle;

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

    public static void main(String[] args) {
        ShoppingCart s = new ShoppingCart();
        s.addToCart(new Product("fan", 2000));
        s.addToCart(new Product("nivea facewash", 300));
        s.addToCart(new Product("nivea body wash", 500));

        s.totalAmount();

        PrintInvoice print = new PrintInvoice();
        print.cartItemsPrinter(s);
        print.print();
    }
}

class PrintInvoice {
    ShoppingCart cart;

    public void cartItemsPrinter(ShoppingCart cart) {
        this.cart = cart;
    }

    public void print() {
        System.out.println("Cart Items:");
        System.out.println(" ============================= ");
        for (Product product : cart.getCartProducts()) {
            System.out.println(" || " + product.getProductName() + "        || " + product.getProductPrice() + " || ");
            System.out.println(" ----------------------------");
        }
        System.out.println("Total = " + cart.totalAmount());
    }
}
