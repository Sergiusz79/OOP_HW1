package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartPoint {
    public static void main(String[] args) {

        Product jacket = new Product("jacket", 159, 4);
        Product coat = new Product("coat", 200, 3);
        Product furCoat = new Product("furCoat", 459, 4);
        Product boots = new Product("boots", 160, 4);
        Product sneakers = new Product("sneakers", 59, 3);
        Product sandals = new Product("sandals", 69, 5);
        Product necklace = new Product("necklace", 359, 5);
        Product watch = new Product("watch", 259, 4);
        Product gloves = new Product("gloves", 119, 5);

        //Формирование каталога
        List<Product> outwears = List.of(jacket, coat, furCoat);
        List<Product> shoes = List.of(boots, sneakers, sandals);
        List<Product> accessories = List.of(necklace, watch, gloves);

//        List<Product> outwears = Arrays.asList(
//                new Product("jacket", 159, 4),
//                new Product("coat", 200, 3),
//                new Product("furCoat", 459, 4));
//        List<Product> shoes = Arrays.asList(
//                new Product("boots", 160, 4),
//                new Product("sneakers", 59, 3),
//                new Product("sandals", 69, 5));
//        List<Product> accessories = Arrays.asList(
//                new Product("necklace", 359, 5),
//                new Product("watch", 259, 4),
//                new Product("gloves", 119, 5));

        Category categoryOutwears = new Category("outwears");
        categoryOutwears.setProducts(outwears);
        Category categoryShoes = new Category("shoes");
        categoryShoes.setProducts(shoes);
        Category categoryAccessories = new Category("accessories");
        categoryAccessories.setProducts(accessories);

        // Каталог
        List<Category> catalog = new ArrayList<>();
        catalog.add(categoryOutwears);
        catalog.add(categoryShoes);
        catalog.add(categoryAccessories);


        System.out.println("-----------------//1 Catalog-------------------");
        printCatalog(catalog);

        //2 Покупка
        System.out.println("-----------------//2 Покупка-------------------");
        User user = new User("Mike7", "qwerty");
        System.out.println("user = " + user.getLogin());
        buyItem(user, categoryOutwears, coat);


        //3
        System.out.println("-----------------//3-------------------");
        printCatalog(catalog);
        printUserBusket(user);
    }


    private static void buyItem(User user, Category category, Product product) {
        System.out.println("----");
        user.addItem(product);
        System.out.println("addItem");
        System.out.println("-------");
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