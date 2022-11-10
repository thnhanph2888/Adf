package excercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    private Circle(double radius){
        this.radius = radius;
    }
     double getRadius(){
        return this.radius;
    }
    protected double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}
