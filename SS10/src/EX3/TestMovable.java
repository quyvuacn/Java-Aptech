package EX3;

/*
Author : Quy Vu
*/
public class TestMovable {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0,0,1,1);
        movablePoint.moveUp();
        System.out.println(movablePoint);

        MovableCircle movableCircle = new MovableCircle(0,0,2,2,5);
        movableCircle.moveLeft();
        System.out.println(movableCircle);
    }
}
