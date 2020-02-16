package com.vladis1350.dogList;

import com.vladis1350.bean.Dog;
import com.vladis1350.behavior.DogBehavior;

public class Sharik extends Dog implements DogBehavior  {

    public Sharik(int age, String color, String name) {
        super(age, color, name);
    }

    @Override
    public void voice() {
        System.out.println(getAge() + "Просится на прогулку.");
    }

    @Override
    public void eat() {
        System.out.println("Ест сардельку.");
    }

    @Override
    public void sleep() {
        System.out.println("Спит на диване лежа на пульте от телевизора.");
    }
}
