public class Dog {
    int age;
    String color;
    String name;

    public Dog() {

    }

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice() {
        System.out.println("Gaw!");
    }

    public void eat() {
        System.out.println("Chafk");
    }

    public void sleep() {
        System.out.println(name + " go to the sleep!");
    }
}
