package by.jrr.dog;

public class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog(3, "white","Arny");

        Dog secondDog = new Dog(1, "Grey","Tom");

        firstDog.printInformation1();
        secondDog.printInformation2();
        firstDog.eat();
        secondDog.eat();
        firstDog.sleep();
        secondDog.sleep();
        firstDog.voice();
        secondDog.voice();

    }
}
