package by.javaguru.service;

import by.javaguru.bean.Circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle (5);
        System.out.println(circle.calculateArea());
    }
}
