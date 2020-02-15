package by.jrr;

import by.jrr.Bean.Dog;
import by.jrr.Service.Eaat;
import by.jrr.Service.Slipi;
import by.jrr.Service.Voic;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog(5,"black","Bat");
        Eaat dogEat = new Eaat();
        dogEat.eat(dog);
        Slipi dogSleep = new Slipi();
        dogSleep.sleep(dog);
        Voic dogVoice = new Voic();
        dogVoice.voice(dog);
    }
}
