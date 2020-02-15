package Circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(5);
        Circle secondCircle = new Circle(52.1234);

        firstCircle.calculateArea();
        secondCircle.calculateArea();
    }
}
