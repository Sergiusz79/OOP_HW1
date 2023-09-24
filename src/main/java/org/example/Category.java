package org.example;

import lombok.Getter;

import java.util.Iterator;
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
        for (Product product : products) {
            if (product.getName().equals(item.getName())) {
                products.remove(product);
                System.out.println(product + " removed from the catalog.");
                System.out.println(" ");
            }
        }


    }
}
