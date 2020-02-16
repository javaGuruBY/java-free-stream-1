public class DogDemo {

    public static void main(String[] args) {
        Dog firstDog = new Dog(3, "green", "Shafka");
        Dog secondDog = new Dog(2, "orange", "Sharik");

        firstDog.eat();
        secondDog.voice();

        firstDog.sleep();
        secondDog.sleep();
    }
}
