package by.jrr.service;


import by.jrr.bean.Dog;


public class ServiceVoice {

    public void voice(Dog dog) {
    if (dog.getAge() == 5) {
        System.out.println("Hello, My name is " + dog.getName() + " Yes, I'm " + dog.getAge());

    } else {
        System.out.println("Gav Gav, I'm " + dog.getAge() + " , i'm still very young!");

        }

    }
}
