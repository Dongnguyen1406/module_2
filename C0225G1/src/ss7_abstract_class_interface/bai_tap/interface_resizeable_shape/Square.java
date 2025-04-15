package ss7_abstract_class_interface.bai_tap.interface_resizeable_shape;

public class Square extends Shape implements Resizeable {
    private double side = 1.0;
    public Square() {
        super();
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    public double getArea(){
        return side * side;
    }
    
    public double getPerimeter(){
        return side*4;
    }
    
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        double newSide = getSide() + getSide() * percent / 100;
        setSide(newSide);
    }
}
