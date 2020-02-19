package by.javaguru.service;

import by.javaguru.bean.Product;

public class ProductDemo {
    public static void main(String[] args) {
        Product pizza = new Product("Pizza", 15, 30);
        Product drink = new Product("Drink", 10, 10);
        Product cake = new Product("Cake", 5,5);
        Product tea = new Product("Tea", 2, 0);
        Product backpack = new Product("Backpack", 120, 45);
        pizza.printInformation();
        drink.printInformation();
        cake.printInformation();
        tea.printInformation();
        backpack.printInformation();
    }
}
