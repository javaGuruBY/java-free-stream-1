package ex1_SignComporator;

public class SignComporator {

    public String compare (int number) {
        if (number < 0) {
            return "Number is negative";
        } else if (number > 0) {
            return "Number is positive";
        } else if (number == 0) {
            return "Number is equals zero";
        } else {
            return "WTF is this?";
        }
    }
}
