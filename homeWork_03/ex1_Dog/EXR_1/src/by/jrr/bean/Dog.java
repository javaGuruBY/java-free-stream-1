package by.jrr.bean;

public class Dog {
    public int age;
    public String color;
    public String name;

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void information() {
        System.out.println("Age: " + this.age);
        System.out.println("Color: " + this.color);
        System.out.println("Name: " + this.name);
    }

}
