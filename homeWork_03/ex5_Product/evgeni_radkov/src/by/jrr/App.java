package by.jrr;

import by.jrr.service.RealPrice;
import by.jrr.bean.Product;

public class App  {
    public static void main(String[] args) {
        Product product1 = new Product("Курсы JAVA в JAVAGURU");
        RealPrice realPrice = new RealPrice();
            product1.setPrice(1800);
            product1.setDiscount(40);
            realPrice.cost(product1);



    }
}
