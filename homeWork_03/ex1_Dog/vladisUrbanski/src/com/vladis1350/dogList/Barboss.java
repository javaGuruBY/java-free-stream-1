package com.vladis1350.dogList;

import com.vladis1350.bean.Dog;
import com.vladis1350.behavior.DogBehavior;

public class Barboss extends Dog implements DogBehavior {

    private int age;
    private String color;
    private String name;

    public Barboss(int age, String color, String name) {
        super(age, color, name);
    }

    @Override
    public void voice() {
        System.out.println("Лает! Покормить просит.");
    }

    @Override
    public void eat() {
        System.out.println("Чавкает от удовольствия вкушая пищу.");
    }

    @Override
    public void sleep() {
        System.out.println("Храпит набив брюхо.");
    }

    public void typicalDay(){
        voice();
        eat();
        sleep();
    }
}
