package excercise.MainTriangle.triangle;

import excercise.MainTriangle.shape.Shape;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getHalfPerimeter(){
        return (this.getSide1() + this.getSide2() + this.getSide3())/2;
    }
    public double getArea(){
        return Math.sqrt(this.getHalfPerimeter()*(this.getHalfPerimeter() - this.getSide1())
        * (this.getHalfPerimeter() - this.getSide2())
        * (this.getHalfPerimeter() - this.getSide3()));
    }
    public double getPerimeter(){
        return this.getHalfPerimeter() * 2;
    }

    @Override
    public String toString() {
        if (super.isFilled()){
            return "Triangle{" +
                    "side1=" + this.getSide1() +
                    ", side2=" + this.getSide2() +
                    ", side3=" + this.getSide3() +
                    ", area=" + this.getArea() +
                    ", perimeter=" + this.getPerimeter() +
                    ", color=" + super.getColor() +
                    ", is filled" +
                    '}';
        } else {
            return "Triangle{" +
                    "side1=" + this.getSide1() +
                    ", side2=" + this.getSide2() +
                    ", side3=" + this.getSide3() +
                    ", area=" + this.getArea() +
                    ", perimeter=" + this.getPerimeter() +
                    ", color=" + super.getColor() +
                    ", is NOT filled" +
                    '}';
        }

    }
}
