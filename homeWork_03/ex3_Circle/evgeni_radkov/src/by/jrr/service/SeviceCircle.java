package by.jrr.service;

import by.jrr.bean.Circle;

public class SeviceCircle {

    public void sqr(Circle circle) {

        double calculateArea = circle.getPi() * Math.pow(circle.getRadius(), 2);
        System.out.println("Площадь круга равна " + calculateArea);

    }


}
