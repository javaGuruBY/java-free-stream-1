package Product;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public Product() {

    }

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public double actualPrice() {
        return regularPrice * (discount / 100);
    }

    public void printInformation() {
        System.out.println("Product : name = \"" + name + "\", regular price = " + regularPrice + " EUR, discount = " + discount + ", actual price = " + (regularPrice - actualPrice()) + " EUR");
    }


}
