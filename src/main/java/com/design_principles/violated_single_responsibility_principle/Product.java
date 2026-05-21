package com.design_principles.violated_single_responsibility_principle;

public class Product {
    private String name;
    private int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getProductName() {
        return name;
    }

    public int getProductPrice() {
        return price;
    }
}
