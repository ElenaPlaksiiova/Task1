package com.jdbc;

/**
 * Created by Elena on 08.06.2016.
 */
public class Product {

    private int id;
    private String name;
    private double price;
    private int shopID;

    public Product() {}
    public Product (int id, String name, double price, int shopID) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.shopID = shopID;
    }

    @Override
    public String toString() {
        return "Product: [" + id + "\t" + name + "\t" + price + "\t" + shopID;
    }
}
