package practice.implement_interface_colorable;

public class Square implements Colorable {
    private double side;
    private boolean colorable;

    public Square() {
    }

    public Square(double side, boolean colorable) {
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

    public double getArea(){
        return this.getSide() * this.getSide();
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides!");
    }
}
