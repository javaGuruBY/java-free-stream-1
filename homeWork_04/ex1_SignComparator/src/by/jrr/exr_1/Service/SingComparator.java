package by.jrr.exr_1.Service;

public class SingComparator {
    public SingComparator() {
    }

    public String compare(int number) {
        if (number > 0) {
            return "Number is positive";
        } else {
            return number < 0 ? "Number is negative" : "number is equal to zero";
        }
    }
}

