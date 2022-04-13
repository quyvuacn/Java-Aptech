package circle;

/*
Author : Quy Vu
*/
public class Circle {
    // private instance variable
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public String toString() {
        return "circle.Circle[radius=" + radius + "]";
    }
}