package com.dicoding.dicodingsubmission.Object;

public class Skincare {
    private String name, price, quantity, desc, image;
    private int rating;

    public Skincare(){

    }

    public Skincare(String name, String price, String quantity, String desc, String image, int rating) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.desc = desc;
        this.image = image;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
