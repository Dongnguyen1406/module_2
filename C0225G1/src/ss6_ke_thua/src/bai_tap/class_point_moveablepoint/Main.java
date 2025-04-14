package bai_tap.class_point_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new MovablePoint();
        MovablePoint movablePoint = new MovablePoint(2, 3);
        System.out.println("No move: " + movablePoint);
        movablePoint.move();
        System.out.println("Move first one: " + movablePoint);
        movablePoint.move().move();
        System.out.println(movablePoint);
    }
}
