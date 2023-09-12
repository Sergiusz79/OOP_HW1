package org.example;

import java.util.ArrayList;
import java.util.List;

public class StartPoint {
    public static void main(String[] args) {

        Product jacket = new Product("jacket", 159, 4);
        Product coat = new Product("coat", 200, 3);
        Product furCoat = new Product("furCoat", 459, 4);

        //Формирование каталога
        List<Product> outwears = List.of(jacket, coat, furCoat);
//        outwears.add(jacket);
//        outwears.add(coat);
//        outwears.add(furCoat);

        Category categoryOutwears = new Category("outwears");
        categoryOutwears.setProducts(outwears);

        // Каталог
        List<Category> catalog = new ArrayList<>();
        catalog.add(categoryOutwears);

        System.out.println("-----------------//1 Catalog-------------------");
        printCatalog(catalog);

        //2 Покупка
        System.out.println("-----------------//2 Покупка-------------------");
        User user = new User("Mike7", "qwerty");
        buyItem(user, categoryOutwears, coat);

        //3
        System.out.println("-----------------//3-------------------");
        printCatalog(catalog);
        printUserBusket(user);
    }


    private static void buyItem(User user, Category category, Product product) {
        user.addItem(product);
        category.removeItem(product);
    }

    private static void printCatalog(List<Category> catalog) {
        System.out.println("All Catalog Items");
        for (Category category: catalog) {
            System.out.println("Category: " + category.getName());
            for (Product product: category.getProducts()) {
                System.out.println(product.toString());
            }
        }
    }

    private static void printUserBusket(User user) {
        System.out.println("Print " + user.getLogin() + "'s basket");
        List<Product> userItems = user.getUserItems().getUserBasketItems();
        for (Product item: userItems) {
            System.out.println(item.toString());
        }
    }


}