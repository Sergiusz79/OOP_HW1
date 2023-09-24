package org.example;

import lombok.Getter;

@Getter
public class User {
    private final String login;
    private final String password;
    private final Basket userItems;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.userItems = new Basket();
    }

    public void addItem(Product product) {
        userItems.addToBasket(product);

    }

}
