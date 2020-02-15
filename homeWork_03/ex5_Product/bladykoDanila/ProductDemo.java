package Product;

public class ProductDemo {
    public static void main(String[] args) {
        Product firstProduct = new Product("Ice cream", 4, 20);
        Product secondProduct = new Product("Tea", 3, 10);
        Product thirdProduct = new Product("Machine", 2000, 15);

        firstProduct.printInformation();
        secondProduct.printInformation();
        thirdProduct.printInformation();
    }
}
