package bai_tap.class_point2d_point3d;

public class Point3D extends Point2D{
    private float z;
    
    public Point3D(){
        super();
        this.z = 0.0f;
    }
    
    public Point3D(float x, float y, float z){
        super();
        this.z = z;
    }
    
    public float getZ(){
        return z;
    }
    
    public void setZ(float z){
        this.z = z;
    }
    
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z = z;
    }
    
    public float[] getXYZ(){
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
