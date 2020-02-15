public class HumanDemo {
    public static void main(String[] args) {
        Human human1 = new Human();
        //human1.speak();
        human1.age = 20;
        human1.name = "Joun";
        Human human2 = new Human();
        //human1.speak();
        human2.age = 24;
        human2.name = "Tom";

        human1.greet();
        human2.greet();
    }
}