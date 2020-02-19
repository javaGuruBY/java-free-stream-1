package by.javaguru.service;

import by.javaguru.bean.Dog;

import java.util.Random;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog(3, "black", "Killer");
        Dog dog2 = new Dog(5, "pink", "Fluffy unicorn");
        Dog dog3 = new Dog(15, "ginger", "Old Bobby");
        Random rdm = new Random();
        boolean randomBoolean = rdm.nextBoolean();
        dog2.voice(randomBoolean);
        dog1.eat(randomBoolean);
        dog3.sleep(randomBoolean);
    }
}
