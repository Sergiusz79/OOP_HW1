package org.example;

import java.util.ArrayList;
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


        List<Product> outwears = new ArrayList<>();
        outwears.add(jacket);
        outwears.add(coat);
        outwears.add(furCoat);
        List<Product> shoes = new ArrayList<>();
        shoes.add(boots);
        shoes.add(sneakers);
        shoes.add(sandals);
        List<Product> accessories = new ArrayList<>();
        accessories.add(necklace);
        accessories.add(watch);
        accessories.add(gloves);

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

        printCatalog(catalog);

        //2 Покупка
        User user = new User("Mike7", "qwerty");
        System.out.println("user = " + user.getLogin());
        buyItem(user, categoryShoes, sneakers);
        buyItem(user,categoryAccessories, watch);

        //3 Итог
        printCatalog(catalog);
        printUserBasket(user);
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
        System.out.println(" ");
    }

    private static void printUserBasket(User user) {
        System.out.println("Products in " + user.getLogin() + "'s basket:");
        List<Product> userItems = user.getUserItems().getUserBasketItems();
        for (Product item: userItems) {
            System.out.println(item.toString());
        }
        System.out.println(" ");
    }


}