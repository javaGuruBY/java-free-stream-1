package by.jrr;

import by.jrr.service.RealPrice;
import by.jrr.bean.Product;

public class App  {
    public static void main(String[] args) {
        Product product1 = new Product("Vino");
        RealPrice realPrice = new RealPrice();
            product1.setPrice(215.15);
            product1.setDis(30);
            realPrice.cost(product1);



    }
}
