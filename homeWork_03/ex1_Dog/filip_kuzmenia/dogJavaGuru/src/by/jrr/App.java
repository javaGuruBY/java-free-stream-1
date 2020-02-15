package by.jrr;

import by.jrr.Service.DogEat;
import by.jrr.Service.DogSleep;
import by.jrr.Service.DogVoice;
import by.jrr.bean.Dog;

public class App {
    public static void main(String[] args) {
        Dog myPet = new Dog("Шарик","Черный",2);
        DogVoice dogVoice = new DogVoice();
        DogEat dogEat = new DogEat();
        DogSleep dogSleep = new DogSleep();
        dogVoice.voice(myPet);
        dogEat.eat(myPet);
        dogSleep.sleep(myPet);
    }
}
