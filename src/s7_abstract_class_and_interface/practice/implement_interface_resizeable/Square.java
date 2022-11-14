package practice.implement_interface_resizeable;

import java.awt.image.SampleModel;

public class Square extends Shape {
    private double side;

    public Square(){
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + this.getSide() + "}";
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + getSide() * percent/100);
    }
}
