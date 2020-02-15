package by.jrr;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 2;
        double p1 = circle.calculateArea();
        System.out.println(" When radius length is " + circle.radius + " calculateArea = "+ circle.calculateArea() );
    }
}
