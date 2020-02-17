package by.jrr.bean;

public class Circle {
    private double radius;
    private final double pi = 3.1415;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }
}
