package by.jrr;

import by.jrr.Service.CalculateAreaCircle;
import by.jrr.bean.Circle;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle();
        CalculateAreaCircle calculateAreaCircle = new CalculateAreaCircle();
        circle.setRadius(2.00);


        System.out.println("S circle when radius is " + circle.radius + " = " + calculateAreaCircle.calculateArea(circle));
    }
}
