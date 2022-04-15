package ex_abstract;

import ex_abstract.Shape;

/*
Author : Quy Vu
*/
public class Triangle extends Shape {
    private int base,height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }


    @Override
    public double getArea() {
        return 1/2*base*height;
    }

    @Override
    public String toString() {
        return "ex_abstract.Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
