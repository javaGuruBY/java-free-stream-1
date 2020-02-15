package by.jrr;

import by.jrr.bean.Circle;
import by.jrr.Service.Math;

public class App {
    public static void main(String[] args) {
        Circle circleOne = new Circle(5);
        Math result = new Math();
        result.sqr(circleOne);

    }
}
