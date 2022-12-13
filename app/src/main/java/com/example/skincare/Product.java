package com.example.skincare;

public class Product {
    private String name, brand, price, positioning;

    public Product(String name, String brand, String price, String positioning) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.positioning = positioning;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getPrice() {
        return price;
    }

    public String getPositioning() {
        return positioning;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPositioning(String positioning) {
        this.positioning = positioning;
    }
}
