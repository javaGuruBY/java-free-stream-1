package by.jrr.comparator;

public class SignComparator {
    public String compare(int number) {
        if (number > 0) {
            return "Number is positive";
        }
        else if (number == 0) {
            return "Number is equal to zero";
        }
        else {
            return "Number is negative";
        }
    }

    public String compare(double number) {
        if (number > 0) {
            return "Number is positive";
        }
        else if (number == 0) {
            return "Number is equal to zero";
        }
        else {
            return "Number is negative";
        }
    }
}

