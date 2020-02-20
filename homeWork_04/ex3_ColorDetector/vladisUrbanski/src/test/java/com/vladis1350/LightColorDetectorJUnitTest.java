package com.vladis1350;

import com.vladis1350.service.LightColorDetector;
import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorJUnitTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

    @Test
    public void test1() {
        String actualResult = lightColorDetector.detect(405);
        assertEquals("Violet", actualResult);
    }

    @Test
    public void test2() {
        String actualResult = lightColorDetector.detect(452);
        assertEquals("Blue", actualResult);
    }

    @Test
    public void test3() {
        String actualResult = lightColorDetector.detect(495);
        assertEquals("Green", actualResult);
    }

    @Test
    public void test4() {
        String actualResult = lightColorDetector.detect(589);
        assertEquals("Yellow", actualResult);
    }

    @Test
    public void test5() {
        String actualResult = lightColorDetector.detect(600);
        assertEquals("Orange", actualResult);
    }

    @Test
    public void test6() {
        String actualResult = lightColorDetector.detect(749);
        assertEquals("Red", actualResult);
    }

    @Test
    public void test7() {
        String actualResult = lightColorDetector.detect(250);
        assertEquals("Invisible Light", actualResult);
    }

    @Test
    public void test8() {
        String actualResult = lightColorDetector.detect(801);
        assertEquals("Invisible Light", actualResult);
    }
}
