package by.jrr.main_class;

public class Stock {
    String nameOfTheCompany;
    int fairValue;
    int minCost;
    int maxCost;

    public Stock() {

    }

    public Stock(String nameOfTheCompany, int fairValue) {
        this.nameOfTheCompany = nameOfTheCompany;
        this.fairValue = fairValue;
        this.maxCost = fairValue;
        this.minCost = fairValue;
    }

    public void updatePrice(int a) {
        this.fairValue = a;
        this.minCost = Min(this.minCost, a);
        this.maxCost = Max(this.maxCost, a);
    }

    public String printInforamtion() {
        return ("Company = \"" + this.nameOfTheCompany + "\", Current Price = " + this.fairValue + ", Min Price = " + this.minCost + ", Max Price = " + this.maxCost);
    }

    public int Max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public int Min(int a, int b) {
        if(a < b) {
            return a;
        }
        else {
            return b;
        }
    }
}
