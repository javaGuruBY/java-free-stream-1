package by.jrr;

public class ProductDemo {
    public static void main(String[] args) {
        Product newProduct = new Product("Meat");
           newProduct.regularPrice = 15;
           newProduct.discount = 25;
           newProduct.actualPrice();
           newProduct.printInformation();

    }
}
