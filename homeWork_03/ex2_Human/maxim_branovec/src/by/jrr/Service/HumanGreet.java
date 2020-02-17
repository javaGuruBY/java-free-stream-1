package by.jrr.Service;

import by.jrr.bean.Human;

public class HumanGreet {
    public void greet(Human human){
        System.out.println("Hi! My name is " +human.getName() +", I'm " +human.getAge() +" years old");
    }
}
