package com.vladis1350;

import com.vladis1350.bean.Circle;

public class CircleDemo {
    public static void main(String[] args) {
        double areaCircle;

        Circle circle1 = new Circle(15);
        areaCircle = circle1.calculateArea();
        System.out.println("Площать круга r=" + circle1.getRadius() + " равна " + areaCircle);

        Circle circle2 = new Circle(17);
        areaCircle = circle2.calculateArea();
        System.out.println("Площать круга r=" + circle2.getRadius() + " равна " + areaCircle);

        Circle circle3 = new Circle(22);
        areaCircle = circle3.calculateArea();
        System.out.println("Площать круга r=" + circle3.getRadius() + " равна " + areaCircle);
        circle3.setRadius(11);
        areaCircle = circle3.calculateArea();
        System.out.println("Площать круга r=" + circle3.getRadius() + " равна " + areaCircle);

    }
}
