public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog(8, "Tuzic","white");
        dog1.printName();
        dog1.eat();
        dog1.sleep();
        dog1.voice("miau");

        Dog dog2 = new Dog ();
        dog2.name = "Sharic";
        dog2.age = 13;
        dog2.color = "black";

        dog2.printName();
        dog2.sleep();
        dog2.eat();
        dog2.voice("gav");
    }

}

