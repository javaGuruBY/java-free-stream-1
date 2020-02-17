package by.javaguru.bean;

public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greets() {
        System.out.println("Hello! I'm " + this.name + " and I " + this.age + " years old.");
    }
}
