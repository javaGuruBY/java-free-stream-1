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
        System.out.println("Голос!");
    }

    public void eat() {
        System.out.println("Есть");
    }

    public void sleep() {
        System.out.println(" Спать!");
    }
}
