package Ex2;

import java.util.Arrays;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(1, 2, 3, 4);
        System.out.println(l1);
        Line l2 = new Line(new Point(5,6), new Point(7,8));
        System.out.println(l2);



        l1.setBegin(new Point(11, 12));
        l1.setEnd(new Point(13, 14));
        System.out.println(l1);

        System.out.println("begin is: " + l1.getBegin());
        //begin is: (11,12)
        System.out.println("end is: " + l1.getEnd());
        //end is: (13,14)

        l1.setBeginX(21);
        l1.setBeginY(22);
        l1.setEndX(23);
        l1.setEndY(24);
        System.out.println(l1);

        System.out.println("begin's x is: " + l1.getBeginX());

        System.out.println("begin's y is: " + l1.getBeginY());

        System.out.println("end's x is: " + l1.getEndX());

        System.out.println("end's y is: " + l1.getEndY());

        l1.setBeginXY(0, 31);
        l1.setEndXY(0, 34);

        l2.setBeginXY(0, 32);
        l2.setEndXY(33, 0);
        System.out.println(l1);

        System.out.println("begin's x and y are: " + Arrays.toString(l1.getBeginXY()));

        System.out.println("end's x and y are: " + Arrays.toString(l1.getEndXY()));

        System.out.printf("length is: %.2f%n", l1.getLength());
        //Check 2 dg có cat nhau ko
        System.out.println(l1.intersects(l2));
        System.out.println(l1.distance(31,0));


    }
}