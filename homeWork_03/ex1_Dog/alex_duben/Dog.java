public class Dog {
    int age;
    String color;
    String name;


    Dog (){

    };

    Dog(int _age, String _name, String _color){
        this.name = _name;
        this.color = _color;
        this.age = _age;

    };

    void printName() {
        System.out.println(name+" :");
    }
    void voice(String word) {
        System.out.println("voice: "+word);
    }

    void eat() {
        System.out.println("eat: omnomnom");

    }

    void sleep() {
        System.out.println("sleep: zzzzz");

    }
}
