package excercise.class_circle_and_class_cylinder.cylinder;

import excercise.class_circle_and_class_cylinder.cylinder.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5.4);
        System.out.println(cylinder);
        cylinder = new Cylinder(5.6, 4.5, "yellow");
        System.out.println(cylinder);
    }
}
