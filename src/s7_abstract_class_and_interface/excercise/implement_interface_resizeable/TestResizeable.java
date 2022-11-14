package excercise.implement_interface_resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.2);
        shapes[1] = new Rectangle(2.2,2.2);
        shapes[2] = new Square(2.2);

        System.out.println("Before-resize");
        for (Shape shape: shapes){
            System.out.println(shape);
        }
        System.out.println("After-resize");
        for (Shape shape: shapes){
            double percent = (Math.ceil(Math.random()* (100 - 1 + 1 ) + 1));
            shape.resize(percent);
            System.out.println(shape + " with percent = " + percent);
        }

    }
}
