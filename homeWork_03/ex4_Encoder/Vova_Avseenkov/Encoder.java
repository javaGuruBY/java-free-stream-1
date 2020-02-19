package by.javaguru.bean;

import java.util.Scanner;

public class Encoder {
    Scanner in = new Scanner(System.in);

    public void encode() {
        System.out.print("Введите символ: ");
        String userStringInput = in.next();
        char userCharInput = userStringInput.charAt(0);
        System.out.println(userStringInput + " = " + (short) userCharInput);
    }

    public void decode() {
        System.out.print("Введите код: ");
        int userNumberInput = in.nextInt();
        System.out.println(userNumberInput + " = " + (char) userNumberInput);
    }
}
