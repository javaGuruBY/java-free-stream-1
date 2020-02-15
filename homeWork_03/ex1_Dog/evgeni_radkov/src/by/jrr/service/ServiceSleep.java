package by.jrr.service;

import by.jrr.bean.Dog;

public class ServiceSleep {

    public void sleep(Dog dog){

        System.out.println("I am " + dog.getAge() + " years old and I don't want sleep");
    }

}
