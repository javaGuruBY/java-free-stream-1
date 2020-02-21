package com.javaguru.HomeWork4.hw4ex3;

public class LightColorDetectorTest {
    public void testColorDetectorShouldReturnInvisibleLight() {
        LightColorDetector newInvisibleLightSource = new LightColorDetector();
        String expectedInvisibleLight =  "Invisible Light";
             String actualInvisibleLight = newInvisibleLightSource.detect(325);
                checkColor(expectedInvisibleLight, actualInvisibleLight, "testColorDetectorShouldReturnInvisibleLight");
    }
    public void testColorDetectorShouldReturnViolet() {
        LightColorDetector newLightSource = new LightColorDetector();
           String expectedViolet =  "Violet";
                String actualViolet = newLightSource.detect(385);
        checkColor(expectedViolet, actualViolet, "testColorDetectorShouldReturnViolet");

    }
    public void testColorDetectorShouldReturnBlue() {
        LightColorDetector newLightSource = new LightColorDetector();
        String expectedBlue =  "Blue";
           String actualBlue = newLightSource.detect(453);
        checkColor(expectedBlue, actualBlue, "testColorDetectorShouldReturnBlue");

    }
    public void testColorDetectorShouldReturnGreen() {
        LightColorDetector newLightSource = new LightColorDetector();
           String expectedGreen = "Green";
            String actualGreen = newLightSource.detect(500);
        checkColor(expectedGreen, actualGreen, "testColorDetectorShouldReturnGreen");
    }
    public void testColorDetectorShouldReturnYellow() {
        LightColorDetector newLightSource = new LightColorDetector();
        String expectedYellow = "Yellow";
               String actualYellow = newLightSource.detect(580);
        checkColor(expectedYellow, actualYellow, "testColorDetectorShouldReturnYellow");
    }
    public void testColorDetectorShouldReturnOrange() {
        LightColorDetector newLightSource = new LightColorDetector();
        String expectedOrange = "Orange";
            String actualOrange = newLightSource.detect(600);
        checkColor(expectedOrange, actualOrange, "testColorDetectorShouldReturnOrange");

    }
    public void testColorDetectorShouldReturnRed() {
        LightColorDetector newLightSource = new LightColorDetector();
        String expectedRed = "Red";
            String actualRed = newLightSource.detect(650);
        checkColor(expectedRed, actualRed, "testColorDetectorShouldReturnRed");
    }
    public void checkColor(String expectedColor, String actualColor, String testName) {
        if (expectedColor.equals(actualColor)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedColor + " but was " + actualColor);
                    }
    }



    public static void main(String[] args) {
        LightColorDetectorTest testColorDetector = new LightColorDetectorTest();
        testColorDetector.testColorDetectorShouldReturnInvisibleLight();
        testColorDetector.testColorDetectorShouldReturnViolet();
        testColorDetector.testColorDetectorShouldReturnBlue();
        testColorDetector.testColorDetectorShouldReturnGreen();
        testColorDetector.testColorDetectorShouldReturnYellow();
        testColorDetector.testColorDetectorShouldReturnOrange();
        testColorDetector.testColorDetectorShouldReturnRed();

    }
}
