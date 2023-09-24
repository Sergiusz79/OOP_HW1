package org.example;

import lombok.Getter;


import java.util.List;

@Getter
public class Category {

    private final String name;
    private List<Product> products;

    public Category(String name) {
        this.name = name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void removeItem(Product item) {
                boolean result = products.remove(item);
                if (result) {
                    System.out.println(item + " removed from the catalog.");
                }
                System.out.println(" ");
        }





}
