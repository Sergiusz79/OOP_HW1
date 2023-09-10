package org.example;

import lombok.Getter;


@Getter
public class Product {
    private String name;
    private int price;
    private int rating;

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String toString(){
        return "Product: " + getName() +
                " | Price: " + getPrice() + "$" +
                " | Rating: " + getRating() +"*";
    }

}
