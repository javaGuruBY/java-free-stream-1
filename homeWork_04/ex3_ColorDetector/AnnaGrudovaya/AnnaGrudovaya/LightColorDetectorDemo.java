package ColorDetector;

public class LightColorDetectorDemo {
    public static void main(String[] args) {
        LightColorDetector detector = new LightColorDetector();
        System.out.println("379 - " + detector.detect(379));
        System.out.println("751 - " + detector.detect(751));
        System.out.println("380 - " + detector.detect(380));
        System.out.println("494 - " + detector.detect(494));
        System.out.println("496 - " + detector.detect(496));
        System.out.println("588 - " + detector.detect(588));
        System.out.println("600 - " + detector.detect(600));
        System.out.println("620 - " + detector.detect(620));
        System.out.println("750 - " + detector.detect(750));
        System.out.println("751 - " + detector.detect(751));
    }
}
