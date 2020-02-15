package by.jrr.Service;

import by.jrr.bean.Circle;

public class Math {
    public void sqr(Circle circle) {
        final double pi = 3.14;
        double sum = pi*(circle.getRadius()^2);
        System.out.println(sum);
    }
}
