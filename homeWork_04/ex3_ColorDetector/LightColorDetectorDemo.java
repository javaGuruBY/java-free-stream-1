package ex3_ColorDetector;

import java.util.Scanner;

public class LightColorDetectorDemo {
    public static void main(String[] args) {
        LightColorDetector light = new LightColorDetector();
        Scanner input = new Scanner(System.in);
        System.out.print("Input wave length: ");
        System.out.println(light.detect(input.nextInt()));
    }
}
