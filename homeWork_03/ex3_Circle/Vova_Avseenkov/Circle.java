package by.javaguru.bean;

import static java.lang.Math.*;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = PI * Math.pow(radius, 2);
        return area;
    }
}
