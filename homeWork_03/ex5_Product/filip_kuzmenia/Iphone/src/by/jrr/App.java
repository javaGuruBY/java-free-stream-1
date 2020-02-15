package by.jrr;

import by.jrr.service.RealPrice;
import by.jrr.bean.Product;

public class App  {
    public static void main(String[] args) {
        Product product1 = new Product("Iphone 11");
        RealPrice realPrice = new RealPrice();
            product1.setPrice(679.99);
            product1.setDiscount(20);
            realPrice.cost(product1);



    }
}
