package circle;

import circle.Circle;

/*
Author : Quy Vu
*/
public class Cylinder extends Circle {
    // private instance variable
    private double height;
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }
    @Override
    public double getArea() {
        return 2.0 * Math.PI * getRadius() * height;
    }
    @Override
    public String toString() {
        return "circle.Cylinder[height=" + height + "," + super.toString() + "]";
    }
}