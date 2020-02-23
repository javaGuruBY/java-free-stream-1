package by.jrr.exr4;

import by.jrr.exr4.bean.Stock;
import by.jrr.exr4.Service.UpdaterPrice;

public class App {
    public static void main(String[] args) {
        Stock google = new Stock("Roshen", 10.00);
        UpdaterPrice updaterPrice = new UpdaterPrice();

        updaterPrice.setNewCost(10);
        updaterPrice.updaterPrice(google);
        updaterPrice.setNewCost(12);
        updaterPrice.updaterPrice(google);
        updaterPrice.setNewCost(4);
        updaterPrice.updaterPrice(google);

        updaterPrice.printInformation(google);


    }
}
