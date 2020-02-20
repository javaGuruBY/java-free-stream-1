package ex1_SignComporator;

import java.util.Scanner;

public class SignComporatorTest {
    public static void main(String[] args) {
        SignComporator check = new SignComporator();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        System.out.println(check.compare(number));
    }
}
