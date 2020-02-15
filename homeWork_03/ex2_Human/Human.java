public class Human {
    public String name;
    public int age;

    public Human() {
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void greet() {
        System.out.println("Hi! My name is " + getName() + ", I'm " + getAge() + " years old");
    }
}
