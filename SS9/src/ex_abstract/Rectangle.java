package ex_abstract;

/*
Author : Quy Vu
*/
public class Rectangle extends Shape {
    private int length,height;

    public Rectangle(String color, int length, int height) {
        super(color);
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length*height;
    }

    @Override
    public String toString() {
        return "ex_abstract.Rectangle{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}
