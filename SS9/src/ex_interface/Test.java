package ex_interface;

/*
Author : Quy Vu
*/
public class Test {
    public static void main(String[] args) {
        Movable movable1 = new MovablePoint(2,3); //upcast
        System.out.println(movable1);
        movable1.moveUp();
        System.out.println(movable1);

        Movable movable2 = (Movable) movable1; //downcast
        System.out.println(movable2.MAX_HP);

    }


}
