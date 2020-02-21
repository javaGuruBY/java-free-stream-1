package Stock;

public class Stock {
    String name;
    double price;
    double priceMin = 1;
    double priceMax = 5;

    public void updatePrice(double newPrice)  {
        price = newPrice;
        if (price <= priceMin) {
            priceMin = price;
        } else if (price >= priceMax){
            priceMax = price;
        }
    }

    public void printInformation() {
        System.out.println("Actual price = " + price);
        System.out.println("Max price = " + priceMax);
        System.out.println("Min price = " + priceMin);

    }

}
