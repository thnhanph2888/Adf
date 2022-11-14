package practice.implement_interface_colorable;

public class TestColorable {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(2.2,false);
        squares[1] = new Square(2.8, true);
        squares[2] = new Square(8.8, true);
        for (Square square : squares){
            System.out.println( "area = " + square.getArea());
            if (square.isColorable()){
                square.howToColor();
            } else {
                System.out.println(square.getClass() + " NOT colorable");
            }
            System.out.println("");
        }
    }
}
