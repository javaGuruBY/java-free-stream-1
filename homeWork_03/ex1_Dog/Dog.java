package by.jrr.dog;

public class Dog {
   int age;
   String color;
   String name;


    /*public boolean eat;
    public void (); {
    this.eat=true;
   }
    public boolean sleep;
*/

    public Dog(int age, String color, String name){
       this.age=age;
       this.color=color;
       this.name=name;
   }

    public void eat() {
        System.out.println("Dog " + name + ": Ham-ham");
    }
    public void sleep() {
             System.out.println("Dog " + name + ": Z-z-z");
         }
         public void voice() {
             System.out.println("Dog " + name + ": Gr-r-r");
         }

    public void printInformation1() {
        System.out.println("firstDog.age = " + this.age);
        System.out.println("firstDog.color = " + this.color);
        System.out.println("firstDog.name = " + this.name);

    }
    public void printInformation2() {
        System.out.println("secondDog.age = " + this.age);
        System.out.println("secondDog.color = " + this.color);
        System.out.println("secondDog.name = " + this.name);
    }
}
