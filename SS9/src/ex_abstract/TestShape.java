package ex_abstract;

/*
Author : Quy Vu
*/
public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle("red",10,20);
        System.out.println(shape1);
        System.out.println("Area is : "+ shape1.getArea());


        Shape shape2 = new Triangle("black",5,6);
        System.out.println(shape2);
        System.out.println("Area is : "+ shape2.getArea());


//        ex_abstract.Shape shape3 = new ex_abstract.Shape("red"); ERR

    }
}
