package malashchonakHw4Ex4;


public class Stock {
    String name;
    double currentPrice;
    double minPrice;
    double maxPrice;

    public Stock(String name, double currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;

    }


    public void updatePrice(double newPrice) {
        currentPrice = newPrice;

        if (currentPrice <= minPrice) {
            minPrice = currentPrice;
        } else if (currentPrice >= maxPrice) {
            maxPrice = currentPrice;
        }
    }

    public void printInformation() {
        System.out.println("Company = " + this.name + " Current Price = " + this.currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice);
    }

}