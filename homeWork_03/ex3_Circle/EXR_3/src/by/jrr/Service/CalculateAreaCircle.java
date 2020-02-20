package by.jrr.Service;

import by.jrr.bean.Circle;


public class CalculateAreaCircle {
    public double calculateArea(Circle circle) {
        return 3.1415 * circle.getRadius() *circle.getRadius();
    }
}
