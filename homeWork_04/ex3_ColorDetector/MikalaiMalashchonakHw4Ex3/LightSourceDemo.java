package com.javaguru.HomeWork4.hw4ex3;

public class LightSourceDemo {
    public static void main(String[] args) {
        {
            LightColorDetector demoLightSource = new LightColorDetector();
            System.out.println("325 nm wavelength light color is " + demoLightSource.detect(325));
            System.out.println("385 nm wavelength light color is " + demoLightSource.detect(385));
            System.out.println("453 nm wavelength light color is " + demoLightSource.detect(453));
            System.out.println("500 nm wavelength light color is " + demoLightSource.detect(500));
            System.out.println("580 nm wavelength light color is " + demoLightSource.detect(580));
            System.out.println("600 nm wavelength light color is " + demoLightSource.detect(600));
            System.out.println("650 nm wavelength light color is " + demoLightSource.detect(650));

        }
    }
}
