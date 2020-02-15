package Human;

public class HumanDemo {
    public static void main(String[] args) {
        Human firstHuman = new Human("Jack", 25);
        Human secondHuman = new Human("Vika", 17);

        firstHuman.greet();
        secondHuman.greet();
    }
}
