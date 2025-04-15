package ss7_abstract_class_interface.bai_tap.interface_colorable_shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.0);
        shapes[1] = new Rectangle(3.0, 5.0);
        shapes[2] = new Square(6.0);
        
        for (Shape shape : shapes){
            if (shape instanceof Circle){
                System.out.println("Circle Area: " + ((Circle) shape).getArea());
            } else if(shape instanceof Rectangle){
                System.out.println("Rectangle Area: " + ((Rectangle) shape).getArea());
            } else if(shape instanceof Square){
                Colorable colorable = ((Square) shape);
                System.out.print("Square: ");
                colorable.howToColor();
            }
        }
    }
}
