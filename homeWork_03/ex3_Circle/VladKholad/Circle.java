public class Circle {
    double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("The area of the circle is " + (this.radius * this.radius * 3.14));
    }
}
