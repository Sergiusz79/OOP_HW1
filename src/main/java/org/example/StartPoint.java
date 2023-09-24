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
        User user1 = new User("Mike", "qwerty");
        User user2 = new User("Din", "qwerty1");
        User user3 = new User("Sam", "qwerty2");
        System.out.println("user = " + user1.getLogin());
        buyItem(user1, categoryShoes, sneakers);
        buyItem(user1, categoryAccessories, watch);
        System.out.println("user = " + user2.getLogin());
        buyItem(user2, categoryShoes, boots);
        buyItem(user2,categoryOutwears, jacket);
        System.out.println("user = " + user3.getLogin());
        buyItem(user3, categoryOutwears, coat);
        buyItem(user3, categoryAccessories, gloves);

        //3 Итог
        printCatalog(catalog);
        printUserBasket(user1);
        printUserBasket(user2);
        printUserBasket(user3);
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