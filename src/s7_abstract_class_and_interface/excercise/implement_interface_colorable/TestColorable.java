package excercise.implement_interface_colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.2,"black", false);
        shapes[1] = new Rectangle(2.8, 2.2,"purple",false);
        shapes[2] = new Square(8.8, true,"brown",true);
        for (Shape shape: shapes){
            if (shape instanceof Circle){
                System.out.println("Area: " +  ((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle){
                System.out.println("Area: " +  ((Rectangle) shape).getArea());
            }
            if (shape instanceof Square){
                System.out.println("Area: " +  ((Square) shape).getArea());
                if (((Square) shape).isColorable()){
                    ((Square) shape).howToColor();
                }

            }
        }
    }
}
