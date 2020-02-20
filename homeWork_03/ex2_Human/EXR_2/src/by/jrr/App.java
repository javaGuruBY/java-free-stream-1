package by.jrr;

import by.jrr.bean.Human;
import by.jrr.Service.HumanGreet;

public class App {
    public static void main(String[] args) {
        Human human=new Human();
        human.setName("John");
        human.setAge(20);
        HumanGreet humanGreet=new HumanGreet();
        humanGreet.greet(human);


    }
}
