package circle;

import circle.Circle;
import circle.Cylinder;

/*
Author : Quy Vu
*/
public class TestCylinder {
    public static void main(String[] args) {
        Circle cylinder = new Cylinder(20,10);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.toString());

    }
}
