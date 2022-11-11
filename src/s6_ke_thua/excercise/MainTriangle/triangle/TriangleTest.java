package excercise.MainTriangle.triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(6,8,10);
        System.out.println(triangle);
        triangle = new Triangle("Green",false,6,3, 3);
        System.out.println(triangle);
    }
}
