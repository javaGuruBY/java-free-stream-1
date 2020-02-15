package by.jrr;

import by.jrr.Service.HumanGreet;
import by.jrr.bean.Human;

public class App {
    public static void main(String[] args) {
        Human human = new Human(19,"Vovan");
        HumanGreet humanGreet = new HumanGreet();
        humanGreet.greet(human);
    }
}
