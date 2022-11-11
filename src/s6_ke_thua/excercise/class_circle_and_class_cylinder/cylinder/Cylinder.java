package excercise.class_circle_and_class_cylinder.cylinder;

import excercise.class_circle_and_class_cylinder.circle.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", bottom area = " + super.getArea() +
                ", volume = " + getVolume() +
                '}';
    }
}
