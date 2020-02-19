package by.javaguru.bean;

public class Dog {
    int age;
    String color, name;

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice(boolean actionVoice) {
        String txtVoice;
        if (actionVoice == true) {
            txtVoice = "Woof-woof";
        } else {
            txtVoice = "Nothing";
        }
        System.out.println("This dog named " + this.name + " and it says " + txtVoice);
    }

    public void eat(boolean actionEat) {
        String txtEat;
        if (actionEat == true) {
            txtEat = "eating now";
        } else {
            txtEat = "doesn't hungry";
        }
        System.out.println("This dog " + txtEat + " and it has a " + this.color + "wool. \nWhat a funny information :)");
    }

    public void sleep(boolean actionSleep) {
        String txtSleep;
        if (actionSleep == true) {
            txtSleep = "sleeping now. Because it " + this.age + " years old and very tired.";
        } else {
            txtSleep = "awake. Play whith " + this.name;
        }
        System.out.println("This dog " + txtSleep);
    }
}
