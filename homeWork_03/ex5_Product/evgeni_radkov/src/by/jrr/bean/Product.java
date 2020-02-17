package by.jrr.bean;

public class Product {
  private   String name;
  private   double price;
  private   double discount;




    public Product(String name) {
        this.name = name;}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }
}


