package org.example;

import lombok.AllArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Basket {

    private List<Product> userBasketItems;

    public Basket() {
        this.userBasketItems = new ArrayList<>();
    }

    public void addToBasket(Product product) {
        userBasketItems.add(product);
    }

    public List<Product> getUserBasketItems() {
        return userBasketItems;
    }
}

