package by.jrr.detector;

public class LightColorDetector {

    public String detect(int wavelength) {
        if(wavelength < 380)
            return "Invisible Light";

        if(wavelength < 450) {
            return "Violet";
        } else if(wavelength < 495) {
            return "Blue";
        }
        else if(wavelength < 570) {
            return "Green";
        } else if(wavelength < 590) {
            return "Yellow";
        } else if(wavelength < 620) {
            return "Orange";
        } else if(wavelength < 750) {
            return "Red";
        }
        else return "Invisible Light";
    }
}
