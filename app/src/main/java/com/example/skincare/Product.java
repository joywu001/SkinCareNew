package com.example.skincare;

public class Product {
    private String name, brand, price, link;

    public Product(String name,String brand, String price, String link) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.link = link;
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

    public String getLink() {
        return link;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.link = brand;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
