package by.jrr.exr4.bean;

import by.jrr.exr4.Test.StockTest;

public class Stock {
    private String nameCompany;
    private double currentCost;
    private double minCost;
    private double maxCost;
    private double inputCost;

    public Stock(String nameCompany, double currentCost) {
        this.nameCompany = nameCompany;
        this.currentCost = currentCost;
        this.maxCost = currentCost;
        this.minCost =currentCost;
    }


    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public double getCurrentCost() {
        return currentCost;
    }

    public void setCurrentCost(double currentCost) {
        this.currentCost = currentCost;
    }

    public double getMinCost() {
        return minCost;
    }

    public void setMinCost(double minCost) {
        this.minCost = minCost;
    }

    public double getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(double MaxCost) {
        this.maxCost = maxCost;
    }




        }
