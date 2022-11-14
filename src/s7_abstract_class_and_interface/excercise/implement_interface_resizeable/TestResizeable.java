package excercise.implement_interface_resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(92.2);
        shapes[1] = new Rectangle(90.2,50.2);
        shapes[2] = new Square(90.2);

        System.out.println("Before-resize");
        for (Shape shape: shapes){
            System.out.println(shape);
        }
        System.out.println("After-resize");
        for (Shape shape: shapes){
            double percent = (Math.ceil(Math.random()* (100 - 1 + 1 ) + 1));
            if (shape instanceof Circle){
                 ((Circle) shape).resize(percent);
                System.out.println(shape + " with percent = " + percent);
            }
            if (shape instanceof Rectangle){
                 ((Rectangle) shape).resize(percent);
                System.out.println(shape + " with percent = " + percent);
            }
            if (shape instanceof Square){
                 ((Square) shape).resize(percent);
                System.out.println(shape + " with percent = " + percent);
            }
        }

    }
}
