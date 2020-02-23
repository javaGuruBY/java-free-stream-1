package by.jrr.exr4.Service;

import by.jrr.exr4.bean.Stock;

public class UpdaterPrice {
    private double newCost;

    public void setNewCost(double newCost) {
        this.newCost = newCost;
    }

    public void updaterPrice(Stock currentCost) {

        if (newCost > currentCost.getMaxCost()) {

            currentCost.setMaxCost(newCost);
            currentCost.setCurrentCost(newCost);

        } else if (newCost < currentCost.getMinCost()) {

            currentCost.setMinCost(newCost);
            currentCost.setCurrentCost(newCost);

        } else {
            currentCost.setMinCost(newCost);
            currentCost.setMaxCost(newCost);
            currentCost.setCurrentCost(newCost);
        }
    }

    public void printInformation(Stock company) {
        System.out.println("Company= " + company.getNameCompany() + ", " + "Current Price= " + company.getCurrentCost() +
                ", " + "Min Price= " + company.getMinCost() + ", " + "Max Price= " + company.getMaxCost());


    }
}