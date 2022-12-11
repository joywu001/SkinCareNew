package com.example.skincare;

public class BrandModel {
    String brand;
    String info;
    int image;

    public BrandModel(String brand, String info, int image) {
        this.brand = brand;
        this.info = info;
        this.image = image;
    }

    public void setImage(String brand) {
        this.brand = brand;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBrand() {
        return brand;
    }

    public String getInfo() {return info;}

    public int getImage() {
        return image;
    }

}
