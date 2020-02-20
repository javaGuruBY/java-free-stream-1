package ex3_ColorDetector;

import java.sql.SQLOutput;

public class LightColorDetectorTest {
    public void testItSelf() {
        LightColorDetector checkActualResult = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = checkActualResult.detect(400);
        checkMe(expectedResult, actualResult);
    }

    public void checkMe(String expectedResult, String actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("Self-test passed");
        } else {
            System.out.println("Self-test failed!");
        }
    }
}
