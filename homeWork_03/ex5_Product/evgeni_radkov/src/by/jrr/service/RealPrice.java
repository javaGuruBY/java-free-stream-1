package by.jrr.service;

import by.jrr.bean.Product;

public class RealPrice {
    double actualPrice;
    public void cost(Product product){
        actualPrice=(product.getPrice()-(product.getPrice()*(product.getDiscount()/100)));
        System.out.println(product.getName()+" сейчас стоит "+actualPrice);
    }
}
