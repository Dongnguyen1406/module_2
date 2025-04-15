package ss7_abstract_class_interface.bai_tap.interface_colorable_shape;

import ss7_abstract_class_interface.bai_tap.interface_resizeable_shape.Rectangle;

public class Square extends Shape implements Colorable {
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
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
