package Dog;

public class DogDemo {

    public static void main(String[] args) {
        Dog firstDog = new Dog(12, "black", "Alex");
        Dog secondDog = new Dog(7, "orange", "Sherman");

        firstDog.eat();
        secondDog.voice();

        firstDog.sleep();
        secondDog.sleep();
    }
}
