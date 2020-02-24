package Human;

public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hi, my name is " + this.name + ". I'm "+this.age + " years old.");
     }
}
