package by.jrr;

import by.jrr.bean.Product;
import by.jrr.Service.PrintInformation;

public class App {
    public static void main(String[] args){
        Product product=new Product();
        product.setName("Milk");
        product.setRegularPrice(0.8);
        product.setDiscount(20.00);
        PrintInformation printInformation=new PrintInformation();
        printInformation.printInformation(product);


    }
}
