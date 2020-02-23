package malashchonakHw4Ex4;

public class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        google.printInformation();
        google.updatePrice((double) 15);
        google.updatePrice((double) 7);
        google.updatePrice((double) 14);
        google.printInformation();
    }
}
