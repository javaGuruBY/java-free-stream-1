package com.vladis1350;

import com.vladis1350.service.LightColorDetector;

public class LightColorDetectorTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {
        LightColorDetectorTest colorDetectorTest = new LightColorDetectorTest();
        colorDetectorTest.test1();
        colorDetectorTest.test2();
        colorDetectorTest.test3();
        colorDetectorTest.test4();
        colorDetectorTest.test5();
        colorDetectorTest.test6();
        colorDetectorTest.test7();
        colorDetectorTest.test8();

    }

    public void test1() {
        String description = "Should say violet color";
        String actualResult = lightColorDetector.detect(380);
        tellMeTruth("Violet", actualResult, description);
    }

    public void test2() {
        String description = "Should say blue color";
        String actualResult = lightColorDetector.detect(494);
        tellMeTruth("Blue", actualResult, description);
    }

    public void test3() {
        String description = "Should say green color";
        String actualResult = lightColorDetector.detect(505);
        tellMeTruth("Green", actualResult, description);
    }

    public void test4() {
        String description = "Should say yellow color";
        String actualResult = lightColorDetector.detect(581);
        tellMeTruth("Yellow", actualResult, description);
    }

    public void test5() {
        String description = "Should say orange color";
        String actualResult = lightColorDetector.detect(599);
        tellMeTruth("Orange", actualResult, description);
    }

    public void test6() {
        String description = "Should say red color";
        String actualResult = lightColorDetector.detect(749);
        tellMeTruth("Red", actualResult, description);
    }

    public void test7() {
        String description = "Should say Invisible Light";
        String actualResult = lightColorDetector.detect(215);
        tellMeTruth("Invisible Light", actualResult, description);
    }

    public void test8() {
        String description = "Should say Invisible Light";
        String actualResult = lightColorDetector.detect(916);
        tellMeTruth("Invisible Light", actualResult, description);
    }

    public void tellMeTruth(String expected, String actual, String description){
        if (expected.equals(actual)) {
            System.out.println(description + " has passed!");
        } else {
            System.out.println(description + " has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
