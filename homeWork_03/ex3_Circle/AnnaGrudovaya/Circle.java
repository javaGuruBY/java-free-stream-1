package Circle;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println("Area of a circle = S=πr2 =" + radius*radius*3.14);
     }
}
