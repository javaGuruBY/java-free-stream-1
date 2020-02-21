package by.jrr.tests;

import by.jrr.main_class.Stock;

public class StockTest {
    public static void main(String[] args) {
        StockTest testRunner = new StockTest();

        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    public void test1() {
        Stock victim = new Stock("Buggati", 1200);
        victim.updatePrice(1400);
        victim.updatePrice(1000);
        victim.updatePrice(1300);
        String expectedResult = "Company = \"Buggati\", Current Price = 1300, Min Price = 1000, Max Price = 1400";
        String actualResult = victim.printInforamtion();
        check(actualResult, expectedResult, "test1");
    }

    public void test2() {
        Stock victim = new Stock("Nescafe", 12);
        victim.updatePrice(14);
        victim.updatePrice(190);
        victim.updatePrice(13);
        String expectedResult = "Company = \"Nescafe\", Current Price = 13, Min Price = 12, Max Price = 190";
        String actualResult = victim.printInforamtion();
        check(actualResult, expectedResult, "test2");
    }

    public void test3() {
        Stock victim = new Stock("Tea", 11);
        victim.updatePrice(5);
        victim.updatePrice(7);
        victim.updatePrice(10);
        String expectedResult = "Company = \"Tea\", Current Price = 10, Min Price = 5, Max Price = 11";
        String actualResult = victim.printInforamtion();
        check(actualResult, expectedResult, "test3");
    }

    public void check(String actualResult, String expectedResult, String testName) {
        if(actualResult.equals(expectedResult)) {
            System.out.println(testName + " has passed!");
        }
        else {
            System.out.println(testName + " is failed!");
            System.out.println("Expected \"" + expectedResult + "\" but was \"" + actualResult + "\"");
        }
    }
}
