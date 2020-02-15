package by.jrr;

public class Product {
    public String name;
    double regularPrice;
    double discount;

    public Product (String name){
        this.name = name;
    }
      double actualPrice() {
        return regularPrice - regularPrice*discount/100;
      }
      void printInformation(){
          System.out.println("Product : name = " + name + ", regular price = " + regularPrice + "EUR " + " , discount = " + discount + "%, actual price = " + actualPrice() + "EUR");
      }
}
