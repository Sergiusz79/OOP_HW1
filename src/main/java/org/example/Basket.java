package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Basket {

    private List<Product> userBasketItems;

    public Basket() {
        this.userBasketItems = new ArrayList<>();
    }

    public void addToBasket(Product product) {
        userBasketItems.add(product);
        System.out.println(product + " added to basket.");
    }


}

