package bai4;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(5,10,15,20);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
