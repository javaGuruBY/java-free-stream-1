package by.jrr;

import by.jrr.bean.Dog;
import by.jrr.Service.DogVoice;
import by.jrr.Service.DogSleep;
import by.jrr.Service.DogEat;



public class App {
    public static void main(String[] args){

        Dog dogOne=new Dog(11,"Black","Bim");
        DogEat dogEat=new DogEat();
        DogSleep dogSleep=new DogSleep();
        DogVoice dogVoice=new DogVoice();
        dogOne.information();
        dogEat.eat();
        dogSleep.sleep();
        dogVoice.voice();





    }
}
