package ss7_abstract_class_interface.bai_tap.interface_resizeable_shape;

public class ResizeableTest {
    public static void main(String[] args) {
        double percent = (int) (Math.random() * 100 + 1);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.0);
        shapes[1] = new Rectangle(3.0, 5.0);
        shapes[2] = new Square(6.0);

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Before resize: Circle area: " + ((Circle) shape).getArea());
                System.out.println("Percent: " + percent);
                ((Circle) shape).resize(percent);
                System.out.println("After resize: Circle area: " + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("Before resize: Rectangle area: " + ((Rectangle) shape).getArea());
                System.out.println("Percent: " + percent);
                ((Rectangle) shape).resize(percent);
                System.out.println("After resize: Rectangle area: " + ((Rectangle) shape).getArea());
            } else if (shape instanceof Square) {
                System.out.println("Before resize: Square area: " + ((Square) shape).getArea());
                System.out.println("Percent: " + percent);
                ((Square) shape).resize(percent);
                System.out.println("After resize: Square area: " + ((Square) shape).getArea());
            }
            System.out.println();
        }
        
    }
}

