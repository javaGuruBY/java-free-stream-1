package ex1_SignComporator;

import java.util.Scanner;

public class SignComporatorTest {
    SignComporator check = new SignComporator();

    public static void main(String[] args) {
        SignComporator check = new SignComporator();
        SignComporatorTest test = new SignComporatorTest();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        System.out.println(check.compare(number));
        test.selfTestPositiveNumber();
        test.selfTestNegativeNumber();
        test.selfTestZero();
    }

    public void selfTestPositiveNumber() {
        if (check.compare(5) == check.positive) {
            System.out.println("Positive self-test passed");
        } else {
            System.out.println("Self-test failed!");
        }
    }

    public void selfTestNegativeNumber() {
        if (check.compare(-5) == check.negative) {
            System.out.println("Negative self-test passed");
        } else {
            System.out.println("Self-test failed!");
        }
    }

    public void selfTestZero() {
        if (check.compare(0) == check.zero) {
            System.out.println("Zero self-test passed");
        } else {
            System.out.println("Self-test failed!");
        }
    }
}
