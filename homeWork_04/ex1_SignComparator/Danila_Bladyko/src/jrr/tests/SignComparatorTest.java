package by.jrr.tests;


import by.jrr.comparator.SignComparator;

public class SignComparatorTest {
    public static void main(String[] args) {
        SignComparatorTest testRunner = new SignComparatorTest();

        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
    }

    public void test1() {
        SignComparator victim = new SignComparator();
        int a = 5;
        String expectedResult = "Number is positive";
        String actualResult = victim.compare(a);
        check(actualResult, expectedResult, "test1");
    }

    public void test2() {
        SignComparator victim = new SignComparator();
        int a = 0;
        String expectedResult = "Number is equal to zero";
        String actualResult = victim.compare(a);
        check(actualResult, expectedResult, "test2");
    }

    public void test3() {
        SignComparator victim = new SignComparator();
        int a = -5;
        String expectedResult = "Number is negative";
        String actualResult = victim.compare(a);
        check(actualResult, expectedResult, "test3");
    }

    public void test4() {
        SignComparator victim = new SignComparator();
        double a = 235.23;
        String expectedResult = "Number is positive";
        String actualResult = victim.compare(a);
        check(actualResult, expectedResult, "test4");
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
