package ex1_SignComporator;

import java.util.Scanner;

public class SignComporatorTest {
    SignComporator signComporator = new SignComporator();

    public static void main(String[] args) {
        SignComporator signComporator = new SignComporator();
        SignComporatorTest signComporatorTest = new SignComporatorTest();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        System.out.println(signComporator.compare(number));
        signComporatorTest.testZero();
        signComporatorTest.testNegative();
        signComporatorTest.testPositive();
    }

   public void selfTestCode (String expectedResult, String actualResult, String description) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(description + "passed");
        } else {
            System.out.println(description + "failed");
        }
   }

   public void testZero() {
        String expectedResult = signComporator.zero;
        String acutalResult = signComporator.compare(0);
        String description = "Test for 0 is ";
        selfTestCode(expectedResult, acutalResult, description);
   }

   public void testNegative() {
        String expectedResult = signComporator.negative;
        String actualResult = signComporator.compare(-1);
        String description = "Test for negative number is ";
        selfTestCode(expectedResult, actualResult, description);
   }

   public void testPositive() {
        String expectedResult = signComporator.positive;
        String actualResult = signComporator.compare(1);
        String description = "Test for positive number is ";
        selfTestCode(expectedResult, actualResult, description);
   }
}
