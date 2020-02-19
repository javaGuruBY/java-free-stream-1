package by.javaguru.bean;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public double actualPrice() {
        double actualPrice = regularPrice - (regularPrice * discount * 0.01);
        return actualPrice;
    }

    public void printInformation() {
        System.out.println(this.name + "\nRegular price: " + regularPrice + " rubles.");
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total discount: " + (regularPrice - actualPrice() + " rubles."));
        System.out.println("Price with duscount: " + this.actualPrice() + " rubles.\n");
    }

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }
}
