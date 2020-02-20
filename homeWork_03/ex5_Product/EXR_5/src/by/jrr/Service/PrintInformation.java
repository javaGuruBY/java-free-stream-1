package by.jrr.Service;
import by.jrr.bean.Product;


public class PrintInformation {


    public void printInformation(Product product) {
        System.out.println("Product : " + "name = " + product.getName() + "," + " regular price = " + product.getRegularPrice() + " EUR," +
                " discount = " + product.getDiscount() + "%," + " actual price = " + (product.getRegularPrice() - (((product.getDiscount()) / 100) * product.getRegularPrice())) + " EUR");

    }
}
