package by.jrr.tests;

import by.jrr.detector.LightColorDetector;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest testRunner = new LightColorDetectorTest();

        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
        testRunner.test5();
        testRunner.test6();
        testRunner.test7();
    }

    public void test1() {
        LightColorDetector victim = new LightColorDetector();
        int a = 380;
        String expectedResult = "Violet";
        String actualResult = victim.detect(a);
        check(actualResult, expectedResult, "test1");
    }

    public void test2() {
        LightColorDetector victim = new LightColorDetector();
        int a = 494;
        String expectedResult = "Blue";
        String actualResult = victim.detect(a);
        check(actualResult, expectedResult, "test2");
    }

    public void test3() {
        LightColorDetector victim = new LightColorDetector();
        int a = 498;
        String expectedResult = "Green";
        String actualResult = victim.detect(a);
        check(actualResult, expectedResult, "test3");
    }

    public void test4() {
        LightColorDetector victim = new LightColorDetector();
        int a = 570;
        String expectedResult = "Yellow";
        String actualResult = victim.detect(a);
        check(actualResult, expectedResult, "test4");
    }

    public void test5() {
        LightColorDetector victim = new LightColorDetector();
        int a = 620;
        String expectedResult = "Red";
        String actualResult = victim.detect(a);
        check(actualResult, expectedResult, "test5");
    }

    public void test6() {
        LightColorDetector victim = new LightColorDetector();
        int a = 1024;
        String expectedResult = "Invisible Light";
        String actualResult = victim.detect(a);
        check(actualResult, expectedResult, "test6");
    }

    public void test7() {
        LightColorDetector victim = new LightColorDetector();
        int a = 5;
        String expectedResult = "Invisible Light";
        String actualResult = victim.detect(a);
        check(actualResult, expectedResult, "test7");
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