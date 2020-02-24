package Product;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("fish");
        product.discont = 0.8;
        product.regularPrice = 20;
        product.printInformation();

    }
}
