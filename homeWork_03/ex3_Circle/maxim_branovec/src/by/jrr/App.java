package by.jrr;

import by.jrr.Bean.Circle;
import by.jrr.Service.Area;


public class App {
    public static void main(String[] args) {

        Circle cir = new Circle(4);
        Area ary = new Area();
        ary.calculateArea(cir);


    }
}
