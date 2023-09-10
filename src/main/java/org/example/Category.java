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
        for (Product produkt: products) {
            if (produkt.getName().equals(item.getName())) {
                products.remove(produkt);
            }
        }
    }








//    ArrayList<Product> products = new ArrayList<>();
//    Product product1 = new Product("jacket", 159, 4);
//    Product product2 = new Product("coat", 200, 3);
//    Product product3 = new Product("fur_coat", 459, 4);
//    Product product4 = new Product("shoes", 160, 4);
//    Product product5 = new Product( "sneakers", 59, 3);
//    Product product6 = new Product("sandals", 69, 5);
//    Product product7 = new Product("necklace", 359, 5);
//    Product product8 = new Product("watch", 259, 4);
//    Product product9 = new Product("gloves", 119, 5);
//    products.add(product1);
//        products.add(product2);
//        products.add(product3);
//        products.add(product4);
//        products.add(product5);
//        products.add(product6);
//        products.add(product7);
//        products.add(product8);
//        products.add(product9);
}
