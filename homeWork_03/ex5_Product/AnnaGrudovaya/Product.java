package Product;

public class Product {
    String name;
    double regularPrice;
    double discont;
    double result;

     double actualPrice(){
        result = regularPrice - (regularPrice*discont) / 100 ;
        return result;

    }
    void printInformation(){
        System.out.println("name = "+name + " regularPrice = "+ regularPrice + " discont = " + discont + " actualPrice = " + actualPrice());
    }

    public Product(String name) {
        this.name = name;
    }
}
