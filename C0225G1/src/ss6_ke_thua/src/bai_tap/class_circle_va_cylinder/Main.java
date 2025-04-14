package bai_tap.class_circle_va_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "blue");
        System.out.println(circle);
        
        Cylinder cylinder = new Cylinder(2.0, "green", 5.0);
        System.out.println(cylinder);
        
        cylinder.setHeight(10.0);
        cylinder.setColor("yellow");
        System.out.printf("Updated Cylinder: " + cylinder);
    }
}
