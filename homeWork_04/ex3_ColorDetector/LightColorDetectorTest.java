package ex3_ColorDetector;

public class LightColorDetectorTest {
    public void testItSelf() {
        LightColorDetector detect = new LightColorDetector();
        if (detect.detect(400) == "Violet" && detect.detect(500) == "Green") {
            System.out.println("\nSelf-test passed");
        } else {
            System.out.println("\nSelf-test failed");
        }
    }
}
