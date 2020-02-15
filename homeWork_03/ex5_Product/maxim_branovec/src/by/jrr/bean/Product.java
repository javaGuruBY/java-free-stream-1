package by.jrr.bean;

public class Product {
    private String name;
    private double price;
    private double dis;



    public Product(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDis() {
        return dis;
    }

    public void setDis(double dis) {
        this.dis = dis;
    }


    public String getName() {
        return name;
    }
}


