package com.example.skincare;

public class Product {
    private String name, brand, positioning;

    public Product(String name, String brand, String positioning) {
        this.name = name;
        this.brand = brand;
        this.positioning = positioning;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
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

    public void setPositioning(String positioning) {
        this.positioning = positioning;
    }
}
