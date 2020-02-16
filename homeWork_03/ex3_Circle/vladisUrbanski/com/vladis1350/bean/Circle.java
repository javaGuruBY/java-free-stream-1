package com.vladis1350.bean;

public class Circle {
    private double radius;
    final double PI = 3.14d;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return PI * Math.pow(getRadius(), 2); //Можно через Math.PI
    }
}
