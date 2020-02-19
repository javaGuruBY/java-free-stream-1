package by.javaguru.service;

import by.javaguru.bean.Human;

public class HumanDemo {
    public static void main(String[] args) {
        Human Konstantin = new Human("Kostya", 3);
        Human Volha = new Human("Olya", 25);
        Human Vova = new Human("Vovka", 29);
        Vova.greets();
        Volha.greets();
        Konstantin.greets();
    }
}
