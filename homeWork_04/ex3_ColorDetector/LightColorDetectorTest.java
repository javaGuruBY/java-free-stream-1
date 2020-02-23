package ex3_ColorDetector;

public class LightColorDetectorTest {
    LightColorDetector light = new LightColorDetector();

    public void testItSelf() {
        testItSelfViolet();
        testItSelfBlue();
        testItSelfGreen();
        testItSelfYellow();
        testItSelfRed();
        testItSelfInvisible();

    }

    public void testItSelfViolet() {
        String expectedResult = "Violet";
        String actualResult = light.detect(380);
        checkMe(expectedResult, actualResult);
    }

    public void testItSelfBlue() {
        String expectedResult = "Blue";
        String actualResult = light.detect(450);
        checkMe(expectedResult, actualResult);
    }

    public void testItSelfGreen() {
        String expectedResult = "Green";
        String actualResult = light.detect(495);
        checkMe(expectedResult, actualResult);
    }

    public void testItSelfYellow() {
        String expectedResult = "Yellow";
        String actualResult = light.detect(570);
        checkMe(expectedResult, actualResult);
    }

    public void testItSelfRed() {
        String expectedResult = "Red";
        String actualResult = light.detect(590);
        checkMe(expectedResult, actualResult);
    }

    public void testItSelfInvisible() {
        String expectedResult = "Invisible light";
        String actualResult = light.detect(666);
        checkMe(expectedResult, actualResult);
    }

    public void checkMe(String expectedResult, String actualResult) {
        if (actualResult.equals(expectedResult)) {
            System.out.println("Self-test for " + expectedResult + " passed");
        } else {
            System.out.println("Self-test for " + expectedResult + "FAILED!");
        }
    }
}
