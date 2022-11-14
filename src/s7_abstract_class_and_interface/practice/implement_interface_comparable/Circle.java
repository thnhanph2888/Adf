package practice.implement_interface_comparable;

public class Circle {
    private double radius = 1.0;
    private String color = "black";
    private boolean filled = true;
    public Circle (){
    }
    public Circle (double radius){
        this.radius = radius;
    }
  public Circle (double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                '}';
    }
}
