package bai_tap.class_point2d_point3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.5f, 4.0f);
        System.out.println(point2D);
        
        point2D.setXY(1.0f, 1.5f);
        System.out.println("Update Point2D: " + point2D );
        
        Point3D point3D = new Point3D(3.0f, 4.0f, 5.0f);
        System.out.println(point3D);
        System.out.println(point3D);
        
        point3D.setXYZ(7.0f, 8.0f, 9.0f);
        System.out.println("Update Point3D: " + point3D);
    }
}
