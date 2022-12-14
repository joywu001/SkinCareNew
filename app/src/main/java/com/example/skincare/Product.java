package com.example.skincare;

public class Product {
    private String name, brand, price;

    public Product(String name, String brand, String price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(String price) {
        this.price = price;
    }

   }
