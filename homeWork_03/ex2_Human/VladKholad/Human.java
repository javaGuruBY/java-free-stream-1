public class Human {
    String name;
    int age;

    public Human() {

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("My name" + this.name + ", and i'am " + this.age + " years old");
    }
}
