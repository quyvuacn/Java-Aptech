package ex_abstract;

/*
Author : Quy Vu
*/
public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "ex_abstract.Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
