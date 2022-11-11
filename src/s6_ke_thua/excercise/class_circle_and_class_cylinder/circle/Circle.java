package excercise.class_circle_and_class_cylinder.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "black";

    public Circle (){
    }
    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                ", color = '" + color + "'" +
                '}';
    }
}
