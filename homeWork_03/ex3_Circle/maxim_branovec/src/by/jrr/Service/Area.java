package by.jrr.Service;

import by.jrr.Bean.Circle;

public class Area {
    public void calculateArea(Circle circle){
        double calculaterArea = circle.getP() * Math.pow(circle.getRadius(),2);
        System.out.println("Площадь = " +calculaterArea);
    }
}
