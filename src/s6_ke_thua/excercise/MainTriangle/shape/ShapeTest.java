package excercise.MainTriangle.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("white", false);
        System.out.println(shape);
    }
}
