package Dog;

public class Dog {
    int age;
    String color;
    String name;

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice(){
        System.out.println(this.name + " barks");
    }
    public void eat(){
        System.out.println(this.name + " hungry");

    }
    public void sleep() {
        System.out.println(this.name + " sleep");
        
    }

}
