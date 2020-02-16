package com.vladis1350;

import com.vladis1350.dogList.Barboss;
import com.vladis1350.dogList.Sharik;

public class DogDemo {

    public static void main(String[] args) {
        Barboss barboss = new Barboss(2, "Black", "Barboss");
        barboss.printInformation();
        barboss.typicalDay();

        Sharik sharik = new Sharik(7, "Black and White", "Sharik");
        System.out.println("\n");
        sharik.printInformation();
        sharik.voice();
        sharik.eat();
        sharik.sleep();
        System.out.println("Birthday!");
        sharik.setAge(8);
        sharik.printInformation();
    }
}
