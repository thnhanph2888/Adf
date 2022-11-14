package excercise.implement_interface_colorable;

public class Square extends Shape implements Colorable {
    private double side;
    private boolean colorable;

    public Square() {
    }

    public Square(double side, boolean colorable, String color, boolean filled) {
        super(color, filled);
        this.side = side;
        this.colorable = colorable;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public boolean isColorable() {
        return colorable;
    }

    public void setColorable(boolean colorable) {
        this.colorable = colorable;
    }

    public double getArea() {
        return this.getSide() * this.getSide();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", colorable=" + colorable +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides!");
    }
}
