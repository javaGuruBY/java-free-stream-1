package com.vladis1350;

import com.vladis1350.dogList.Barboss;
import com.vladis1350.dogList.Sharik;
/*16.02.2019*/
public class DogDemo {

    public static void main(String[] args) {
        Barboss barboss = new Barboss(2, "Black", "Barboss");
        System.out.println(barboss.toString());
        barboss.typicalDay();

        Sharik sharik = new Sharik(7, "Black and White", "Sharik");
        System.out.println("\n");
        System.out.println(sharik.toString());
        sharik.voice();
        sharik.eat();
        sharik.sleep();
        System.out.println("Birthday!");
        sharik.setAge(8);
        System.out.println(sharik.toString());
    }
}
