package com.javaguru.HomeWork4.hw4ex3;

public class LightColorDetectorTest {
    public void testColorDetector() {
        LightColorDetector newLightSource = new LightColorDetector();
        String expectedInvisibleLight =  "Invisible Light";
        String expectedViolet =  "Violet";
        String expectedBlue =  "Blue";
        String expectedGreen = "Green";
        String expectedYellow = "Yellow";
        String expectedOrange = "Orange";
        String expectedRed = "Red";
        String actualInvisibleLight = newLightSource.detect(325);
        String actualViolet = newLightSource.detect(385);
        String actualBlue = newLightSource.detect(453);
        String actualGreen = newLightSource.detect(500);
        String actualYellow = newLightSource.detect(580);
        String actualOrange = newLightSource.detect(600);
        String actualRed = newLightSource.detect(650);
        checkInvisible(expectedInvisibleLight, actualInvisibleLight, "testInvisibleLight");
        checkViolet(expectedViolet, actualViolet, "checkViolet");
        checkBlue(expectedBlue, actualBlue, "checkBlue");
        checkGreen(expectedGreen, actualGreen, "checkGreen");
        checkYellow(expectedYellow, actualYellow, "checkYellow");
        checkOrange(expectedOrange, actualOrange, "checkOrange");
        checkRed(expectedRed, actualRed, "checkRed");

    }
    public void checkInvisible(String expectedInvisibleLight, String actualInvisibleLight, String testName) {
        if (expectedInvisibleLight.equals(actualInvisibleLight)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedInvisibleLight + " but was " + actualInvisibleLight);
        }
    }
    public void checkViolet(String expectedViolet, String actualViolet, String testName) {
        if (expectedViolet.equals(actualViolet)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedViolet + " but was " + actualViolet);
        }
    }
    public void checkBlue(String expectedBlue, String actualBlue, String testName) {
        if (expectedBlue.equals(actualBlue)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedBlue + " but was " + actualBlue);
        }
    }
    public void checkGreen(String expectedGreen, String actualGreen, String testName) {
        if (expectedGreen.equals(actualGreen)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedGreen + " but was " + actualGreen);
        }
    }
    public void checkYellow(String expectedYellow, String actualYellow, String testName) {
        if (expectedYellow.equals(actualYellow)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedYellow + " but was " + actualYellow);
        }
    }
    public void checkOrange(String expectedOrange, String actualOrange, String testName) {
        if (expectedOrange.equals(actualOrange)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedOrange + " but was " + actualOrange);
        }
    }
    public void checkRed(String expectedRed, String actualRed, String testName) {
        if (expectedRed.equals(actualRed)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedRed + " but was " + actualRed);
        }
    }

    public static void main(String[] args) {
        LightColorDetectorTest testColorDetector = new LightColorDetectorTest();
        testColorDetector.testColorDetector();

    }
}
