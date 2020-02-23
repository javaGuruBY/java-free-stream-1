package by.jrr.exr_1;

import by.jrr.exr_1.Service.SingComparator;

public class App {
    public static void main(String[] args) {
        SingComparator singComparator = new SingComparator();
        System.out.println(singComparator.compare(0));
        System.out.println(singComparator.compare(1));
        System.out.println(singComparator.compare(-1));
    }
}
